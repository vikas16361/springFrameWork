package com.vikas.model;

public class UserDto {
	@Override
	public String toString() {
		return "UserDto [name=" + name + ", userName=" + userName + ", password=" + password + ", country=" + country
				+ ", gender=" + gender + "]";
	}

	private String name;
	private String userName;
	private String password;
	private String country;
	private char gender;
	private String msg;

	public UserDto(String msg) {
		this.msg=msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
