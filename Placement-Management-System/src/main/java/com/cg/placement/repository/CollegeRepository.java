package com.cg.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.placement.model.College;


@Repository
public interface CollegeRepository extends JpaRepository<College, Long> {
	 
}
