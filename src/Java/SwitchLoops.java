package Java;

import java.util.Scanner;

public class SwitchLoops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        char grade = sc.next().charAt(0);

        switch (grade) {
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
        sc.close();

        char vowel = 'l';

        switch(vowel){

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("It is a vowel");
                break;

            default:
                System.out.println("It is a consonant");
        }

        Scanner s = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER: ");
        int a = s.nextInt();

        int count = 0;
        for(int i = 1 ; i <= a;i++)
            if (a % i == 0) {
                count++;
            }
        if(count == 2) {
            System.out.println("PRIME");
        }
        else {
            System.out.println("NOT PRIME");
        }
    }
}
