package org.itstep.model;

public class Account {

	private String login;
	private String pass;
	private String firstName;
	private String secondName;
	private long birthDay;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public long getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(long birthDay) {
		this.birthDay = birthDay;
	}
	
	public Account(String login, String pass, String firstName, String secondName, long birthDay) {
		this.login = login;
		this.pass = pass;
		this.firstName = firstName;
		this.secondName = secondName;
		this.birthDay = birthDay;
	}
	
}
