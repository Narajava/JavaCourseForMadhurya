package edu.java.basics.collections.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.java.basics.collections.vector.Student;

public class ArrayListDemo2 {

	public static void main(String[] args) {

		List<Student> listObj = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("Do you like to enter Student details? (Y/YES Or Anything to NO)");

			String choice = scanner.next();

			if ("Y".equalsIgnoreCase(choice) || "YES".equalsIgnoreCase(choice)) {

				System.out.println("Enter Student no");

				int studentNo = scanner.nextInt();

				System.out.println("Enter Student Name");

				String studentName = scanner.next();

				Student st = new Student(studentNo, studentName);
				listObj.add(st);

			} else {
				break;
			}

		}
		
		for(Student stu:listObj) {
			System.out.println("No: "+stu.getStudentNo()+" Name: "+stu.getStudentName());
		}

	}

}
