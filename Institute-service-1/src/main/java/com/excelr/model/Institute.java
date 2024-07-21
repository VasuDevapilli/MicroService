package com.excelr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Institute {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int instituteCenterid;
	private String institutename;
	private long contact_no;
	private String address;
	private String website;
	public Institute() {
		super();
	}
	public Institute(int instituteCenterid, String institutename, long contact_no, String address, String website) {
		super();
		this.instituteCenterid = instituteCenterid;
		this.institutename = institutename;
		this.contact_no = contact_no;
		this.address = address;
		this.website = website;
	}
	@Override
	public String toString() {
		return "Institute [instituteCenterid=" + instituteCenterid + ", institutename=" + institutename
				+ ", contact_no=" + contact_no + ", address=" + address + ", website=" + website + "]";
	}
	public int getInstituteCenterid() {
		return instituteCenterid;
	}
	public void setInstituteCenterid(int instituteCenterid) {
		this.instituteCenterid = instituteCenterid;
	}
	public String getInstitutename() {
		return institutename;
	}
	public void setInstitutename(String institutename) {
		this.institutename = institutename;
	}
	public long getContact_no() {
		return contact_no;
	}
	public void setContact_no(long contact_no) {
		this.contact_no = contact_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}

}
