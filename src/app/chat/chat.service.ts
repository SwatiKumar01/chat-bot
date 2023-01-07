import { Injectable } from '@angular/core';
import { environment } from '../../environments/environment';

import { ApiAiClient } from 'api-ai-javascript';
import { Zip} from './Zip'
import { Observable } from 'rxjs/Observable';
import { BehaviorSubject } from 'rxjs/BehaviorSubject'; 
import { HttpClient,HttpHeaders } from '@angular/common/http';
import { forecast } from './forecast';
import { WeatherClient} from './WeatherClient'
 import { WeatherTemperatureClient} from './WeatherTemperatureClient'

export class Message {
  constructor(public content: string, public sentBy: string) {}
}


@Injectable()
export class ChatService {

  readonly token = environment.dialogflow.angularBot;
  readonly client = new ApiAiClient({ accessToken: this.token });


  conversation = new BehaviorSubject<Message[]>([]);


  constructor(private http: HttpClient , private weather : WeatherClient, private temperature : WeatherTemperatureClient, private forecast : forecast, private zip : Zip) {}

  // Sends and receives messages via DialogFlow
  converse(msg: string) {
    const userMessage = new Message(msg, 'user');
    this.update(userMessage);

    return this.client.textRequest(msg)
               .then(res => {
                  const speech = res.result.fulfillment.speech;
                  console.log(res);
	//Translation
                  if(speech == 'WebHook' && res.result.action == 'translate.text'){
					var url = 'http://localhost:8081/va/translationApi/translate';
					var parameters =  res.result["parameters"]
					console.log(parameters);
					var data = '?text='+encodeURI(parameters["text"])+'&fromLang='+encodeURI(parameters["lang-from"])+'&toLang='+encodeURI(parameters["lang-to"]);
					url = url + data;
                    this.http.get(url, {headers: new HttpHeaders({ 
																'Access-Control-Allow-Origin':'*',
																'Authorization':'authkey',
																'userid':'1'
															  })
                  }).subscribe(data => {
                      console.log(data); 
									var messageString = '';
									
									messageString += 'Translated Text: ' + data['targetText'];
									
									if (messageString == 'null')
									{
										const botMessage = new Message('cannot translate', 'bot');
									
										  this.update(botMessage);
									}
									else 
									{
										const botMessage = new Message(messageString, 'bot');
									
											  this.update(botMessage);
										
									}
						 
					
                    }, error => {
						console.log('oops', error);
						if(error['status'] == 417){
							const botMessage = new Message(error['error'], 'bot');
							this.update(botMessage);
						} else{
							const botMessage = new Message('Some error occurred.', 'bot');
							this.update(botMessage);
						}
					});
                  } 
				  //calories
				 else if(speech == 'WebHook' && res.result.action == 'calories'){
					 
					var url = 'http://localhost:8081/va/calories/category';
					var parameters =  res.result["parameters"]
					console.log(parameters);
					var data = '?food='+encodeURI(parameters["food"]);
					url = url + data;
                    this.http.get(url, {headers: new HttpHeaders({ 
																'Access-Control-Allow-Origin':'*',
																'Authorization':'authkey',
																'userid':'1'
															  })
                  }).subscribe(data => {
                      console.log(data); 
									var messageString = '';
									
									messageString += data['measure']+ ' of '+data['foodCategories']+ ' contains ' + data['calories']+' Calories' ;
									
									
										const botMessage = new Message(messageString, 'bot');
									
											  this.update(botMessage);
										
									
						 
					
                    }, error => {
						console.log('oops', error);
						if(error['status'] == 417){
							const botMessage = new Message(error['error'], 'bot');
							this.update(botMessage);
						} else{
							const botMessage = new Message('This product is not available in our project ', 'bot');
							this.update(botMessage);
						}
					});
                  }  
				  //weather
				  else if(speech == 'WebHook' && res.result.action == 'weather'){
					  this.weather.getWeather(res)
						.subscribe(
								data=> {
									console.log(data); 
									var messageString = '';
									
									messageString += 'Weather : ' + data.weather[0].main;
									messageString += '<br>';
									messageString += 'Description : ' + data.weather[0].description /* +data.weather[0].icon */ ;
									messageString += '<br>';
									messageString += 'Temperature : ' + (data.main.temp - 273.15)+'°C' ;
									messageString += '<br>';
									messageString += 'Humidity  : ' + data.main.humidity +'%';
									messageString += '<br>';
									messageString += 'Max Temp : ' + (data.main.temp_max  - 273.15)+'°C';
									messageString += '<br>';
									messageString += 'Min Temp : ' + (data.main.temp_min - 273.15)+'°C';
									messageString += '<br>';
									messageString += 'Speed of wind : ' + data.wind.speed + 'm/s';
									messageString += '<br>';
									messageString += 'clouds ' + data.clouds.all+'%';
									
									
									const botMessage = new Message(messageString, 'bot');
									this.update(botMessage); 
							}, error => {
						console.log('oops', error);
						if(error['status'] == 417){
							const botMessage = new Message(error['error'], 'bot');
							this.update(botMessage);
						} else{
							const botMessage = new Message('Check Your question.', 'bot');
							this.update(botMessage);
						}
							});
					  
					  
				  } 				
//forecast				  
				  else if(speech == 'WebHook' && res.result.action == 'forecast'){
					  this.forecast.getforecast(res).subscribe
					  (
					 data=> {
									console.log(data); 
									var messageString = '';
									messageString += 'Todays Prediction'
										 messageString += '<br>';
									messageString += 'Weather : ' + data.list[0].weather[0].main;
									 messageString += '<br>';
									messageString += 'Description : ' + data.list[0].weather[0].description ;
									messageString += '<br>';
									messageString += 'Temperature : ' + (data.list[0].main.temp - 273.15)+'°C' ;
									messageString += '<br>';
									messageString += 'Humidity  is ' + data.list[0].main.humidity +'%';
									messageString += '<br>';
									messageString += 'Max Temp : ' + (data.list[0].main.temp_max - 273.15) +'°C';
									messageString += '<br>';
									messageString += 'Min Temp : ' + (data.list[0].main.temp_min- 273.15)+'°C';
										 messageString += '<br>';	 messageString += '<br>';
										 messageString += 'Tomorrows Prediction'
										 messageString += '<br>';
									messageString += 'Weather : ' + data.list[8].weather[0].main;
									 messageString += '<br>';
									messageString += 'Description : ' + data.list[8].weather[0].description ;
									messageString += '<br>';
									messageString += 'Temperature : ' + (data.list[8].main.temp - 273.15)+'°C' ;
									messageString += '<br>';
									messageString += 'Humidity  is ' + data.list[8].main.humidity +'%';
									messageString += '<br>';
									messageString += 'Max Temp : ' + (data.list[8].main.temp_max - 273.15) +'°C';
									messageString += '<br>';
									messageString += 'Min Temp : ' + (data.list[0].main.temp_min- 273.15)+'°C';
									 messageString += '<br>';	 messageString += '<br>';
										 messageString += 'Day After Tomorrows Prediction'
										 messageString += '<br>';
									messageString += 'Weather : ' + data.list[16].weather[0].main;
									 messageString += '<br>';
									messageString += 'Description : ' + data.list[16].weather[0].description ;
									messageString += '<br>';
									messageString += 'Temperature : ' + (data.list[16].main.temp - 273.15)+'°C' ;
									messageString += '<br>';
									messageString += 'Humidity  is ' + data.list[16].main.humidity +'%';
									messageString += '<br>';
									messageString += 'Max Temp : ' + (data.list[16].main.temp_max - 273.15) +'°C';
									messageString += '<br>';
									messageString += 'Min Temp : ' + (data.list[16].main.temp_min- 273.15)+'°C';
									
									const botMessage = new Message(messageString, 'bot');
									this.update(botMessage); 
									}, error => {
						console.log('oops', error);
						if(error['status'] == 417){
							const botMessage = new Message(error['error'], 'bot');
							this.update(botMessage);
						} else{
							const botMessage = new Message('Check Your question.', 'bot');
							this.update(botMessage);
						}
									});
					  
					  //zip
				  } else if(speech == 'WebHook' && res.result.action == 'zip'){
					  this.zip.getWeather(res).subscribe(data=> {console.log(data); 
									var messageString = '';
									messageString += 'Weather : ' + data.weather[0].main;
									messageString += '<br>';
									messageString += 'Description : ' + data.weather[0].description /* +data.weather[0].icon */ ;
									messageString += '<br>';
									messageString += 'Temperature : ' + (data.main.temp - 273.15)+'°C' ;
									messageString += '<br>';
									messageString += 'Humidity  is ' + data.main.humidity +'%';
									messageString += '<br>';
									messageString += 'Max Temp : ' + (data.main.temp_max - 273.15) +'°C';
									messageString += '<br>';
									messageString += 'Min Temp : ' + (data.main.temp_min - 273.15)+'°C';
									messageString += '<br>';
									messageString += 'Speed : ' + data.wind.speed+'m/s';
									messageString += '<br>';
									messageString += 'clouds ' + data.clouds.all+'%';
									const botMessage = new Message(messageString, 'bot');
									this.update(botMessage); 
									},
										 error => {
						console.log('oops', error);
						if(error['status'] == 417){
							const botMessage = new Message(error['error'], 'bot');
							this.update(botMessage);
						} else{
							const botMessage = new Message('Check Your question.', 'bot');
							this.update(botMessage);
						}
									});
					  
					  //temperature
				  } 
				  else if(speech == 'WebHook' && res.result.action == 'weather.temperature'){
					  this.temperature.getTemperature(res).subscribe
					  ( data=> {
									console.log(data); 
									var messageString = '';
									
									messageString += 'Temperature : ' + (data.main.temp - 273.15)+'°C' ;
									messageString += '<br>';
									messageString += 'Humidity  is ' + data.main.humidity +'%';
									messageString += '<br>';
									messageString += 'Max Temp : ' + (data.main.temp_max - 273.15) +'°C';
									messageString += '<br>';
									messageString += 'Min Temp : ' + (data.main.temp_min - 273.15)+'°C';
							/* 		messageString += '<br>';
									messageString += 'Speed : ' + data.wind.speed+'m/s'; */
									const botMessage = new Message(messageString, 'bot');
									this.update(botMessage); 
									}, error => {
						console.log('oops', error);
						if(error['status'] == 417){
							const botMessage = new Message(error['error'], 'bot');
							this.update(botMessage);
						} else{
							const botMessage = new Message('Check Your question.', 'bot');
							this.update(botMessage);
						}
									});

				  } 
/*  else if(speech == 'WebHook' && res.result.action == 'calories'){
					  this.calories.getCalories(res).subscribe
					  ( data=> {
									console.log(data); 
									var messageString = '';
									
									messageString += 'Temperature : ' + (data.main.temp - 273.15)+'°C' ;
									messageString += '<br>';
									messageString += 'Humidity  is ' + data.main.humidity +'%';
									messageString += '<br>';
									messageString += 'Max Temp : ' + (data.main.temp_max - 273.15) +'°C';
									messageString += '<br>';
									messageString += 'Max Temp : ' + (data.main.temp_min - 273.15)+'°C';
							/* 		messageString += '<br>';
									messageString += 'Speed : ' + data.wind.speed+'m/s'; 
									const botMessage = new Message(messageString, 'bot');
									this.update(botMessage); 
									}, error => {
						console.log('oops', error);
						if(error['status'] == 417){
							const botMessage = new Message(error['error'], 'bot');
							this.update(botMessage);
						} else{
							const botMessage = new Message('Check Your question.', 'bot');
							this.update(botMessage);
						}
									});

				  } */
				  else
				  {
					  const botMessage = new Message(speech, 'bot');
					  this.update(botMessage);
				  }
               });
  }



  // Adds message to source
  update(msg: Message) {
    this.conversation.next([msg]);
  }

}
