## 🧑‍🎓 Student Management System

A simple **console-based Java application** that demonstrates **Object-Oriented Programming (OOP)** concepts like Classes, Objects, Inheritance, Polymorphism, Encapsulation, and Abstraction.  
It allows users to **add, view, and delete student records**.

---

### 🧩 Features
- ➕ Add new students (Undergraduate or Graduate)  
- 📜 View all student details  
- ❌ Delete student by Roll Number  
- 🧠 Uses **OOP concepts** (Class, Object, Inheritance, Polymorphism, etc.)  
- 📦 Console-based and beginner-friendly project  

---

### 🧠 Concepts Used
| Concept | Description |
|----------|--------------|
| **Class & Object** | `Student`, `UndergraduateStudent`, `GraduateStudent` |
| **Constructor & this keyword** | Initializes student data |
| **Encapsulation** | Private fields with Getters/Setters |
| **Inheritance** | UG & PG classes extend `Student` |
| **Polymorphism** | Overridden `displayInfo()` method |
| **Abstraction** | Abstract `Student` class |
| **Access Modifiers** | Public & Private fields/methods |
| **Static** | (Can be used to count total students) |

---

### ▶️ How to Run

#### 1️⃣ Clone this repository:
```bash
git clone https://github.com/Shilpask123/Student-Management-System.git
```
#### 2️⃣ Open in your IDE:

Open the folder in IntelliJ IDEA or Eclipse.

#### 3️⃣ Run the program:

Run the Main.java file.
Follow the console instructions.

---

### 🧾 Sample Output

```bash
===== Student Management System =====

1. Add Student
2. View All Students
3. Delete Student
4. Exit
Enter your choice: 1
Enter Student Type (UG/PG): UG
Enter Name: Shilpa KAmable
Enter Roll No: 41
Enter Marks: 89
Student added successfully!


1. Add Student
2. View All Students
3. Delete Student
4. Exit
Enter your choice: 1
Enter Student Type (UG/PG): PG
Enter Name: Ajay S K
Enter Roll No: 56
Enter Marks: 98
Student added successfully!


1. Add Student
2. View All Students
3. Delete Student
4. Exit
Enter your choice: 2
===== Student List =====
Name: Shilpa KAmable
Roll No: 41
Marks: 89
Grade: A
Type: Undergraduate
------------------------------------
Name: Ajay S K
Roll No: 56
Marks: 98
Grade: A+
Type: Graduate
------------------------------------
Total Students: 2

1. Add Student
2. View All Students
3. Delete Student
4. Exit
Enter your choice: 3
Enter Roll No of student to delete: 41
Student removed successfully!


1. Add Student
2. View All Students
3. Delete Student
4. Exit
Enter your choice: 2
===== Student List =====
Name: Ajay S K
Roll No: 56
Marks: 98
Grade: A+
Type: Graduate
------------------------------------
Total Students: 1

1. Add Student
2. View All Students
3. Delete Student
4. Exit
Enter your choice: 1
Enter Student Type (UG/PG): Roopa Kambale
Enter Name: Roopa Kambale
Enter Roll No: 43
Enter Marks: 86
Invalid student type!

1. Add Student
2. View All Students
3. Delete Student
4. Exit
Enter your choice: 2
===== Student List =====
Name: Ajay S K
Roll No: 56
Marks: 98
Grade: A+
Type: Graduate
------------------------------------
Total Students: 1

1. Add Student
2. View All Students
3. Delete Student
4. Exit
Enter your choice: 1
Enter Student Type (UG/PG): PG
Enter Name: Roopa Kambale
Enter Roll No: 43
Enter Marks: 87
Student added successfully!


1. Add Student
2. View All Students
3. Delete Student
4. Exit
Enter your choice: 2
===== Student List =====
Name: Ajay S K
Roll No: 56
Marks: 98
Grade: A+
Type: Graduate
------------------------------------
Name: Roopa Kambale
Roll No: 43
Marks: 87
Grade: A
Type: Graduate
------------------------------------
Total Students: 2

1. Add Student
2. View All Students
3. Delete Student
4. Exit
Enter your choice: 4
Exiting... Thank you!
```
---

### 💻 Project Structure

```bash
StudentManagementSystem/
├── Main.java
├── Student.java
├── UndergraduateStudent.java
├── GraduateStudent.java
└── StudentManagement.java
```
---

### 📚 Learnings

- Through this project, I learned:

- How to design and structure a Java application using OOP principles

- How inheritance and polymorphism make code reusable and flexible

- How abstraction helps hide details and show only essential information
