package com.tts.PracticeApp;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Subscriber {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String name;
	private String userName;
	private String email;
	private String passWord;
	
	@Column
	@CreationTimestamp
	private Date signUp;
	
	public Subscriber () {
		
	}


	public Subscriber(String name, String userName, String email, String passWord, Date signUp) {
		
		this.name = name;
		this.userName = userName;
		this.email = email;
		this.passWord = passWord;
		this.signUp = signUp;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassWord() {
		return passWord;
	}


	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}


	public Date getSignUp() {
		return signUp;
	}


	public void setSignUp(Date signUp) {
		this.signUp = signUp;
	}


	@Override
	public String toString() {
		return "Subscriber [id=" + id + ", name=" + name + ", userName=" + userName + ", email=" + email + ", passWord="
				+ passWord + ", signUp=" + signUp + "]";
	}
	

}
