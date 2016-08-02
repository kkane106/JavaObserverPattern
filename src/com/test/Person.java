package com.test;

// All instances of a 'Person' are assumed to have
// the ability to observe some observable
public abstract class Person implements Observer {
	private String email;
	
	public Person(){
		this("");
	}
	
	public Person(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
