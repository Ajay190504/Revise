// Program to demonstrate primitive and reference (non-primitive) data types in Java

// Interface
interface Payment {

    void pay();
}

// Abstract class
abstract class Vehicle {

    abstract void start();
}

// Enum
enum Day {

    MONDAY,
    TUESDAY,
    WEDNESDAY
}

// Class
class Student {

    int id;
    String name;

    // Constructor
    Student(int id, String name) {

        this.id = id;
        this.name = name;
    }

    // Method
    void display() {

        System.out.println("Student ID : " + id);
        System.out.println("Student Name : " + name);
    }
}

// Interface implementation
class PhonePe implements Payment {

    @Override
    public void pay() {

        System.out.println("Payment completed using PhonePe");
    }
}

// Abstract class implementation
class Car extends Vehicle {

    @Override
    void start() {

        System.out.println("Car started");
    }
}

// Main class
public class DataTypesDemo {

    public static void main(String[] args) {

        // Primitive data types

        byte byteValue = 127;

        short shortValue = 32000;

        int intValue = 100000;

        long longValue = 9999999999L;

        float floatValue = 10.5f;

        double doubleValue = 99.999;

        char charValue = 'A';

        boolean booleanValue = true;

        System.out.println("Primitive Data Types");

        System.out.println("Byte Value : " + byteValue);

        System.out.println("Short Value : " + shortValue);

        System.out.println("Int Value : " + intValue);

        System.out.println("Long Value : " + longValue);

        System.out.println("Float Value : " + floatValue);

        System.out.println("Double Value : " + doubleValue);

        System.out.println("Char Value : " + charValue);

        System.out.println("Boolean Value : " + booleanValue);



        // String

        String name = "Ajay";

        System.out.println("\nString");

        System.out.println("Name : " + name);

        System.out.println("Length : " + name.length());

        System.out.println("Uppercase : " + name.toUpperCase());



        // Array

        int arr[] = {10, 20, 30, 40};

        System.out.println("\nArray");

        for(int num : arr) {

            System.out.println(num);
        }



        // Class and Object

        System.out.println("\nClass and Object");

        Student s1 = new Student(101, "Rahul");

        s1.display();



        // Interface

        System.out.println("\nInterface");

        Payment p = new PhonePe();

        p.pay();



        // Abstract class

        System.out.println("\nAbstract Class");

        Vehicle v = new Car();

        v.start();



        // Enum

        System.out.println("\nEnum");

        Day today = Day.MONDAY;

        System.out.println("Today is : " + today);



        // Wrapper classes

        System.out.println("\nWrapper Classes");

        Integer integerValue = 100;

        Double wrapperDouble = 99.99;

        Character wrapperChar = 'Z';

        Boolean wrapperBoolean = true;

        System.out.println("Integer : " + integerValue);

        System.out.println("Double : " + wrapperDouble);

        System.out.println("Character : " + wrapperChar);

        System.out.println("Boolean : " + wrapperBoolean);



        //Collections
        // ArrayList

        System.out.println("\nArrayList");

        java.util.ArrayList<String> list =
                new java.util.ArrayList<>();

        list.add("Java");

        list.add("Spring");

        list.add("Hibernate");

        for(String course : list) {

            System.out.println(course);
        }



        // HashMap

        System.out.println("\nHashMap");

        java.util.HashMap<Integer, String> map =
                new java.util.HashMap<>();

        map.put(1, "Ajay");

        map.put(2, "Rahul");

        for(Integer key : map.keySet()) {

            System.out.println(key + " : " + map.get(key));
        }



        // HashSet

        System.out.println("\nHashSet");

        java.util.HashSet<Integer> set =
                new java.util.HashSet<>();

        set.add(10);

        set.add(20);

        set.add(30);

        for(Integer value : set) {

            System.out.println(value);
        }
    }
}
