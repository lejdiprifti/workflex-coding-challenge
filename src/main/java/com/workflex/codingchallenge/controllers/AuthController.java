package com.workflex.codingchallenge.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workflex.codingchallenge.dto.LoginRequest;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@CrossOrigin("*")
@RestController
@RequestMapping("/auth")
@Slf4j
public class AuthController {

	@PostMapping("/login")
	public void login(@Valid @RequestBody LoginRequest request) {
		log.debug("request successfully validated");
		return;
	}

}
