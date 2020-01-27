package com.test.xmltest;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="Customer")
@XmlType(propOrder = { "ID", "firstName", "lastName" })
public class Customer {
	private String firstName;
	private String last_name;
	private int id;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return last_name;
	}

	public void setLastName(String last_name) {
		this.last_name = last_name;
	}

	public int getID() {
		return id;
	}

	public void setID(int id) {
		this.id = id;
	}
}
