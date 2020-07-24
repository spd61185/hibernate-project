
package com.satish.hibernate;

public class Student {
	private int sid;
	private String sname;
	private String city;
	private String status;
	private double totalfree;
	
	public Student() {}

	public Student( String sname, String city, String status, double totalfree) {
		this.sname = sname;
		this.city = city;
		this.status = status;
		this.totalfree = totalfree;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getTotalfree() {
		return totalfree;
	}

	public void setTotalfree(double totalfree) {
		this.totalfree = totalfree;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", city=" + city + ", status=" + status + ", totalfree="
				+ totalfree + "]";
	}
	
	

}


