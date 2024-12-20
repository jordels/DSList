package com.jordelsonvev.DSList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jordelsonvev.DSList.dto.GameDTO;
import com.jordelsonvev.DSList.dto.GameMinDTO;
import com.jordelsonvev.DSList.entities.Game;
import com.jordelsonvev.DSList.repositories.GameRepository;



@Service
public class GameService {
	
	
	@Autowired
	private GameRepository gameRepository;
	
	
	@Transactional(readOnly = true)
	public GameDTO findById() {
		Game result = gameRepository.findAll().get(0);
		GameDTO dto = new GameDTO(result);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	

}
