package com.masai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.Entity.Admin;
import com.masai.exception.adminException;

@Service
public interface adminService {

	public Admin addAdmin(Admin admin)throws adminException;

	public Admin updateAdmin(Admin admin)throws adminException;
	
	public Admin viewAdminById(Integer admid)throws adminException;
}
