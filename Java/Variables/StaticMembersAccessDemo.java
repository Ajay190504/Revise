// WAP to access static members
// in static and non-static methods using 3 ways

class Demo {

    // Static variable
    static int number = 100;

    // Static method
    static void showMessage() {

        System.out.println("Static method called");
    }



    // Static method
    static void staticMethod() {

        System.out.println("Inside Static Method");


        // First way
        // Direct access
        // Non-recommended for large projects

        System.out.println(number);

        showMessage();



        // Second way
        // Using class name
        // Recommended approach

        System.out.println(Demo.number);

        Demo.showMessage();



        // Third way
        // Using object reference
        // Allowed but non-recommended

        Demo d1 = new Demo();

        System.out.println(d1.number);

        d1.showMessage();
    }



    // Non-static method
    void nonStaticMethod() {

        System.out.println("Inside Non-Static Method");


        // First way
        // Direct access
        // Non-recommended for large projects

        System.out.println(number);

        showMessage();



        // Second way
        // Using class name
        // Recommended approach

        System.out.println(Demo.number);

        Demo.showMessage();



        // Third way
        // Using object reference
        // Allowed but non-recommended

        Demo d2 = new Demo();

        System.out.println(d2.number);

        d2.showMessage();
    }
}



public class StaticMembersAccessDemo {

    public static void main(String[] args) {

        // Calling static method

        Demo.staticMethod();


        System.out.println();


        // Creating object

        Demo d = new Demo();


        // Calling non-static method

        d.nonStaticMethod();
    }
}