package com.masai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.Entity.Reader;
import com.masai.exception.readerexception;

@Service
public interface readerService {

	public Reader addReader(Reader reader)throws readerexception;

	public Reader updateReader(Reader reader)throws readerexception;
	
	public List<Reader> getAllReader() throws readerexception;
	
	public Reader viewReaderById(Integer readerId)throws readerexception;
	
}
