import { Injectable } from '@angular/core';
import { environment } from '../../environments/environment';
import { HttpClient,HttpHeaders, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs/Observable'; 
import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/map';
import 'rxjs/add/observable/throw';

@Injectable()
export class WeatherTemperatureClient{
	readonly token = environment.openweather.apitoken;
	readonly url = 'https://api.openweathermap.org/data/2.5/weather';


	constructor(private http: HttpClient) {
	}
	
 getTemperature(data: any){
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
		else {
		let params = new HttpParams().set('q', data.result.parameters.location.city);
		params = params.set('APPID', this.token);
		return this.http.get(this.url, { params: params })
	    .catch((err: Response|any)=>{
		return Observable.throw(err.statusText);
	    });
		}
		
	
	} 
	

}