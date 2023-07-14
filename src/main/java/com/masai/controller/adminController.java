package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Entity.Admin;
import com.masai.exception.adminException;
import com.masai.service.adminService;

@RestController
public class adminController {

	@Autowired
	private adminService aService;
	
	@PostMapping("/admin")
	public ResponseEntity<Admin> registeradmin(@RequestBody Admin admin) throws adminException{
		
		Admin savedadmin=aService.addAdmin(admin);
		
		return new ResponseEntity<Admin>(savedadmin, HttpStatus.CREATED);
	}
	
	
	
	@PutMapping("/admin")
	public ResponseEntity<Admin> updateAdminHandler(@RequestBody Admin admin) throws adminException{
		
		Admin updateAdmin=aService.updateAdmin(admin);
		
		return new ResponseEntity<Admin>(updateAdmin,HttpStatus.ACCEPTED);
		
	}
	
	
	
	@GetMapping("/getadmin/{admid}")
	public ResponseEntity<Admin> getAdminByIdHandler(@PathVariable("admid")Integer admid) throws adminException{
		
		Admin existingAdmin= aService.viewAdminById(admid);
		
		return new ResponseEntity<Admin>(existingAdmin,HttpStatus.OK);
	}
}
