package com.spring.pojo;

public class PersonExtendedPOJO extends PersonPOJO {

	private String other;

	public PersonExtendedPOJO(String name, Long year, String gender, String other) {
		super(name, year, gender);
		this.other = other;
	}

	public PersonExtendedPOJO() {
		super();
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

}
