package com.jordelsonvev.DSList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jordelsonvev.DSList.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
	

	
}
