package com.lambton;

import java.time.LocalDate;

public class MainExample
{
    public static void main( String[] args)
    {
        person p1;

        Student s1=new Student(1, "Ritik", "Jagpal", LocalDate.now(),"male","MADT",2);
        //p1=s1;
      //  p1.display();
        faculty f1=new faculty(22,"Pritesh","Patel",LocalDate.now(),"Male","HOD","IT",500000);
        p1=f1;
        p1.display();
    }
}
