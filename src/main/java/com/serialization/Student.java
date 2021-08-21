package com.serialization;

import java.io.Serializable;

/**
 * java.io.NotSerializableException: com.serialization.Student We not use
 * serializeble interface
 * 
 * @author BhingarN
 *
 */
public class Student implements Serializable {
	static int rollNo;
	private String name;

	public Student() {
		System.out.println("Default constructor....!!!");
	}

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
}
