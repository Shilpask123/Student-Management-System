package StudentManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    // List to store students
    private ArrayList<Student> students;
    private Scanner scanner;

    // Constructor
    public StudentManagement() {
        students = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    // Add student
    public void addStudent() {
        System.out.print("Enter Student Type (UG/PG): ");
        String type = scanner.nextLine().toUpperCase();

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll No: ");
        int rollNo = scanner.nextInt();

        System.out.print("Enter Marks: ");
        int marks = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        Student student;

        if (type.equals("UG")) {
            student = new UndergraduateStudent(name, rollNo, marks);
        } else if (type.equals("PG")) {
            student = new GraduateStudent(name, rollNo, marks);
        } else {
            System.out.println("Invalid student type!");
            return;
        }

        students.add(student);
        System.out.println("Student added successfully!\n");
    }

    // View all students
    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }

        System.out.println("===== Student List =====");
        for (Student student : students) {
            student.displayInfo();
        }
        System.out.println("Total Students: " + students.size());
    }

    // Delete student by roll number
    public void deleteStudent() {
        System.out.print("Enter Roll No of student to delete: ");
        int rollNo = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        boolean removed = false;
        for (Student student : students) {
            if (student.getRollNo() == rollNo) {
                students.remove(student);
                removed = true;
                System.out.println("Student removed successfully!\n");
                break;
            }
        }

        if (!removed) {
            System.out.println("Student not found!\n");
        }
    }
}
