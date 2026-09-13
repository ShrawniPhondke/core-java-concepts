package Java;

import java.util.Scanner;

public class Classroom {
    public static void main(String[] args){

        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the number of students in class : ");
        int total_students = ss.nextInt();


        int arr[] = new int[total_students];
        int sum = 0;
        int  highest_score = 0;


        System.out.println("Enter the scores for " + total_students + " students:");
        for (int i = 0; i < total_students; i++) {

            System.out.print("Student " + (i + 1) + " score: ");
            arr[i] = ss.nextInt();

            sum = sum + arr[i];


            if (arr[i] > highest_score) {
                highest_score = arr[i];
            }
        }

        int average = sum / total_students;

        System.out.println(highest_score);
        System.out.println(average);
    }
}
