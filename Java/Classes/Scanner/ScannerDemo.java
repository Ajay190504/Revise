// WAP to take inputs using Scanner class

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        // Creating Scanner object

        Scanner sc = new Scanner(System.in);



        // Taking byte input

        System.out.print("Enter Byte Value : ");

        byte byteValue = sc.nextByte();



        // Taking short input

        System.out.print("Enter Short Value : ");

        short shortValue = sc.nextShort();



        // Taking int input

        System.out.print("Enter ID : ");

        int id = sc.nextInt();



        // Taking long input

        System.out.print("Enter Long Value : ");

        long longValue = sc.nextLong();



        // Taking float input

        System.out.print("Enter Salary : ");

        float salary = sc.nextFloat();



        // Taking double input

        System.out.print("Enter Percentage : ");

        double percentage = sc.nextDouble();



        // Taking boolean input

        System.out.print("Are you placed? (true/false) : ");

        boolean placed = sc.nextBoolean();



        // Clearing buffer

        sc.nextLine();



        // Taking String input

        System.out.print("Enter Name : ");

        String name = sc.nextLine();



        // Taking single word input

        System.out.print("Enter City : ");

        String city = sc.next();



        // Taking character input

        System.out.print("Enter Grade : ");

        char grade = sc.next().charAt(0);



        // Printing output

        System.out.println("\nEntered Details");

        System.out.println("Byte Value : " + byteValue);

        System.out.println("Short Value : " + shortValue);

        System.out.println("ID : " + id);

        System.out.println("Long Value : " + longValue);

        System.out.println("Salary : " + salary);

        System.out.println("Percentage : " + percentage);

        System.out.println("Placed : " + placed);

        System.out.println("Name : " + name);

        System.out.println("City : " + city);

        System.out.println("Grade : " + grade);



        // Closing scanner object

        sc.close();
    }
}