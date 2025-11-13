package StudentManagementSystem;

public class GraduateStudent extends Student {

    // Constructor
    public GraduateStudent(String name, int rollNo, int marks) {
        super(name, rollNo, marks);
    }

    // Override displayInfo (Polymorphism)
    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Roll No: " + getRollNo());
        System.out.println("Marks: " + getMarks());
        System.out.println("Grade: " + calculateGrade());
        System.out.println("Type: Graduate");
        System.out.println("------------------------------------");
    }
}
