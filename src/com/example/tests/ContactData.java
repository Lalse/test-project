package com.example.tests;

public class ContactData {
	public String contactname;
	public String lastname;
	public String adress1;
	public String telefoneHome;
	public String telefoneMobile;
	public String telefoneWork;
	public String email1;
	public String email2;
	public String selectDay;
	public String selectMonth;
	public String year;
	public String adress2_2;
	public String telefoneHome2;

	public ContactData(String contactname, String lastname, String adress1,
			String telefoneHome, String telefoneMobile, String telefoneWork,
			String email1, String email2, String selectDay, String selectMonth,
			String year, String adress2_2, String telefoneHome2) {
		this.contactname = contactname;
		this.lastname = lastname;
		this.adress1 = adress1;
		this.telefoneHome = telefoneHome;
		this.telefoneMobile = telefoneMobile;
		this.telefoneWork = telefoneWork;
		this.email1 = email1;
		this.email2 = email2;
		this.selectDay = selectDay;
		this.selectMonth = selectMonth;
		this.year = year;
		this.adress2_2 = adress2_2;
		this.telefoneHome2 = telefoneHome2;
	}
	public ContactData() {
		
	}
}