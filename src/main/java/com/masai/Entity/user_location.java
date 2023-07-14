package com.masai.Entity;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class user_location {

	private String name;
    private double latitude;
    private double longitude;
}
