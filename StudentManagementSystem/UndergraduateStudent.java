package StudentManagementSystem;

public class UndergraduateStudent extends Student {

    // Constructor
    public UndergraduateStudent(String name, int rollNo, int marks) {
        super(name, rollNo, marks); // Call parent constructor
    }

    // Override displayInfo (Polymorphism)
    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Roll No: " + getRollNo());
        System.out.println("Marks: " + getMarks());
        System.out.println("Grade: " + calculateGrade());
        System.out.println("Type: Undergraduate");
        System.out.println("------------------------------------");
    }
}
