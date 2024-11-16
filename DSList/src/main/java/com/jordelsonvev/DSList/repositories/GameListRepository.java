package com.jordelsonvev.DSList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jordelsonvev.DSList.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}
