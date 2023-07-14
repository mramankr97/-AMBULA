package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.masai.Entity.Reader;
import com.masai.dao.readerDao;
import com.masai.exception.readerexception;


public class readerServiceImpl implements readerService{

	@Autowired
	private readerDao rDao;
	
	@Override
	public Reader addReader(Reader reader) throws readerexception {
		
		Reader read=rDao.save(reader);
		
		return read;
	}

	@Override
	public Reader updateReader(Reader reader) throws readerexception {
		

		Optional<Reader> opt= rDao.findById(reader.getReaderId());
		
		if(opt.isPresent()) {
			
			Reader updatedReader= rDao.save(reader);
			return updatedReader;
			
		}else
			throw new readerexception("Invalid Reader details..");
	}

	@Override
	public List<Reader> getAllReader() throws readerexception {
		
		List<Reader> reader= rDao.findAll();
		
		if(reader.size()==0)
			throw new readerexception("No Reader is there");
		else
		return reader;
	}

	@Override
	public Reader viewReaderById(Integer readerId) throws readerexception {
		
		Optional<Reader> opt=rDao.findById(readerId);
		
		if(opt.isPresent())
		{
			return opt.get();
		}
		else
			throw new readerexception("Reader doesn't Exist");
	}
	
}
