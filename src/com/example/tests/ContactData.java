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
	public int compareTo(ContactData other) {
		
		
		
		return this.lastname.toLowerCase().compareTo(other.lastname.toLowerCase());
		
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		/*result = prime * result + ((adress1 == null) ? 0 : adress1.hashCode());
		result = prime * result
				+ ((adress2_2 == null) ? 0 : adress2_2.hashCode());
		result = prime * result
				+ ((contactname == null) ? 0 : contactname.hashCode());
		result = prime * result + ((email1 == null) ? 0 : email1.hashCode());
		result = prime * result + ((email2 == null) ? 0 : email2.hashCode());
		result = prime * result
				+ ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result
				+ ((selectDay == null) ? 0 : selectDay.hashCode());
		result = prime * result
				+ ((selectMonth == null) ? 0 : selectMonth.hashCode());
		result = prime * result
				+ ((telefoneHome == null) ? 0 : telefoneHome.hashCode());
		result = prime * result
				+ ((telefoneHome2 == null) ? 0 : telefoneHome2.hashCode());
		result = prime * result
				+ ((telefoneMobile == null) ? 0 : telefoneMobile.hashCode());
		result = prime * result
				+ ((telefoneWork == null) ? 0 : telefoneWork.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());*/
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
		if (adress1 == null) {
			if (other.adress1 != null)
				return false;
		} else if (!adress1.equals(other.adress1))
			return false;
		if (adress2_2 == null) {
			if (other.adress2_2 != null)
				return false;
		} else if (!adress2_2.equals(other.adress2_2))
			return false;
		if (contactname == null) {
			if (other.contactname != null)
				return false;
		} else if (!contactname.equals(other.contactname))
			return false;
		if (email1 == null) {
			if (other.email1 != null)
				return false;
		} else if (!email1.equals(other.email1))
			return false;
		if (email2 == null) {
			if (other.email2 != null)
				return false;
		} else if (!email2.equals(other.email2))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (selectDay == null) {
			if (other.selectDay != null)
				return false;
		} else if (!selectDay.equals(other.selectDay))
			return false;
		if (selectMonth == null) {
			if (other.selectMonth != null)
				return false;
		} else if (!selectMonth.equals(other.selectMonth))
			return false;
		if (telefoneHome == null) {
			if (other.telefoneHome != null)
				return false;
		} else if (!telefoneHome.equals(other.telefoneHome))
			return false;
		if (telefoneHome2 == null) {
			if (other.telefoneHome2 != null)
				return false;
		} else if (!telefoneHome2.equals(other.telefoneHome2))
			return false;
		if (telefoneMobile == null) {
			if (other.telefoneMobile != null)
				return false;
		} else if (!telefoneMobile.equals(other.telefoneMobile))
			return false;
		if (telefoneWork == null) {
			if (other.telefoneWork != null)
				return false;
		} else if (!telefoneWork.equals(other.telefoneWork))
			return false;
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		return true;
	}
	
	
	
	
}