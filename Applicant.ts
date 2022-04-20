import { Address } from "./Address";
export class Applicant
{
    applicantId:number=0;
    accountType:string="";
    applicantName:string="";
    applicantFatherName:string="";
    applicantBirthdate:Date=new Date();
    mobileNumber:string="";
    married:string=""; 
    occupation:string="";
	addressList: Address[] =[] ;
    adhaarNumber:string="";; //address proof
    panCard:string="";; // pan number
    photo:string="";; // photo - actual photo
    annualIncome:number=0;
	applicationStatus:string="";
}