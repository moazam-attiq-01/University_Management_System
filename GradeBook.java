/*
  Name: Moazam Attiq
  Roll No: 221400003
  Project of Object Oriented Programming
*/

import java.util.ArrayList;

class GradeBook{
	private ArrayList<Course> courses;
	private ArrayList<Student> students;
	private char[][] grades;

	public GradeBook(){
		this(new ArrayList<Course>(), new ArrayList<Student>());
	}//def-cons

	public GradeBook(ArrayList<Course> courses, ArrayList<Student> students){
		this.students = students;
		this.courses = courses;
		this.grades = new char[20][60];
	}//2-arg-cons

	public void recordGrade(Student s, Course c, char grade){
		this.students = c.getEnrolledStudents();
		int studentIndex = students.indexOf(s);
		if (studentIndex != -1) {
			this.courses = s.listCourses();
			int courseIndex = courses.indexOf(c);
			if (courseIndex != -1) {
				this.grades[courseIndex][studentIndex] = grade;
			} else {
				System.out.println("Course was not registered by student. ");
			}//if-else
		} else {
			System.out.println("Student was not found in the GradeBook.");
		}//if-else
	}//recordGrade

	public char getGrade(Student s, Course c){
		int studentIndex = students.indexOf(s);
		if (studentIndex != -1) {
			this.courses = s.listCourses();
			int courseIndex = courses.indexOf(c);
			if (courseIndex != -1) {
				return grades[courseIndex][studentIndex];
			} else {
				System.out.println("Course was not registered by student.");
			}//if-else
		} else {
			System.out.println("Student was not found in the GradeBook.");
		}//if-else
		return '0';
	}//getGrade
}//class