package com.masai.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data

public class Reader {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int readerId;
	
	@NotNull(message = "Reader name should not be empty.")
	private String Rname;
	
	@NotNull(message = "Reader Address should not be empty.")
	private String Radd;
	
	@Size(min =10, message = "Phone no. should not be less than 10 digits")
	private int Pno;
	
}
