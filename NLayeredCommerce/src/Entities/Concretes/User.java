package Entities.Concretes;

import java.time.LocalDate;

import Entities.Abstracts.IEntity;

public class User implements IEntity {
	private int id;
	private String firstName;
	private String lastName;
	private String mail;
	private String password;
	private LocalDate birthOfDay;
	
	public User() {
		
	}
	public User(int id, String firstName, String lastName, String mail, String password, LocalDate birthOfDay) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mail = mail;
		this.password = password;
		this.birthOfDay = birthOfDay;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getBirthOfDay() {
		return birthOfDay;
	}
	public void setBirthOfDay(LocalDate birthOfDay) {
		this.birthOfDay = birthOfDay;
	}

}
