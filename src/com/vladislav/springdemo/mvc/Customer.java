package com.vladislav.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



public class Customer {
	
	private String firstName;
	
	@NotNull(message="is reqiered")
	@Size(min=1, message="min one chapter")
	private String lastName;
	
	@NotNull(message="is reqiered")
	@Min(value=0, message="Must be grater than or equel to zero")
	@Max(value=10, message="Must be less than or equel to ten")
	private Integer freePasses;
	
	@Pattern(regexp = "^[a-zA-Z0-9]{5}", message ="Only 5 digits/chapter")
	private String postalCode;
	
	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	
}
