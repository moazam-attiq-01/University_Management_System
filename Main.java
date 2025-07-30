/*
  Name: Moazam Attiq
  Roll No: 221400003
  Project of Object Oriented Programming
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create students
        Student moazam = new Student(221400003, "Moazam Attiq", 20, "Daska City");
        Student abdullah = new Student(221400001, "Abdullah", 19, "Gujranwala City");

        // Create a teacher
        Teacher mFiza = new Teacher(175092 , "Ms. Fiza", 25, "Gujranwala City");

        // Create courses
        Course oop = new Course("CS-239", "Object Oriented Programming");
        Course discrete = new Course("CS-107", "Discrete Mathematics");

        // Enroll students in courses
        moazam.enroll(oop);
        moazam.enroll(discrete);
        abdullah.enroll(oop);

        mFiza.enroll(oop);
        mFiza.enroll(discrete);

        // Create a department
        Department csDepartment = new Department("Computer Science Department");
        csDepartment.addStudent(moazam);
        csDepartment.addStudent(abdullah);

        // Record attendance
        Attendance oopAttendance = new Attendance(oop, 2);
        oopAttendance.recordAttendance(moazam, true);
        oopAttendance.recordAttendance(abdullah, false);

        // Record grades
        GradeBook gradeBook = new GradeBook();
        gradeBook.recordGrade(moazam, oop, 'A');
        gradeBook.recordGrade(abdullah, oop, 'B');
        gradeBook.recordGrade(moazam, discrete, 'B');

        // Test getInfo and editInfo methods
        moazam.getInfo();
        moazam.editInfo("Moazam Attiq Mughal", 19, "Pasrur Road, Daska");
        moazam.getInfo();

        mFiza.getInfo();
        mFiza.editInfo("Ms. Fiza", 26, "Satellite Town, Gujranwala");
        mFiza.getInfo();

        // List courses for students and teachers
        ArrayList<Course> moazamCourses = moazam.listCourses();
        ArrayList<Course> mFizaCourses = mFiza.listCourses();

        System.out.println("Courses for Moazam:");
        for (Course course : moazamCourses) {
            System.out.println(course.getCourseName());
        }//for

        System.out.println("\nCourses for Ms. Fiza:");
        for (Course course : mFizaCourses) {
            System.out.println(course.getCourseName());
        }//for

        // Get and display attendance record
        boolean[] moazamAttendanceRecord = oopAttendance.getAttendanceRecord(moazam);
        String attendanceStatus = Arrays.toString(moazamAttendanceRecord);
        System.out.println("\nAttendance Record for Moazam in OOP Course:\n" + attendanceStatus);

        // Get and display grades
        char moazamOopGrade = gradeBook.getGrade(moazam, oop);
        char moazamDiscreteGrade = gradeBook.getGrade(moazam, discrete);
        System.out.println("\nGrades for Moazam:");
        System.out.println("OOP: " + moazamOopGrade);
        System.out.println("Discrete Mathematics: " + moazamDiscreteGrade);
    }//main
}//class