import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Applicant } from './applicant/Applicant';

@Injectable({
  providedIn: 'root'
})
export class ApplicantService {

  baseURL='http://localhost:8080/applicants';

  constructor(private myHttp: HttpClient) { }

  loadAllApplicantsService() : Observable<Applicant[]> {
    console.log('loadAllApplicantService() is loading data from spring controller.....');
    return this.myHttp.get<Applicant[]>(this.baseURL+'/getApplicants');
  }

}
