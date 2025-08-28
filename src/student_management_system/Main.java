package student_management_system;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		
		do {
			System.out.println("✨ Student Management System 👨🏻‍🎓🌟");
			System.out.println("1. Display all Students");
			System.out.println("2. View Student by ID");
			System.out.println("3. Add new Student");
			System.out.println("4. Update student Info");
			System.out.println("5. Remove student by ID");
			System.out.println("6. Exit");
			System.out.println("👉 Enter your Choice : ");
			choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
						case 1 -> StudentDAO.viewAllStudents();
						case 2 -> {
							System.out.print("Enter student ID : ");
							int id = sc.nextInt();
							StudentDAO.studentbyID(id);
						}
						case 3 -> {
							System.out.print("Enter student name 👨🏻‍🎓 :");
							String name = sc.nextLine();
							System.out.print("Enter course 📚 :");
							String course = sc.nextLine();
							System.out.println("Enter student age :");
							int age = sc.nextInt();
							StudentDAO.addStudent(new Student(name,course,age));
						}
						case 4 -> {
							System.out.println("Enter id to update : ");
							int id = sc.nextInt();
							System.out.println("Enter new name : ");
							sc.nextLine();
							String name = sc.nextLine();
							System.out.println("Enter new course 📚 :");
							String course = sc.nextLine();
							System.out.println("Enter student age :");
							int age = sc.nextInt();
							StudentDAO.updateStudent(new Student(id,name,course,age));
						}
						case 5 -> {
							System.out.println("Enter student id to remove :");
							int id = sc.nextInt();
							StudentDAO.removeStudent(id);
						}
						case 6 -> System.out.println("Exiting, Thank you 😊");
						default -> System.out.println("Invalid option! try again..\n\n");
			
			}
		}  while(choice != 6);
		sc.close();
		
	}
}
