package com.workflex.codingchallenge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workflex.codingchallenge.entities.Workation;
import com.workflex.codingchallenge.services.WorkationService;

import lombok.extern.slf4j.Slf4j;

@CrossOrigin("*")
@RestController
@RequestMapping("/workflex")
@Slf4j
public class WorkationController {

	@Autowired
	private WorkationService workationService;

	@GetMapping("/workation")
	public List<Workation> getAll() {
		log.debug("getting all workations");
		return workationService.getAll();
	}

}
