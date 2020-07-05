package com.aipalbot.student.firstoop.services;

import com.aipalbot.student.firstoop.model.Student;

public class StudentServices {
	
	public String getProfile(Student student) {
		
		String displayProfile = "\n Student name: " + student.getName() + "\n Student Dept: " + student.getDept() + "\n Student Level:" + "L"  + student.getLevel() + "\n Student Height: " + "FT" + student.getHeight() + "\n Student Race: " + student.getRace() + "\n Student Gender: " + student.getGender() + "\n Student Matric Number: " + student.getMatricNumber();
		
		return displayProfile;
		
	}
	
	public Student setDisplayProfile (String name, String dept, String level, double height, String race, String gender, int matricNumber) {
		
		Student student = new Student();
		
		student.setName(name);
		student.setDept(dept);
		student.setLevel(level);
		student.setHeight(height);
		student.setRace(race);
		student.setGender(gender);
		student.setMatricNumber(matricNumber);
		
		return student;
		
		
	}
	

}
