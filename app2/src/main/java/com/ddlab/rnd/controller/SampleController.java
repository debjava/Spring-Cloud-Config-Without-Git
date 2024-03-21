package com.ddlab.rnd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ddlab.rnd.collection.SurveyGroup;
import com.ddlab.rnd.service.GroupService;

@RefreshScope
@RestController
public class SampleController {

	@Value("${hello.message: Haaalo}")
	private String helloMessage;

	@Autowired
	private GroupService service;

	@GetMapping(path = "/msg1")
	public ResponseEntity<String> getMessage() {
		return new ResponseEntity<>(helloMessage, HttpStatus.OK);
	}

	@GetMapping(path = "/grp")
	public ResponseEntity<List<SurveyGroup>> getGroups() {
		System.out.println("Calling grp ....");
		List<SurveyGroup> grpList = service.getAllGroups();
		return new ResponseEntity<>(grpList, HttpStatus.OK);
	}
}
