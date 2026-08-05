package Java;

import java.util.Scanner;

public class Geeks {

    public static void main(String args[]) {
//    {
//        String[] names = { "Sweta", "Gudly", "Amiya" };
//
//        for (String name : names) {
//            System.out.println("Name: " + name);
//        }
//    }

        {
            String[] ages = {"shrawni", "Shreya", "Sanika"};

            for (String nam : ages) {
//                System.out.println(nam);

            }

        }


//        String str = "education";
//        String reverse = "";
//
//        for (int i = str.length() - 1 ; i >= 6; i--) {
//            reverse = reverse + str.charAt(i);
//        }
//
//        System.out.println("Original String: " + str);
//        System.out.println("Reversed String: " + reverse);


//        String s = "education";
//        System.out.println(s.length());


//
        String str = "java";
        String reverse = "";


        for(int i = str.length()- 1; i >=0 ;i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);


//        String st = "Shrawni";

//        for (int i = st.length() - 1 ; i >= 0; i--) {
//            System.out.print(st.charAt(i));
//        }
//
//
//
//        String str = "OpenAI";
//        for(int i = str.length()- 1; i>=0 ;i--){
//            System.out.print(str.charAt(i));
//
//       }

//        Scanner c = new Scanner(System.in);
////        int num= c.nextInt();
//        System.out.println("Enter your number:" );
//        int num= c.nextInt();
//
//        if(num > 0){
//            System.out.println("POSITIVE");
//        }
//        else if(num < 0)
//        {
//            System.out.println("NEG");
//        }
//        else {
//            System.out.println("zero");
//        }

        //0-100 ₹5
        ///unit 101-200 ₹7/
        //unit Above 200 ₹10

//        Write a program to calculate electricity bill based on slabs.
//        Example
//        0-100 units = ₹5/unit
//        101-200 = ₹7/unit
//        Above 200 = ₹10/unit

        Scanner cc = new Scanner(System.in);
        System.out.println("Enter the bill:");
        int number = cc.nextInt();

        if(number <=100 ){
            System.out.println(number*5);

        } else if(number>=101 && number<=200){
            System.out.println(number*7);
        }
        else {
            System.out.println(number*10);
        }

        int x = 5;
        System.out.println(x++);

    }
}




