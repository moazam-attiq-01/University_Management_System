/*
  Name: Moazam Attiq
  Roll No: 221400003
  Project of Object Oriented Programming
*/

import java.util.ArrayList;

class Course{
	private String cName, cCode;
	private Teacher teacher;
	private ArrayList<Student> enrolledStudents;

	public Course(){
		this(null, null);
	}//def-cons

	public Course(String name, String code){
		this.cCode = code;
        this.cName = name;
		this.enrolledStudents = new ArrayList<Student>();
	}//2-arg-cons

	public String getCourseName(){
		return cName;
	}//getCourseName

	public String getCourseCode(){
		return cCode;
	}//getCourseCode

	public void assignTeacher(Teacher t){
        this.teacher = t;
    }//assignTeacher

    public Teacher getTeacher(){
        return teacher;
    }//getTeacher

    public void enrollStudent(Student s){
        enrolledStudents.add(s);
    }//enrollStudent

    public ArrayList<Student> getEnrolledStudents(){
		return enrolledStudents;
    }//getEnrolledStudents
}//class