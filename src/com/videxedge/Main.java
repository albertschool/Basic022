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
        name = input.nextLine();
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
        name = input.nextLine();
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
        name = input.nextLine();
        System.out.println ("Enter number of classes:");
        classes = input.nextInt();
        System.out.println(name+" have to pay "+100*classes);
        if (classes > 5) {
            System.out.println(name + " Gift");
        }
    }

    public static void q10a() {

    }

    public static void q10b() {

    }

    public static void q11() {

    }

    public static void q12() {

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
