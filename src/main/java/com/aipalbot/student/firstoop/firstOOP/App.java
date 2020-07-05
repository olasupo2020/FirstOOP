package com.aipalbot.student.firstoop.firstOOP;

import java.util.Scanner;

import com.aipalbot.student.firstoop.model.Student;
import com.aipalbot.student.firstoop.services.StudentServices;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("*********************************STUDENT PROFILE******************* ");
    	
    	Scanner input1 = new Scanner(System.in);
    	System.out.println("Enter Student Name: ");
    	String name = input1.nextLine();
    	
    	System.out.println("Enter Student Dept: ");
    	String dept = input1.nextLine();
    	
    	System.out.println("Enter Student Level: ");
    	String level = input1.nextLine();
    	
    	Scanner input2 = new Scanner(System.in);
    	System.out.println("Enter Student Height: ");
    	String height = input2.nextLine();
    	double h = Double.parseDouble(height);
    	
    	System.out.println("Enter Student Race: ");
    	String race = input2.nextLine();
    	
    	System.out.println("Enter Student Gender: ");
    	String gender = input2.nextLine();
    	
    	System.out.println("Enter Student MATRIC NUMBER: ");
    	int matricNumber = input2.nextInt();
    	
    	StudentServices studentServices = new StudentServices();
    	
    	Student profileStudent = studentServices.setDisplayProfile (name, dept, level, h, race, gender, matricNumber);
    	
        System.out.println( studentServices.getProfile(profileStudent));
        
    }
}
