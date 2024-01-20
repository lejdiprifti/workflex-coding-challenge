package com.workflex.codingchallenge.entities;

import java.util.Date;

import com.workflex.codingchallenge.enums.RiskLevel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity(name = "workation")
public class Workation {

	@Id
	@Column(name = "workation_id")
	private String workationId;

	@Column(name = "employee")
	private String employee;

	private String origin;
	private String destination;

	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;
	@Temporal(TemporalType.TIMESTAMP)
	private Date endDate;

	private int workingDays;

	@Enumerated(value = EnumType.STRING)
	private RiskLevel risk;
}
