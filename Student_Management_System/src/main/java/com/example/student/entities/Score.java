package com.example.student.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Score {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Score_id;
	private int Student_id;
	private int sem1Score;
	private int sem2Score;
	private int sem3Score;
	private int sem4Score;
	private int cgpa;
	public int getScore_id() {
		return Score_id;
	}
	public void setScore_id(int score_id) {
		Score_id = score_id;
	}
	public int getStudent_id() {
		return Student_id;
	}
	public void setStudent_id(int student_id) {
		Student_id = student_id;
	}
	public int getSem1Score() {
		return sem1Score;
	}
	public void setSem1Score(int sem1Score) {
		this.sem1Score = sem1Score;
	}
	public int getSem2Score() {
		return sem2Score;
	}
	public void setSem2Score(int sem2Score) {
		this.sem2Score = sem2Score;
	}
	public int getSem3Score() {
		return sem3Score;
	}
	public void setSem3Score(int sem3Score) {
		this.sem3Score = sem3Score;
	}
	public int getSem4Score() {
		return sem4Score;
	}
	public void setSem4Score(int sem4Score) {
		this.sem4Score = sem4Score;
	}
	public int getCgpa() {
		return cgpa;
	}
	public void setCgpa(int cgpa) {
		this.cgpa = cgpa;
	}
	@Override
	public String toString() {
		return "Score [Score_id=" + Score_id + ", Student_id=" + Student_id + ", sem1Score=" + sem1Score
				+ ", sem2Score=" + sem2Score + ", sem3Score=" + sem3Score + ", sem4Score=" + sem4Score + ", cgpa="
				+ cgpa + "]";
	}
	
}
