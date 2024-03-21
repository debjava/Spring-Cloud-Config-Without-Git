package com.ddlab.rnd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ddlab.rnd.entity.RoleLookup;
import com.ddlab.rnd.service.Roles;

@RefreshScope
@RestController
public class SampleController {

	@Value("${hello.message: Haaalo}")
	private String helloMessage;
	
	@Autowired
	private Roles roles;

	@GetMapping(path = "/msg1")
	public ResponseEntity<String> getMessage() {
		return new ResponseEntity<>(helloMessage, HttpStatus.OK);
	}
	
	@GetMapping(path = "/roles")
	public ResponseEntity<List<RoleLookup>> getAllRoles() {
		System.out.println("Calling roles ....");
		List<RoleLookup> allRoles = roles.getRoleLookup();
		return new ResponseEntity<>(allRoles, HttpStatus.OK);
	}
}
