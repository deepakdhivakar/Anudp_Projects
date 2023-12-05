package com.example.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.entities.Score;
import com.example.student.exception.ResourceNotFoundException;
import com.example.student.repository.ScoreRepo;
@Service
public class ScoreImpl {
	@Autowired
	ScoreRepo scoreRepo;
	
	public Score getScoreById(int Score_id) {
		Optional<Score> rm=Optional.ofNullable(scoreRepo.findById(Score_id));
		Score score;
		if(rm.isPresent())
		{
			score=rm.get();
		}else {
				throw new ResourceNotFoundException();
			}
		return score;
	  
	}

	public Score addScore(Score score) {
		return  scoreRepo.save(score);
	}

	public Score updateDb(int Score_id,Score score) {
		
		
		Score s1 = scoreRepo.findById(Score_id);
		
		if(s1!=null) {
			s1.setSem1Score(score.getSem1Score());   
			s1.setSem2Score(score.getSem2Score());
			s1.setSem3Score(score.getSem3Score());
			s1.setSem4Score(score.getSem4Score());   
			s1.setCgpa(score.getCgpa());
		return scoreRepo.save(s1);
		} 
		else 
		{
			throw new ResourceNotFoundException();
		} 
	}

	public void deleteDb(int Score_id) {
	
		
		Score s2 = scoreRepo.findById(Score_id);
		
		if(s2!=null) {
			scoreRepo.delete(s2);
		}
		else {
			throw new ResourceNotFoundException();
		}		 
	}

	
	
}

