package Assignment;

import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;

    void readDetails(Scanner sc) {
        System.out.print("Enter student ID: ");
        id = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter student name: ");
        name = sc.nextLine();
        System.out.print("Enter student age: ");
        age = sc.nextInt();
    }

    void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));
            students[i] = new Student();
            students[i].readDetails(sc);
        }

        System.out.println("\n--- Student Details ---");
        for (Student student : students) {
            student.displayDetails();
        }

        sc.close();}
}

