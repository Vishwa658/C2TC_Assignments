package entityclassassignment1;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Arun", "IT");
        Student s2 = new Student(102, "Divya", "CSE");
        Student s3 = new Student(103, "Kiran", "ECE");

        System.out.println("Student Details:");
        s1.display();
        s2.display();
        s3.display();
    }
}
