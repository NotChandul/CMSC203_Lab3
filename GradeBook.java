/*
 * Class: CMSC203 CRN 20798
 * Instructor: Ahmed Tarek
 * Description: GradeBook class updated with getScoreSize and toString methods.
 * Due: 10/28/2026
 * Platform/compiler: Eclipse IDE / macOS (ARM64)
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Chandul Somaweera
 */

import java.util.ArrayList;

public class GradeBook {

	private double [] scores;
	
	private int scoresSize;
	
	public GradeBook (int capacity) {
		scores = new double[capacity];
		scoresSize = 0;
	}
	
	public boolean addScore(double score) {
		if (scoresSize < scores.length) {
			scores[scoresSize] = score;
			scoresSize++;
			return true;
		}
		else {
			return false;
		}
	}
	
	public double sum() {
		double total = 0.0;
		for (int i = 0; i < scoresSize; i++) {
			total = total + scores[i];
		}
		return total;
	}
	
	public double minimum() {
		if (scoresSize == 0) {
			return 0.0;
		}
		
		double smallest = scores[0];
		for ( int i = 1; i < scoresSize; i++) {
			if (scores[i] < smallest) {
				smallest = scores[i];
			}
		}
		return smallest;
	}
	
	public double finalScore() {
		if (scoresSize == 0) {
			return 0.0;
		}
		
		else if (scoresSize == 1) {
			return scores[0];
		}
		
		else {
			return sum() - minimum();
		}
	}
	
	// Task #1
	public int getScoreSize() {
		return scoresSize;
	}
	
	// Task #1
	@Override
	public String toString() {
		String text = "";
		for (int i = 0; i < scoresSize; i++) {
			text = text + scores[i] + " ";
		}
		return text;
	}
}
