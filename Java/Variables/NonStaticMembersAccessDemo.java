// WAP to access non-static members
// in static and non-static methods using different ways

class Student {

    // Non-static variable
    int id = 101;

    // Non-static method
    void display() {

        System.out.println("Non-static method called");
    }



    // Static method
    static void staticMethod() {

        System.out.println("Inside Static Method");


        // First way
        // Direct access
        // Not possible in static method
        // Non-static members require object

        // System.out.println(id);      // Error
        // display();                  // Error



        // Second way
        // Using object reference
        // Recommended approach

        Student s1 = new Student();

        System.out.println(s1.id);

        s1.display();



        // Third way
        // Using another object reference
        // Also valid

        Student s2 = new Student();

        System.out.println(s2.id);

        s2.display();
    }



    // Non-static method
    void nonStaticMethod() {

        System.out.println("Inside Non-Static Method");


        // First way
        // Direct access
        // Recommended inside same class

        System.out.println(id);

        display();



        // Second way
        // Using this keyword
        // Recommended for clarity

        System.out.println(this.id);

        this.display();



        // Third way
        // Using object reference
        // Allowed but mostly non-recommended
        // when accessing own members

        Student s3 = new Student();

        System.out.println(s3.id);

        s3.display();
    }
}



public class NonStaticMembersAccessDemo {

    public static void main(String[] args) {

        // Calling static method

        Student.staticMethod();


        System.out.println();


        // Creating object

        Student s = new Student();


        // Calling non-static method

        s.nonStaticMethod();
    }
}