// Program to demonstrate types of variables in Java

class Student {

    // Static variable
    // Shared among all objects
    static String collegeName = "ABC College";

    // Instance variables
    // Separate copy for every object
    int id;
    String name;

    // Constructor
    Student(int id, String name) {

        // Local variables
        // Declared inside constructor
        int temp = 100;

        System.out.println("Local Variable inside constructor : " + temp);

        this.id = id;
        this.name = name;
    }

    // Method
    void display() {

        // Local variable
        int marks = 85;

        System.out.println("Student ID : " + id);

        System.out.println("Student Name : " + name);

        System.out.println("College Name : " + collegeName);

        System.out.println("Local Variable marks : " + marks);
    }
}

public class VariableTypesDemo {

    public static void main(String[] args) {

        // Local variable
        int number = 10;

        System.out.println("Local Variable in main method : " + number);



        // Creating objects

        Student s1 = new Student(101, "Ajay");

        Student s2 = new Student(102, "Rahul");



        // Accessing instance variables

        System.out.println("\nInstance Variables");

        System.out.println(s1.id);

        System.out.println(s1.name);

        System.out.println(s2.id);

        System.out.println(s2.name);



        // Accessing static variable

        System.out.println("\nStatic Variable");

        System.out.println(Student.collegeName);



        // Calling methods

        System.out.println("\nDisplay Method Output");

        s1.display();

        s2.display();
    }
}