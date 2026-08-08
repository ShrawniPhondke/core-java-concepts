package Java;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter Your Bill: ");
//        int num = scanner.nextInt();
//        double bill;
//
//        if (num <= 100) {
//            System.out.println("your total bill is: " + num * 5);
//        } else if (num >= 100 && num <= 200) {
//            bill = (100 * 5) + ((num - 100) * 7);
//            System.out.println("your total unti is:" + bill);
//        } else {
//            bill = (100 * 5) + (100 * 7) + ((num - 200) * 10);
//            System.out.println("your total unti is: " + bill);
//        }
//        scanner.close();


//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Your Purchase Amount: ");
//        double amount = sc.nextInt();
//        double discount;
//
//        if(amount <= 5000){
//            discount = amount*0.05;
//            amount = amount - discount;
//            System.out.println("you got discount of 5% " + discount);
//            System.out.println("you got the the product in " + amount);
//        }
//        else if (amount<=10000){
//            discount = amount*0.10;
//            amount = amount - discount;
//            System.out.println("you got discount of 10% " + discount);
//            System.out.println("you got the the product in " + amount);
//        } else {
//            discount = amount*0.20;
//            amount = amount - discount;
//            System.out.println("you got discount of 20% " + discount);
//            System.out.println("you got the the product in " + amount);
//        }
//         sc.close();

//          Scanner sca = new Scanner(System.in);
//        System.out.println("Enter Your Age : ");
//        int age = sca.nextInt();
//
//         if(age<=5){
//             System.out.println("free to go");
//         } else if (age <= 17){
//             System.out.println("pay 100");
//         } else if (age<=59) {
//             System.out.println("pay 250");
//         } else {
//             System.out.println("pay 150");
//         }
//         sca.close();


//        Scanner sd = new Scanner(System.in);
//        System.out.println("Purchase amount: ");
//        double amount = sd.nextInt();
//        System.out.println("Is the customer a member?: ");
//        char member = sd.next().charAt(0);
//        double discount ;
//
//
//        if (member == 'Y' || member == 'y') {
//
//            if (amount < 5000) {
//                discount = amount * 0.10;
//            } else if (amount <= 10000) {
//                discount = amount * 0.15;
//            } else {
//                discount = amount * 0.25;
//            }
//        }
//        else if (member == 'N' || member == 'n') {
//
//            if (amount < 5000) {
//                discount = amount * 0.05;
//            }
//            else if (amount <= 10000) {
//                discount = amount * 0.10;
//            }
//            else {
//                discount = amount * 0.20;
//            }
//        }
//        else {
//            System.out.println("Invalid Member Option");
//            sd.close();
//            return;
//        }
//        double finalAmount = amount - discount;
//
//        System.out.println("Discount = ₹" + discount);
//        System.out.println("Final Amount = ₹" + finalAmount);
//        sd.close();



        Scanner r = new Scanner(System.in);
        System.out.println("Enter yput salary: ");
        double salary = r.nextInt();
        System.out.println("Enter our credit score: ");
        int creditScore = r.nextInt();

        if(salary >= 30000) {
            if (creditScore >= 750)
                System.out.println("Loan Approved\n" + "Interest Rate = 8%");
            if (creditScore >= 650)
                System.out.println("Loan Approved\n" + "Interest Rate = 10%");
        }else {
                System.out.println("Loan Rejected");
        }

    }
}

