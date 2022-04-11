package com.sbi.layer2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component @Entity @Table(name="applicant_tbl")
public class Applicant {
	
	@Id
	@GeneratedValue
	@Column(name="applicant_id")
	private int applicantId;
	
	@Column(name="account_type")
	private String accountType;
	
	@Column(name="applicant_name")
	private String applicantName;
	
	@Column(name="applicant_father")
	private String applicantFatherName;
	
	@Column(name="applicant_dob")
	private LocalDate applicantBirthdate;
		
	@Column(name="applicant_mobile")
	private String mobileNumber;
	
	@Column(name="applicant_married")
	private boolean married; // isMarried(), setMarried()
	
	@Column(name="applicant_occupation")
	private String occupation;
	
	@OneToMany(mappedBy = "applicant", cascade = CascadeType.ALL)
	List<Address> addressList = new ArrayList<Address>();
	
	@Column(name="applicant_adhaar")
	private String adhaarNumber; //address proof
	
	@Column(name="applicant_pan")
	private String panCard; // pan number
	
	@Column(name="applicant_photo")
	private String photo; // photo - actual photo
	
	@Column(name="applicant_annual_income")
	private double annualIncome;
	
	
	
}
