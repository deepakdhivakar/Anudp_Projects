package com.example.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.entities.Score;
import com.example.student.service.ScoreService;

@RestController
public class ScoreController {
	@Autowired
	ScoreService scoreService;
	
	@GetMapping("/score/{Id}")
	public Score getScoreById(@PathVariable int Score_id) {
		return scoreService.getScoreById(Score_id); 
	}
	
	@PostMapping("/postscore")
	public Score addScore(@RequestBody Score score) {
		
		return scoreService.addScore(score);
	}
	
	@PutMapping("/updatescore")
	public Score update(@RequestHeader int Score_id ,@RequestBody Score score) {
		
		return scoreService.updateDb(Score_id ,score); 
	}
	@DeleteMapping("/deletescore/{Score_id}")
	public String delete(@RequestHeader int Score_id ) {
		scoreService.deleteDb(Score_id );
		return "data deleted";
	}
	
	
}

