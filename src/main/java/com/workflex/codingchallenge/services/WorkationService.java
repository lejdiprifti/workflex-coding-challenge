package com.workflex.codingchallenge.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.workflex.codingchallenge.entities.Workation;
import com.workflex.codingchallenge.enums.RiskLevel;
import com.workflex.codingchallenge.repositories.WorkationRepository;

@Service
public class WorkationService {

	@Autowired
	private WorkationRepository workationRepository;

	public void loadDataFromCsv(String fileName) throws IOException, ParseException {
		List<Workation> workations = new ArrayList<>();

		ClassPathResource resource = new ClassPathResource(fileName);

		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(resource.getInputStream()))) {
			reader.readLine();
			String line;
			while ((line = reader.readLine()) != null) {
				String[] data = line.split(",");
				Workation workation = new Workation();
				workation.setWorkationId(data[0].trim());
				workation.setEmployee(data[1].trim());
				workation.setOrigin(data[2].trim());
				workation.setDestination(data[3].trim());
				workation.setStartDate(dateFormat.parse(data[4]));
				workation.setEndDate(dateFormat.parse(data[5]));
				workation.setWorkingDays(Integer.parseInt(data[6]));
				workation.setRisk(RiskLevel.valueOf(data[7]));
				workations.add(workation);
			}
		}
		workationRepository.saveAll(workations);

	}

	public List<Workation> getAll() {
		return this.workationRepository.findAll();
	}
}
