package com.example.tests;

public class ContactData implements Comparable<ContactData> {
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
	
	@Override
	public String toString() {
		return "ContactData [contactname=" + contactname + ", lastname="
				+ lastname + ", adress1=" + adress1 + ", telefoneHome="
				+ telefoneHome + ", telefoneMobile=" + telefoneMobile
				+ ", telefoneWork=" + telefoneWork + ", email1=" + email1
				+ ", email2=" + email2 + ", selectDay=" + selectDay
				+ ", selectMonth=" + selectMonth + ", year=" + year
				+ ", adress2_2=" + adress2_2 + ", telefoneHome2="
				+ telefoneHome2 + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		/*result = prime * result
				+ ((contactname == null) ? 0 : contactname.hashCode());
		result = prime * result
				+ ((lastname == null) ? 0 : lastname.hashCode());*/
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactData other = (ContactData) obj;
		if (contactname == null) {
			if (other.contactname != null)
				return false;
		} else if (!contactname.equals(other.contactname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		return true;
	}
	@Override
	public int compareTo(ContactData other) {
		return this.lastname.toLowerCase().compareTo(other.lastname.toLowerCase());
	}
	
	
	
	
}