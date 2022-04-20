import { Component, OnInit } from '@angular/core';
import { ApplicantService } from '../applicant.service';
import { Address } from '../applicant/Address';
import { Applicant } from '../applicant/Applicant';

@Component({
  selector: 'app-apply',
  templateUrl: './apply.component.html',
  styleUrls: ['./apply.component.css']
})
export class ApplyComponent implements OnInit {

  applicant: Applicant = new Applicant();
  address1: Address= new Address();
  address2: Address= new Address();

  constructor(private applicantServiceObj: ApplicantService) { }

  ngOnInit(): void {
  }

  msg:any="";

  applyForBankAccount() {
    this.address1.addresstype='Home';
    this.address2.addresstype='Office';

    this.applicant.addressList.push(this.address1);
    this.applicant.addressList.push(this.address2);
    console.log('applyforBankAccount() is invoking... the service...');

    //this object is filled up the HTML page
  
    this.applicantServiceObj.addApplicantService(this.applicant).subscribe(
      (data:any) => {
        this.msg = data;
        console.log(data);
        console.log(this.msg);
      }, 
      (err) => {
        console.log(err);
      }
    )

  }
}
