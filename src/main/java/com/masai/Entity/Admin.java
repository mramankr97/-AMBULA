package com.masai.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import lombok.Data;
@Entity
@Data

public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Admid;
	
	@Email(message = "Please enter valid email address")
	private String emailId;
	
	@Size(min = 8, max = 16, message = "Password must contain min 8 and max 16 digits")
	private String password;
	
}
