package com.cg.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.placement.model.Placement;

@Repository
public interface PlacementRepository extends JpaRepository <Placement, Long>{

	

}
