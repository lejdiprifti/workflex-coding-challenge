package com.workflex.codingchallenge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workflex.codingchallenge.entities.Workation;
import com.workflex.codingchallenge.services.WorkationService;

@CrossOrigin("*")
@RestController
@RequestMapping("/workflex")
public class WorkationController {

	@Autowired
	private WorkationService workationService;

	@GetMapping("/workation")
	public List<Workation> getAll() {
		return workationService.getAll();
	}

}
