package com.jordelsonvev.DSList.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jordelsonvev.DSList.dto.GameMinDTO;
import com.jordelsonvev.DSList.entities.Game;
import com.jordelsonvev.DSList.repositories.GameRepository;

@Service
public class GameService {
	
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
	

}
