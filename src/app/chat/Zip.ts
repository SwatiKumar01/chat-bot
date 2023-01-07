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
export class Zip{
	readonly token = environment.openweather.apitoken;
	readonly url = 'https://api.openweathermap.org/data/2.5/weather';
	
	constructor(private http: HttpClient) {
	}
	
 	 getWeather(data: any){
		console.log('inside get Zip');
		console.log(data);
		
		
		let params = new HttpParams().set('zip', data.result.parameters['zip-code']+',in');
		params = params.set('APPID', this.token);
		return this.http.get(this.url, { params: params })
	    .catch((err: Response|any)=>{
		return Observable.throw(err.statusText);

	    });
	 }
	
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