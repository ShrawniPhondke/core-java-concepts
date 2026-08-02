package Java;

import java.util.Scanner;

public class ef_else {
    public static void main(String[]args){


//        int age = 18;
////
//        if (age > 18 && age < 30) {
//
//            System.out.println("eligible for voting");
//        } else {
//            System.out.println("not eligible for voting");
//        }


//        int score = 90;
//        if(score  > 70 || score < 85){
//            System.out.println("Admission");
//        }
////        else{
////            System.out.println("not Admission");
//        }


//        boolean isLoggedIn = true;
//
//        if (!isLoggedIn) {
//            System.out.println("Please login first.");
//        } else {
//            System.out.println("Welcome!");
//        }


//        int a = 19;
//
//        if(a % 2 == 0)
//    {
//        System.out.println("even");
//    } else {
//            System.out.println("odd");
//        }


//        int a = 10;
//        int b= 2;
//        System.out.println(a / b);
//        System.out.println(a % b);

//        int marks = 85;
//
//        if(marks >= 90){
//            System.out.println("A");
//        }
//        else if (marks >= 80){
//            System.out.println("B");
//        }
//        else if (marks >= 70){
//            System.out.println("C");
//        }
//        else {
//            System.out.println("FAIL");
//        }

        int a = 12;
        boolean overweight = false;
        if (a >= 18){
           if(overweight){
               System.out.println("BMI LOW");
           }
        }

        int b = 30;
        boolean hi = false;
        if(b >= 20){
            if(hi){
                System.out.println("shrawni");
            }
        }

        boolean pin = true;
        int balance = 10000;
        int withdraw = 5000;
        if(pin){
            if(balance >= withdraw){
                System.out.println("MONEY");
            }
        }

        int age = 20;
        boolean hasLicense = true;

        if (age >= 18) {

            if (hasLicense) {
                System.out.println("Can Drive");
            }


            boolean usernameCorrect = true;
            boolean passwordCorrect = true;

            if (usernameCorrect) {

                if (passwordCorrect) {
                    System.out.println("Login Successful");
                } else {
                    System.out.println("Wrong Password");
                }

            } else {
                System.out.println("User Not Found");
            }

        }


        int ag = 16;
        boolean high = false;
        if(ag <=18) {
            if (high) {
                System.out.println("GOOD");
            }

        }



        Scanner s = new Scanner(System.in);
        System.out.println("ENTER A DAY:");
        int day = s.nextInt();

//        int day = 5;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thu");
                break;
            default:
                System.out.println("INVAILD DAY");
        }
        s.close();


       char grade = 'B';
        switch (grade){
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("v good");
                break;
            case 'C':
                System.out.println("good");
                break;
            default:
                System.out.println("NOT GOOD GRADE");

        }
    }
}
