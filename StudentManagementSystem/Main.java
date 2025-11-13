package StudentManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManagement management = new StudentManagement();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("===== Student Management System =====");

        while (!exit) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    management.addStudent();
                    break;
                case 2:
                    management.viewAllStudents();
                    break;
                case 3:
                    management.deleteStudent();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 1-4.");
            }
        }

        scanner.close();
    }
}
