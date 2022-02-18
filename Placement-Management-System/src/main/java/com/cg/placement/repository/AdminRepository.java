package com.cg.placement.repository;
import org.springframework.stereotype.Repository;

import com.cg.placement.model.Admin;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long>{
	Admin findByUsernameAndPassword(String username, String password);

}
