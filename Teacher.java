/*
  Name: Moazam Attiq
  Roll No: 221400003
  Project of Object Oriented Programming
*/

import java.util.ArrayList;

public class Teacher extends Person implements Enrollable{
	private int teacherId;
	private ArrayList<Course> courses;

	public Teacher(){
		this(0, null, 1, null);
	}//def-cons

	public Teacher(int id, String n, int a, String add){
		super(n, a, add);
		setTeacherId(id);
		this.courses = new ArrayList<Course>();
	}//4-arg-cons

	public void setTeacherId(int id){
		this.teacherId = id;
	}//setTeacherId

	public int getTeacherId(){
		return this.teacherId;
	}//getTeacherId

	@Override
	public void enroll(Course c){
		courses.add(c);
	}//enroll

	@Override
	public ArrayList<Course> listCourses(){
		return courses;
	}//listCourses

	public void editInfo(String newName, int newAge, String newAdd) {
		super.setName(newName);
		super.setAge(newAge);
		super.setAddress(newAdd);
    }//editInfo

    public void getInfo() {
		System.out.println("Teacher Information:");
		System.out.println("Name: " + getName());
		System.out.println("Age: " + getAge());
		System.out.println("Address: " + getAddress());
		System.out.println("Teacher ID: " + getTeacherId());
		System.out.println();
    }//getInfo
}//class