package StudentManagementSystem;

// Abstract class for common student behavior
public abstract class Student {
    // Encapsulated fields
    private String name;
    private int rollNo;
    private int marks;

    // Constructor
    public Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Abstract method (Polymorphism: to be overridden)
    public abstract void displayInfo();

    // Method to calculate grade
    public String calculateGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B+";
        else if (marks >= 60) return "B";
        else return "C";
    }
}
