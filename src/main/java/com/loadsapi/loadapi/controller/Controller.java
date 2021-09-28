package com.loadsapi.loadapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loadsapi.loadapi.entities.loadinfo;
import com.loadsapi.loadapi.services.loadservice;

@RestController
public class Controller {
	
	@Autowired
	private loadservice service;
	
	@GetMapping("/")
	public String home() {
		return "this is home page";
	}
	
	//get the load
	@GetMapping("/load")
	public List<loadinfo> getloads() {
		
		return this.service.getloads();
	}
	
	@GetMapping("/load/{loadId}")
	public loadinfo getloads(@PathVariable String loadId) {
		
		return this.service.getloads(Long.parseLong(loadId));
	}
	
	@PostMapping("/load")
	public ResponseEntity<HttpStatus> addloads(@RequestBody loadinfo info){
		try {
			this.service.addloads(info);
			return new ResponseEntity<>(HttpStatus.ACCEPTED);
		}
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/load")
	public loadinfo updateloadinfo(@RequestBody loadinfo info) {
		
		return this.service.updateloadinfo(info);
	}
	
	@DeleteMapping("/load/{loadId}")
	public ResponseEntity<HttpStatus> deleteload(@PathVariable String loadId){
		try {
			this.service.deleteload(Long.parseLong(loadId));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	

}

