/*
  Name: Moazam Attiq
  Roll No: 221400003
  Project of Object Oriented Programming
*/

import java.util.ArrayList;

public class Attendance{
	private Course course;
	private ArrayList<Student> students;
	private boolean[][] attendanceRecord;

	public Attendance(){
		this(null, 0);
	}//def-cons

	public Attendance(Course course, int numOfStudents) {
		this.course = course;
        this.students = this.course.getEnrolledStudents();
        this.attendanceRecord = new boolean[numOfStudents][30];
    }//2-arg-cons

    public void recordAttendance(Student s, boolean status){
    	int studentIndex = students.indexOf(s);
    	if (studentIndex != -1) {
    		for (int i = 0; i < attendanceRecord[studentIndex].length; ++i) {
    			attendanceRecord[studentIndex][i] = status;
    		}//for
    	} else {
    		System.out.println("No such student found in attendance record.");
    	}//if-else
    }//recordAttendace

    public boolean[] getAttendanceRecord(Student s) {
    	int studentIndex = students.indexOf(s);

    	if (studentIndex != -1) {
    		return attendanceRecord[studentIndex];
    	}//if
		System.out.println("Student not found in the attendance record.");
		return new boolean[0];
	}//getAttendanceRecord
}//class