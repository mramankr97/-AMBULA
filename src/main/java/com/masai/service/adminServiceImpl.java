package com.masai.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.masai.Entity.Admin;
import com.masai.Entity.Reader;
import com.masai.dao.adminDao;
import com.masai.exception.adminException;
import com.masai.exception.readerexception;

public class adminServiceImpl implements adminService{

	@Autowired
	private adminDao aDao;

	@Override
	public Admin addAdmin(Admin admin) throws adminException {
	
		Admin adm=aDao.save(admin);
		
		return adm;
	}

	@Override
	public Admin updateAdmin(Admin admin) throws adminException {
		
		Optional<Admin> opt= aDao.findById(admin.getAdmid());
		
		if(opt.isPresent()) {
			
			Admin updatedAdmin= aDao.save(admin);
			return updatedAdmin;
			
		}else
			throw new adminException("Invalid Admin details..");
	}

	@Override
	public Admin viewAdminById(Integer admid) throws adminException {
		
		Optional<Admin> opt=aDao.findById(admid);
		
		if(opt.isPresent())
		{
			return opt.get();
		}
		else
			throw new adminException("Admin doesn't Exist");
	}
	
}
