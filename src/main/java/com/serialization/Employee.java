package com.serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer empId;
	private String name;
	public String msg;

	private AddressPermanent addressPermanent;

	public Employee() {
		System.out.println("Default constructor .....!!!");
	}

	public Employee(Integer empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AddressPermanent getAddressPermanent() {
		return addressPermanent;
	}

	public void setAddressPermanent(AddressPermanent addressPermanent) {
		this.addressPermanent = addressPermanent;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", msg=" + msg + ", addressPermanent=" + addressPermanent
				+ "]";
	}

	public void display(String msg) {
		this.msg = msg;
		System.out.println("In display()....!!!" + msg);
	}

}
