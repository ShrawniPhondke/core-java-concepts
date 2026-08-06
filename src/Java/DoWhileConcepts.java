package Java;

import java.util.Scanner;

public class DoWhileConcepts {
    public static void main(String[] args){

//       int i = 10;
//       do{
////           ++i;
//           System.out.print(i +"  " );
//           i--;
//       }while(i>=1);



//       int i = 1;
//       do{
//           i++;
//           System.out.println("shrawni");
//       }while(i<6);

//       int b = 1;
//       while(b<6)
//        {
//            System.out.println("hrushi");
//            b++;
//        }

//       int c = 1;
//       do{
//           System.out.println(c);
//           c++;
//       }while(c<=20);

//       int d = 1;
//       while(d<=20){
//           System.out.println(d);
//           d++;
//       }

//        Write a program to calculate employee bonus.
//                Salary <30000 →10%
//
//                30000-60000 →15%
//
//                Above 60000 →20%

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Salary: ");
        double salary = sc.nextInt();
        double bonus ;

        if(salary<30000){
            bonus = salary*0.10;
        }
        else if(salary<=60000){
            bonus =salary*0.15;
        } else {
            bonus =salary*0.20;
        } System.out.println("bonus = " + bonus);

    }
}
