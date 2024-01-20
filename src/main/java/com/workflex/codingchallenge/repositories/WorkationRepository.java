package com.workflex.codingchallenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.workflex.codingchallenge.entities.Workation;

@Repository
public interface WorkationRepository extends JpaRepository<Workation, String> {

}
