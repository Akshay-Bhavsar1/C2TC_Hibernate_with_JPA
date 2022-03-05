package com.tns.jpacrud.client;

import com.tns.jpacrud.entities.Student;
import com.tns.jpacrud.service.StudentService;
import com.tns.jpacrud.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		StudentService service = new StudentServiceImpl();
		
		Student student = new Student();

				
			//create operation
			student.setStudentId(112);
			student.setName("Akshay_Bha");
			service.addStudent(student);

			
/*		
			//Retrieve operation
			student = service.findStudentById(100);
			System.out.println("Id: "+student.getStudentId());
			System.out.println("Name: "+student.getName());


			
			//Update operation
			student = service.findStudentById(100);
			student.setName("Akshay Bhavsr");
			service.updateStudent(student);


			//Delete operation
			student = service.findStudentById(100);
			service.removeStudent(student);
			System.out.println("Deleted Student");
			System.out.println("Id:\t"+student.getStudentId());
			System.out.println("Name:\t"+student.getName());
		*/
			
		

	}

}
