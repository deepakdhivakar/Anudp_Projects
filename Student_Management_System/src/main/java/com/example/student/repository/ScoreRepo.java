package com.example.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.student.entities.Score;

@Repository
public interface ScoreRepo extends JpaRepository<Score, Integer> {

	@Query(value =  "select * from Room where roomId =?" , nativeQuery = true)
	Score findById(int Score_id);

	
	
	
}