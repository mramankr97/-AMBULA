package com.masai.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.Entity.Reader;

@Repository
public interface readerDao extends JpaRepository<Reader, Integer>{

}
