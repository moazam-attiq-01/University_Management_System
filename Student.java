/*
  Name: Moazam Attiq
  Roll No: 221400003
  Project of Object Oriented Programming
*/

import java.util.ArrayList;

public class Student extends Person implements Enrollable{
	private int studentId;
	private ArrayList<Course> enrolledCourses;
    private ArrayList<Attendance> attendance;
    private GradeBook gradeBook;

    public Student(){
    	this(0, null, 1, null);
    }//def-cons

    public Student(int id, String n, int a, String add){
    	super(n, a, add);
    	setStudentId(id);
    	this.enrolledCourses = new ArrayList<Course>();
    	this.attendance = new ArrayList<Attendance>();
    	this.gradeBook = new GradeBook(enrolledCourses, new ArrayList<Student>());
    }//4-arg-cons

    public void setStudentId(int id){
		this.studentId = id;
	}//setStudentId

	public int getStudentId(){
		return this.studentId;
	}//getStudentId

	@Override
	public void enroll(Course c){
		enrolledCourses.add(c);
		c.enrollStudent(this);
	}//enroll

	@Override
	public ArrayList<Course> listCourses(){
		return enrolledCourses;
	}//listCourses

	public void editInfo(String newName, int newAge, String newAdd) {
		super.setName(newName);
		super.setAge(newAge);
		super.setAddress(newAdd);
	}//editInfo

    public void getInfo() {
		System.out.println("Student Information:");
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Address: " + getAddress());
		System.out.println("Student ID: " + getStudentId());
		System.out.println();
	}//getInfo
}//class