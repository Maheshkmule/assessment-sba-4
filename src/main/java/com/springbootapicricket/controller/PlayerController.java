package com.springbootapicricket.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.springbootapicricket.entity.Player;
import com.springbootapicricket.repository.PlayerRepository;


public class PlayerController {
	 private PlayerRepository playerRepository;
		
		

	    @GetMapping("/player")
		public ResponseEntity<List<Player>> getAllPlayer() {
			return ResponseEntity.ok(playerRepository.findAll());
		}

		@GetMapping("/players/{id}")
		public ResponseEntity<Player> getPlayer(@PathVariable Integer id) {
			return ResponseEntity.ok(playerRepository.findById(id).get());
		}

		@PostMapping("/player")
		public ResponseEntity<Player> createPlayer(@RequestBody Player player) {
			return ResponseEntity.ok(playerRepository.save(player));
		}
}
