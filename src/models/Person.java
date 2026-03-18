package models;

public class Person {
	private String name;
	private String surname;
	private String personCode;
	
	
	public Person() {
		name = "NoName";
		surname = "NoSurname";
		personCode = "00000000000";
	}
	
	public Person(String name, String surname, String personCode) {
		this.name = name;
		this.surname = surname;
		this.personCode = personCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPersonCode() {
		return personCode;
	}

	public void setPersonCode(String personCode) {
		this.personCode = personCode;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", personCode=" + personCode + "]";
	}
	
	
	
	
}



