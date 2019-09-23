package com.lambton;

import org.graalvm.compiler.core.common.type.ArithmeticOpTable;

import java.lang.ref.SoftReference;
import java.time.LocalDate;

public class Student extends person
{
    private String courseName;
    private int currentSemester;

    public Student(int id) {
        super(id);
    }


    public Student(int id, String firstName, String lastName, LocalDate birthDate, String gender, String courseName, int currentSemester) {
        super(id, firstName, lastName, birthDate, gender);
        this.courseName = courseName;
        this.currentSemester = currentSemester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }
    @Override
    public void display() {
        System.out.printf("Student id :"+getId());
        System.out.printf("Student First Name :"+getFirstName());
        System.out.printf("Student Last Name :"+getLastName());
        System.out.printf("Student Gender :"+getGender());
        System.out.printf("Student Course :"+getCourseName());
        System.out.printf("Student Current sem :"+getCurrentSemester());
        System.out.printf("Date of birth :"+getBirthDate());

    }

}
