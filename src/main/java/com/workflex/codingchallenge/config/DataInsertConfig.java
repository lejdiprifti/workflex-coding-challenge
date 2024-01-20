package com.workflex.codingchallenge.config;

import java.io.IOException;
import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.workflex.codingchallenge.services.WorkationService;

import jakarta.annotation.PostConstruct;

@Configuration
public class DataInsertConfig {

	@Autowired
	private WorkationService workationService;

	@PostConstruct
	public void loadData() throws IOException, ParseException {
		workationService.loadDataFromCsv("workations.csv");
	}
}
