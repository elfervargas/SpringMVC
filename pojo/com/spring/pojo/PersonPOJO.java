package com.spring.pojo;

public class PersonPOJO {

	private String name;
	private Long year;
	private String gender;

	public PersonPOJO(String name, Long year, String gender) {
		super();
		this.name = name;
		this.year = year;
		this.gender = gender;
	}

	public PersonPOJO() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getYear() {
		return year;
	}

	public void setYear(Long year) {
		this.year = year;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
