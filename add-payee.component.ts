import { Component, OnInit } from '@angular/core';
import { Payee } from './Payee';

@Component({
  selector: 'app-add-payee',
  templateUrl: './add-payee.component.html',
  styleUrls: ['./add-payee.component.css']
})
export class AddPayeeComponent implements OnInit {
  payeeObj: Payee = new Payee();
  tempPayeeAccountNumber: number=0;  errMsg: string="";

  payeeArray: Payee[] = [
    {
      payeeAccountNumber:123123123123,payeeName:"Jack Stallman",payeeIFSCCode:"SBI00000062",payeeNickName:"Jacky"
    },
    {
      payeeAccountNumber:456456456456,payeeName:"Janet Gates",payeeIFSCCode:"SBI00000020",payeeNickName:"Jannie"
    },
    {
      payeeAccountNumber:783978397839,payeeName:"Julie Barboz",payeeIFSCCode:"SBI00000019",payeeNickName:"Jul"
    },
    {
      payeeAccountNumber:456456123123,payeeName:"Jane Bonanza",payeeIFSCCode:"SBI00000015",payeeNickName:"Jaan"
    },
    {
      payeeAccountNumber:999909999099,payeeName:"Smith Desouza",payeeIFSCCode:"SBI00000013",payeeNickName:"Smith"
    }
  ];
  
  constructor() { }  ngOnInit(): void {  }
  verifyAccountNumber() {
    if(this.payeeObj.payeeAccountNumber != this.tempPayeeAccountNumber) {
      this.errMsg="payee account number doesnot match";
    }
    else {
      this.errMsg="";
    }
  }
  addPayee() {

  }
}
