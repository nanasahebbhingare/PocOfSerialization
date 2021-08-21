package com.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Teacher implements Externalizable {
	private int teacherId;
	private String name;
	private int age;

	public Teacher() {
		System.out.println("In teacher constructor...!!");
	}

	public Teacher(int teacherId, String name) {
		super();
		this.teacherId = teacherId;
		this.name = name;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
		System.out.println("In readExternal()...!!");
		this.teacherId = objectInput.readInt();
		this.name = (String) objectInput.readObject();
	}

	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		System.out.println("In writeExternal()...!!");
		objectOutput.writeInt(this.teacherId);
		objectOutput.writeObject(this.name);
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", name=" + name + ", age=" + age + "]";
	}

}
