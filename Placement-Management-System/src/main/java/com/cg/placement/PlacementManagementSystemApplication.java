package com.cg.placement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class PlacementManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlacementManagementSystemApplication.class, args);
	}

}
