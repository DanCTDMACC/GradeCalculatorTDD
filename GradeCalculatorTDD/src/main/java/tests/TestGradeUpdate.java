package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Grade;

public class TestGradeUpdate {

	@Before
	public void setUp() throws Exception {
	}

	@Test (expected = RuntimeException.class)
	public void StudentNameIsNullThenExceptionIsThrown() {
		String nullString = null;
		Grade jv2 = new Grade(nullString, "A Class");
	}
	
	@Test (expected = RuntimeException.class)
	public void StudentNameIsEmptyThenExceptionIsThrown() {
		Grade jv2 = new Grade("", "A Class");
	}
	
	@Test
	public void StudentNameHasMoreThan50LetterThenStudentNameContainsFirst50Letter() {
		Grade jv2 = new Grade("12345678911234567892123456789312345678941234567895123", "A Class");
		assertEquals(50, jv2.getStudentName().length());
	}
	
	@Test
	public void StudentNameHas1To50LetterThenStudentNameContainsWholeName() {
		String testString = "123456789112345678921234567893123456789412345678";
		Grade jv2 = new Grade(testString, "A Class");
		assertEquals(testString.length(), jv2.getStudentName().length());
	}

	@Test (expected = RuntimeException.class)
	public void ClassNameIsNullThenExceptionIsThrown() {
		String nullString = null;
		Grade jv2 = new Grade("A Student", nullString);
	}

	@Test (expected = RuntimeException.class)
	public void ClassNameIsEmptyThenExceptionIsThrown() {
		Grade jv2 = new Grade("A Student", "");
	}
	
	@Test
	public void ClassNameHasMoreThan30LetterThenClassNameContainsFirst30Letter() {
		Grade jv2 = new Grade("A Student", "12345678911234567892123456789312345678941234567895123");
		assertEquals(30, jv2.getClassName().length());
	}
	
	@Test
	public void ClassNameHas1To29LetterThenClassNameContainsWholeName() {
		String testString = "12345678911234567892";
		Grade jv2 = new Grade("A Student", testString);
		assertEquals(testString.length(), jv2.getClassName().length());
	}
	
	@Test
	public void GradeLetterIsInitializedToFIfNotProvided() {
		Grade jv2 = new Grade("A Student", "A Class");
		assertEquals('F', jv2.getGradeLetter());
	}
	
	@Test (expected = RuntimeException.class)
	public void GradePointLessThan0ThenExceptionIsThrown() {
		Grade jv2 = new Grade("A Student", "A Class");
		jv2.setGradePoint(-1);
	}
	
	@Test (expected = RuntimeException.class)
	public void GradePointGreaterThan100ThenExceptionIsThrown() {
		Grade jv2 = new Grade("A Student", "A Class");
		jv2.setGradePoint(101);
	}
	
	@Test
	public void GradePointBetween90And100ThenGradeLetterIsA() {
		Grade jv2 = new Grade("A Student", "A Class");
		jv2.setGradePoint(90);
		assertEquals('A', jv2.getGradeLetter());
	}
	
	@Test
	public void GradePointBetween80And89ThenGradeLetterIsB() {
		Grade jv2 = new Grade("A Student", "A Class");
		jv2.setGradePoint(80);
		assertEquals('B', jv2.getGradeLetter());
	}
	
	@Test
	public void GradePointBetween70And79ThenGradeLetterIsC() {
		Grade jv2 = new Grade("A Student", "A Class");
		jv2.setGradePoint(70);
		assertEquals('C', jv2.getGradeLetter());
	}
	
	@Test
	public void GradePointBetween60And69ThenGradeLetterIsD() {
		Grade jv2 = new Grade("A Student", "A Class");
		jv2.setGradePoint(60);
		assertEquals('D', jv2.getGradeLetter());
	}
	
	@Test
	public void GradePointBetween1And59ThenGradeLetterIsF() {
		Grade jv2 = new Grade("A Student", "A Class", 100);
		jv2.setGradePoint(40);
		assertEquals('F', jv2.getGradeLetter());
	}

}
