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
import org.yaml.snakeyaml.reader.ReaderException;

import com.masai.Entity.Reader;
import com.masai.exception.readerexception;
import com.masai.service.readerService;

@RestController
public class readerController {

	
	@Autowired
	private readerService rService;
	
	@PostMapping("/reader")
	public ResponseEntity<Reader> registerReader(@RequestBody Reader reader) throws readerexception{
		
		Reader savedreader=rService.addReader(reader);
		
		return new ResponseEntity<Reader>(savedreader, HttpStatus.CREATED);
	}
	
	
	
	@PutMapping("/reader")
	public ResponseEntity<Reader> updateReaderHandler(@RequestBody Reader reader) throws readerexception{
		
		Reader updateReader=rService.updateReader(reader);
		
		return new ResponseEntity<Reader>(updateReader,HttpStatus.ACCEPTED);
		
	}
	
	
	
	@GetMapping("/reader")
	public ResponseEntity<List<Reader>> getAllReaderHandler() throws readerexception{
		
		List<Reader> reader=rService.getAllReader();
		
		return new ResponseEntity<List<Reader>>(reader,HttpStatus.OK);
	}
	
	
	@GetMapping("/getreader/{readerId}")
	public ResponseEntity<Reader> getReaderByIdHandler(@PathVariable("readerId")Integer readerId) throws readerexception{
		
		Reader existingReader= rService.viewReaderById(readerId);
		
		return new ResponseEntity<Reader>(existingReader,HttpStatus.OK);
	}
}
