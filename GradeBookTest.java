/*
 * Class: CMSC203 CRN 20798
 * Instructor: Ahmed Tarek
 * Description: JUnit test class to check that GradeBook methods work.
 * Due: 10/28/2026
 * Platform/compiler: Eclipse IDE / macOS
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Chandul Somaweera
 */

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTest {

	private GradeBook g1;
	private GradeBook g2;
	
	@Before
	public void setUp() {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		g1.addScore(50.0);
		g1.addScore(75.0);
		
		g2.addScore(80.0);
		g2.addScore(90.0);
		g2.addScore(60.0);
	}
	
	@After
	public void tearDown() {
		g1 = null;
		g2 = null;
	}
	
	@Test
	public void testAddScore() {
		
		assertTrue(g1.toString().equals("50.0 75.0 "));
		assertTrue(g2.toString().equals("80.0 90.0 60.0 "));
		
		assertEquals(2, g1.getScoreSize());
		assertEquals(3, g2.getScoreSize());
	}
	
	@Test
	public void testSum() {
		
		assertEquals(125.0, g1.sum(), 0.001);
		
		assertEquals(230.0, g2.sum(), 0.001);
		
	}
	
	@Test
	public void testMinimum() {
		assertEquals(50.0, g1.minimum(), 0.001);
		
		assertEquals(60.0, g2.minimum(), 0.001);
	}
	
	
	@Test
	public void testFinalScore() {
		
		assertEquals(75.0, g1.finalScore(), 0.001);
		
		assertEquals(170.0, g2.finalScore(), 0.001);
	}
}

