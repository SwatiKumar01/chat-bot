import { Injectable } from '@angular/core';
import { environment } from '../../environments/environment';
import { HttpClient,HttpHeaders, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs/Observable'; 
import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/map';
import 'rxjs/add/observable/throw';

import { ApiAiClient } from 'api-ai-javascript';
import { BehaviorSubject } from 'rxjs/BehaviorSubject'; 

@Injectable()
export class WeatherClient{
	readonly token = environment.openweather.apitoken;
	readonly url = 'https://api.openweathermap.org/data/2.5/weather';
	readonly url2 = 'https://api.openweathermap.org/data/2.5/forecast';

	constructor(private http: HttpClient) {
	}
	
 getWeather(data: any){
		console.log('inside get weather');
		console.log(data.result.parameters.location.city);
		
		
		if(data.result.parameters.location.city == undefined){
			let params = new HttpParams().set('q', data.result.parameters.location['admin-area']);
		params = params.set('APPID', this.token);
		return this.http.get(this.url, { params: params })
	    .catch((err: Response|any)=>{
		return Observable.throw(err.statusText);

	    });
		}
		
		else{
		let params = new HttpParams().set('q', data.result.parameters.location.city);
		/* if(data.result.parameters.location.zip-code == undefined){
			this.getforecast(data);
		} */
		
		params = params.set('APPID', this.token);
		return this.http.get(this.url, { params: params })
	    .catch((err: Response|any)=>{
		return Observable.throw(err.statusText);

	    });
		}
	
	}  
	
	 /* getWeather(data: any){
		console.log('inside get weather');
		console.log(data);
		
		
		let params = new HttpParams().set('zip', data.result.parameters['zip-code']+'');
		params = params.set('APPID', this.token);
		return this.http.get(this.url, { params: params })
	    .catch((err: Response|any)=>{
		return Observable.throw(err.statusText);

	    });
		
	
	}  */
/* /*   getforecast(data: any){
		console.log('inside get forecast');
		console.log(data.result.parameters.location.zip-code);
		if(data.result.parameters.location.zip-code == ''){}
		let params = new HttpParams().set('q', data.result.parameters.location.zip-code);
		params = params.set('APPID', this.token);
		return this.http.get(this.url, { params: params })
	    .catch((err: Response|any)=>{
		return Observable.throw(err.statusText);

	    }); 
		
	
	}  */ 
	
/* 	getWeather(data: any){
		console.log('inside get weather');
		console.log(data.result.parameters.location.zip-code);
		let params = new HttpParams().set('zip', data.result.parameters.location.zip-code);
		params = params.set('APPID', this.token);
		return this.http.get(this.url, { params: params })
	    .catch((err: Response|any)=>{
		return Observable.throw(err.statusText);
	    });
	 */
	
}