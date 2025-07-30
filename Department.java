/*
  Name: Moazam Attiq
  Roll No: 221400003
  Project of Object Oriented Programming
*/

import java.util.ArrayList;

public class Department{
	private String departmentName;
	private ArrayList<Student> students;

	public Department(){
		this(null);
	}//def-cons

	public Department(String n){
		this.departmentName = departmentName;
		this.students = new ArrayList<Student>();
	}//1-arg-cons

	public void addStudent(Student s){
		students.add(s);
	}//addStudent

	public void removeStudent(Student s){
		students.remove(s);
	}//removeStudent

	public ArrayList<Student> getStudents(){
		return students;
	}//getStudents
}//class