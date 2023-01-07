/* import { Injectable } from '@angular/core';
import { environment } from '../../environments/environment';
import { HttpClient,HttpHeaders, HttpParams } from '@angular/common/http';
import { Observable } from 'rxjs/Observable'; 
import 'rxjs/add/operator/catch';
import 'rxjs/add/operator/map';
import 'rxjs/add/observable/throw';

import { ApiAiClient } from 'api-ai-javascript';
import { BehaviorSubject } from 'rxjs/BehaviorSubject'; 

@Injectable()
export class calories{
	readonly token = environment.Calories.Caloriesapi;
	readonly url = 'https://api.openweathermap.org/data/2.5/forecast';

	constructor(private http: HttpClient) {
	}
	
getcalories(data: any){
		console.log('inside get calories');
		console.log(data.result.parameters.location.city);
		let params = new HttpParams().set('q', data.result.parameters.location.city);
		params = params.set('APPID', this.token);
		return this.http.get(this.url, { params: params })
	    .catch((err: Response|any)=>{
		return Observable.throw(err.statusText);

	    });
		
		
	
	} 

	} 
	
	 */
	
	
	
