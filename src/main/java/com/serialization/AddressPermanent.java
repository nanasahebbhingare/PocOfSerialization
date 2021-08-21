package com.serialization;

import java.io.Serializable;

//Not implements serializable interface :java.io.NotSerializableException: com.serialization.AddressPermanent
public class AddressPermanent implements Serializable {
	private static final long serialVersionUID = 1L;
	private String permanentAddress;

	public String getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	@Override
	public String toString() {
		return "AddressPermanent [permanentAddress=" + permanentAddress + "]";
	}
}
