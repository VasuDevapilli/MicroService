package com.excelr.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class StudentTable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;
	private String name;
	private long mobile_no;
	private String email_address;
	private  String course_name;
	private int fee;
	private int duration;
	private int instituteCenterid;
	public StudentTable() {
		super();
	}
	public StudentTable(int sid, String name, long mobile_no, String email_address, String course_name, int fee,
			int duration, int instituteCenterid) {
		super();
		this.sid = sid;
		this.name = name;
		this.mobile_no = mobile_no;
		this.email_address = email_address;
		this.course_name = course_name;
		this.fee = fee;
		this.duration = duration;
		this.instituteCenterid = instituteCenterid;
	}
	@Override
	public String toString() {
		return "StudentTable [sid=" + sid + ", name=" + name + ", mobile_no=" + mobile_no + ", email_address="
				+ email_address + ", course_name=" + course_name + ", fee=" + fee + ", duration=" + duration
				+ ", instituteCenterid=" + instituteCenterid + "]";
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getInstituteCenterid() {
		return instituteCenterid;
	}
	public void setInstituteCenterid(int instituteCenterid) {
		this.instituteCenterid = instituteCenterid;
	}

}
