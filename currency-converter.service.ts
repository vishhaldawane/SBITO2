import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CurrencyConverterService {

  convertedAmount:number=0;

  convertService(source: string, target: string, amountToConvert: number) : number {
    console.log('source '+source);
    console.log('target '+target);
    console.log('Amount '+amountToConvert);

    if(source=="United States" && target=="India")
      this.convertedAmount=amountToConvert*78;
    else if(source=="India" && target=="United States")
      this.convertedAmount=amountToConvert/78;
      console.log(this.convertedAmount);
      return this.convertedAmount;
  }
  constructor() { }
}
