import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { CurrencyConverterService } from './currency-converter.service';
import { UserDetails } from './user-details/UserDetails';

@Injectable({
  providedIn: 'root'
})
export class UserDetailsService {

  constructor(private myHttp: HttpClient, private ccs: CurrencyConverterService) { }

  fetchUserDetailsService(userid : number) : Observable<UserDetails> {
    return this.myHttp.get<UserDetails>("https://jsonplaceholder.typicode.com/users/"+userid);
  }
  fetchAllUsersDetailsService() : Observable<UserDetails[]> {
    return this.myHttp.get<UserDetails[]>("https://jsonplaceholder.typicode.com/users/");
  }

  // fetchAllApplicantsService() : Observable<Applicant[]> {
    
  //   return this.myHttp.get<Applicant[]>("http://localhost:8080/applicants/getAllApplicants");
  // }
}
