import { Component, OnInit } from '@angular/core';
import { ApplicantService } from '../applicant.service';
import { Applicant } from './Applicant';

@Component({
  selector: 'app-applicant',
  templateUrl: './applicant.component.html',
  styleUrls: ['./applicant.component.css']
})
export class ApplicantComponent implements OnInit {

  applicantArray: Applicant[]=[];

  constructor(private applicantServiceObj: ApplicantService) { }

  ngOnInit(): void {
    this.showAllApplicants();
  }

  showAllApplicants() {
    console.log('showAllApplicants() is invoking....loadAllApplicantService() method....')
    
    this.applicantServiceObj.loadAllApplicantsService().subscribe(
      (data:Applicant[]) => {
        this.applicantArray = data;
      },
      (err) => {
        console.log(err);
      }
    )
  }
}
