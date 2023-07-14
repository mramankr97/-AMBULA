package com.masai.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Entity.Admin;

@Repository
public interface adminDao extends JpaRepository<Admin, Integer>{

}
