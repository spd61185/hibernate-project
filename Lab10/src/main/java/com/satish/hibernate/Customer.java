package com.satish.hibernate;

public class Customer {
	private int cid;
	private String firstname;
	private String lasttname;
	private String email;
	private long phone;
	private Address address;
	
	public Customer() {}

	public Customer(String firstname, String lasttname, String email, long phone) {
		super();
		this.firstname = firstname;
		this.lasttname = lasttname;
		this.email = email;
		this.phone = phone;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLasttname() {
		return lasttname;
	}

	public void setLasttname(String lasttname) {
		this.lasttname = lasttname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", firstname=" + firstname + ", lasttname=" + lasttname + ", email=" + email
				+ ", phone=" + phone + ", address=" + address + "]";
	}

	
	
}
