import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-simple-interest',
  templateUrl: './simple-interest.component.html',
  styleUrls: ['./simple-interest.component.css']
})
export class SimpleInterestComponent implements OnInit {

    principal: number=5000;
    numberOfYears: number=10;
    rate : number=4.6;
    si : number=0;

  constructor() { }

  ngOnInit(): void {
  }

  calculateSimpleInterest() {
      console.log('calculateSimpleInterest() is invoked...');
      this.si = (this.principal * this.numberOfYears * this.rate)/100;
  }

}
