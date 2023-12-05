package com.example.student.service;

import com.example.student.entities.Score;

public interface ScoreService {
	Score getScoreById(int Score_id );
	Score addScore(Score score);
	Score updateDb(int Score_id,Score score);
	void deleteDb(int Score_id);
}
