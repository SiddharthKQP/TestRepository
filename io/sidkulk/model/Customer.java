package io.sidkulk.model;

public class Customer {
	private Integer id;
	private String fname;
	private String lname;
	private String address;

	public Customer(Integer id, String fname, String lname, String address) {
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
	}

	public Customer(String fname, String lname, String address) {
		this.address = address;
		this.fname = fname;
		this.lname = lname;
	}

	public Integer getId() {
		return this.id;
	}

	public String getFname() {
		return this.fname;
	}

	public String getAddress() {
		return this.address;
	}

	public String getLname() {
		return this.lname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return this.id + " | " + this.fname + " | " + this.lname + " | " + this.address;
	}
}
