package com.videxedge;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void q1() {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println ("Enter int number:");
        num = input.nextInt();
        if (num > 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void q2() {
        Scanner input = new Scanner(System.in);
        int price;
        System.out.println ("Enter the price:");
        price = input.nextInt();
        if (price < 150) {
            System.out.println("Great price");
        } else if (price < 250) {
            System.out.println("Reasonable price");
        } else {
            System.out.println("Expensive but high quality");
        }
        System.out.println("Thank you for using David and Itamar's test program");
    }

    public static void q3() {
        Scanner input = new Scanner(System.in);
        int campers;
        System.out.println ("Enter number of campers:");
        campers = input.nextInt();
        if (campers > 30) {
            System.out.println("You are excellent instructors");
        } else if (campers > 19) {
            System.out.println("The largest number of campers in the branch");
        } else if (campers > 9) {
            System.out.println("Reasonable number of campers");
        } else {
            System.out.println("Campers must be urgently recruited to the tribe");
        }
        System.out.println("Youth movement - to realize the vision of creating a learning and doing society");
    }

    public static void q5() {
        Scanner input = new Scanner(System.in);
        int students;
        System.out.println ("Enter number of students:");
        students = input.nextInt();
        if (students > 100) {
            System.out.println("The sum to pay is: "+ 43*students);
        } else {
            System.out.println("The sum to pay is: "+ 48*students);
        }
    }

    public static void q6() {
        Scanner input = new Scanner(System.in);
        String name;
        int sections;
        System.out.println ("Enter the driver name:");
        name = input.next();
        System.out.println ("Enter the road sections:");
        sections = input.nextInt();
        if (sections > 8) {
            System.out.println(name+" have to pay: "+(30*sections-10));
        } else {
            System.out.println(name+" have to pay: "+(30*sections));
        }
    }

    public static void q7() {
        Scanner input = new Scanner(System.in);
        String name;
        int absences;
        System.out.println ("Enter the student name:");
        name = input.next();
        System.out.println ("Enter number of absences:");
        absences = input.nextInt();
        System.out.print(name+" have "+absences+" absences. ");
        if (absences > 5) {
            System.out.println("WARNING!");
        } else if (absences == 0) {
            System.out.println("EXCELLENT");
        } else {
            System.out.println("");
        }
    }

    public static void q9() {
        Scanner input = new Scanner(System.in);
        String name;
        int classes;
        System.out.println ("Enter the student name:");
        name = input.next();
        System.out.println ("Enter number of classes:");
        classes = input.nextInt();
        System.out.println(name+" have to pay "+100*classes);
        if (classes > 5) {
            System.out.println(name + " Gift");
        }
    }

    public static void q10a() {
        Scanner input = new Scanner(System.in);
        String factory;
        int wheels;
        System.out.println ("Enter factory name:");
        factory = input.next();
        System.out.println ("Enter number of wheels:");
        wheels = input.nextInt();
        if (wheels > 4) {
            System.out.println(factory+" HEAVY");
        } else if (wheels == 2) {
            System.out.println(factory+" TWO");
        } else if (wheels < 1) {
            System.out.println(factory+" ERROR");
        } else {
            System.out.println("Have a good day");
        }
    }

    public static void q10b() {
        Scanner input = new Scanner(System.in);
        int dishes, price;
        System.out.println ("Enter number of dishes:");
        dishes = input.nextInt();
        System.out.println ("Enter price of dish:");
        price = input.nextInt();
        if (dishes > 50) {
            System.out.println("You have to pay: "+ (price*(dishes-2)));
        } else {
            System.out.println("You have to pay: "+ (price*dishes));
        }
    }

    public static void q11() {
        Scanner input = new Scanner(System.in);
        int age, tickets;
        System.out.println ("Enter age of passenger:");
        age = input.nextInt();
        System.out.println ("Enter number of tickets:");
        tickets = input.nextInt();
        if (age <= 18) {
            System.out.println("YOUTH");
            System.out.println("You have to pay: "+ 40*tickets);
        } else {
            System.out.println("ADULT");
            System.out.println("You have to pay: "+ 60*tickets);
        }
    }

    public static void q12() {
        Scanner input = new Scanner(System.in);
        int class10, class11;
        System.out.println ("Enter points of class 10:");
        class10 = input.nextInt();
        System.out.println ("Enter points of class 10:");
        class11 = input.nextInt();
        if (class11 > class10) {
            System.out.println("Number of winning class: "+ class11);
        } else {
            System.out.println("Number of winning class: "+ class10);
        }
        System.out.println("The diff between classes: "+ (int)Math.abs(class11-class10));
    }

    public static void main(String[] args) {
        q1();
        q2();
        q3();
        q5();
        q6();
        q7();
        q9();
        q10a();
        q10b();
        q11();
        q12();
    }
}
