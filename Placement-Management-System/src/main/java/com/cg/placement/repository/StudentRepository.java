package com.cg.placement.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.placement.model.Student;
 

 
 
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
 
}