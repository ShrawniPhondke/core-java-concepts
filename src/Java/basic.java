package Java;

import java.util.Scanner;

public class basic {
    public static void main (String[] args){

        Scanner ss = new Scanner(System.in);
        System.out.println("Enter your number :");
        int number = ss.nextInt();

        if(number % 2 ==0){
            System.out.println("Even" +   number);

        }else {
            System.out.println("odd" +    number);
        }


        int largest = 0;

        for(int i = 1 ; i <= 5 ; i++){

            System.out.println("Enter  a 5 number: ");
            int num = ss.nextInt();

            if( num < largest){
                largest =num;
            }
        }

        System.out.println("largest number "+  largest);





    }
}

