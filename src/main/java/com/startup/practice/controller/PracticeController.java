package com.startup.practice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.startup.practice.dto.PracticeDTO;
import com.startup.practice.entity.UserEntity;
import com.startup.practice.service.PracticeService;

@RestController
public class PracticeController {
	@Autowired
	PracticeService service;
	
	@GetMapping("/customers")
	public ResponseEntity<List<PracticeDTO>> getAllNames() {
		List<PracticeDTO> val = service.getAllNames();
		return new ResponseEntity<>(val, HttpStatus.OK);
	}
	
	@PostMapping("/customers")
	public ResponseEntity<PracticeDTO> addName(@RequestBody PracticeDTO pd) {
		
		return new ResponseEntity<>(service.addName(pd), HttpStatus.CREATED);
		
	}
	
	@GetMapping("/customers/{id}")
	public ResponseEntity<PracticeDTO> getName(@PathVariable Integer id) {
		Optional<PracticeDTO> pd = service.getName(id);
		if(pd.isEmpty()) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(pd.get(), HttpStatus.OK);
//		return new ResponseEntity<>(service.getName(id).map(user->user), HttpStatus.OK);
	}
	
}
