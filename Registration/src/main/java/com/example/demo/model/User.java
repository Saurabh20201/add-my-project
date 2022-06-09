package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Users")
public class User {
@Id
private int id;
@Column(name="Email")
private String emailId;
@Column(name="Name")
private String userName;
@Column(name="Password")
private String password;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int id, String emailId, String userName, String password) {
	super();
	this.id = id;
	this.emailId = emailId;
	this.userName = userName;
	this.password = password;
}
}
