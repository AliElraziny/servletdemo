package com.trytocode.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	
	public static List<Student> getStudents(){
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Mohamed","Ahmed","AA@gmail"));
		students.add(new Student("Samy","Ahmed","SA@gmail"));
		students.add(new Student("Ziad","Samir","ZS@gmail"));
		
		return students;
	} 

}
