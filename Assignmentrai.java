import java.util.Scanner;

class Student {
    // Static variable to track the total number of students
    static int totalStudents = 0;

    // Final variable for course name
    final String courseName = "Artificial Intelligence and Data Science";

    // Instance variables for student details
    String name;
    int id;
    double marks;
    String grade;

    // Default constructor to initialize with default values
    public Student() {
        name = "Unknown";
        id = 0;
        marks = 0;
        grade = "Not Assigned";
        totalStudents++;  // Increment the total student count
    }

    // Parameterized constructor to initialize with user input
    public Student(String name, int id, double marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
        this.grade = assignGrade(marks);
        totalStudents++;  // Increment the total student count
    }

    // Method to assign grade based on marks
    private String assignGrade(double marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
        System.out.println();
    }

    // Static method to display the total number of students
    public static void displayTotalStudents() {
        System.out.println("Total number of students: " + totalStudents);
    }
}

public class Assignmentrai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Fixed number of students
        System.out.print("enter number of student : ");
        int numOfStudents = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[numOfStudents];

        // Loop to gather student data for exactly 4 students
        for (int i = 0; i < numOfStudents; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            // Get name

            // Validate ID input
          

            // Validate Marks input
            double marks = -1;
            while (true) {
                System.out.print("Marks: ");
                if (scanner.hasNextDouble()) {
                    marks = scanner.nextDouble();
                    scanner.nextLine(); 
                    break;
                } else {
                    System.out.println("Invalid Marks. Please enter a valid number.");
                    scanner.nextLine();  
                }
            }

           
            students[i] = new Student(name, id, marks);
        }

        // Displaying student details
        for (Student student : students) {
            student.displayDetails();
        }

        // Display total number of students
        Student.displayTotalStudents();

        scanner.close();  // Close the scanner
    }
}
