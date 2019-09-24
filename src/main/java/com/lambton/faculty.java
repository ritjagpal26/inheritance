package com.lambton;

import java.time.LocalDate;

public class faculty extends person {
    private String desgination;
   private String specialization;
    private float salary;

    public faculty(int id, String firstName, String lastName, LocalDate birthDate, String gender) {
        super(id, firstName, lastName, birthDate, gender);
    }

    public String getDesignation() {
        return desgination;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public faculty(int id, String firstName, String lastName, LocalDate birthDate, String gender, String desgination, String specialization, float salary) {
        super(id, firstName, lastName, birthDate, gender);
        this.desgination = desgination;
        this.specialization = specialization;
        this.salary = salary;
    }

    @Override
    public void display() {
        System.out.println(" Id :"+getId());
        System.out.println(" First Name :"+getFirstName());
        System.out.println(" Last Name :"+getLastName());
        System.out.println(" Gender :"+getGender());
        System.out.println("Designation :"+ getDesignation());
        System.out.println("Specialization :"+getSpecialization());
        System.out.println("Date of birth :"+getBirthDate());
        System.out.println("Salary :"+getSalary());

    }
}
