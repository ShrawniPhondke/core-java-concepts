package Java;
import java.util.Arrays;
public class NewQueArray {


    public static void main(String []args) {

//        int a[] = {10 , 20 , 30 , 40 , 50 , 60 , 70 , 80};

//        System.out.println(Arrays.toString(a));
//        System.out.println(a[2]);
//        a[3] = 90;
//        System.out.println(Arrays.toString(a));
//        System.out.println(a.length);
//
//        for(int i = a.length - 1 ; i >= 0 ; --i){
//            System.out.println(a[i]);
//        }


//        String s[] = {"h","e","l","l","o"};
//
//        for(int i= s.length-1 ; i >= 0 ; i--){
//            System.out.println(s[i]);
//        }


//        String str = "java";
//        for(int i = str.length() - 1 ; i >= 0 ; i-- ){
//            System.out.print(str.charAt(i));
//        }
//
//        String SS = "hiii"
//        for (int j = 0 ; j < SS.length(); j++){
//            System.out.print(SS.charAt(j) + " ");
//        }


//        int[] numbers = {10, 20, 30, 40, 50};
//
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
//
//        for (int i = numbers.length - 1; i >= 0; i--) {
//            System.out.println(numbers[i]);
//        }

//        int largest = 0;
//        int dd[] = {20 ,30, 40, 50};
//
//        for(int i = 0 ; i < dd.length ; i++)
//            if(dd[i] > largest){
//            largest = dd[i];
//        }
//        System.out.println(largest);

//        System.out.println(Arrays.toString(dd));


        int one[] = {10, 20, 30, 40, 50};

//        System.out.println(one[0]);
//        System.out.println(one.length);
//        System.out.println(one[4]);

//
//        int[] numbers = {15, 30, 45, 60, 75};
//
//        for(int i = 0 ; i < numbers.length; i++){
//            System.out.println(numbers[i]);
//        }


//        int[] numbers = {10, 20, 30, 40, 50};
//
//        int sum = 0;
//
//        for(int i = 0 ; i < numbers.length; i++){
//           sum = sum + numbers[i];
//        }
//
//        System.out.println(sum);

        int[] values = {25, 8, 47, 13, 36};

//        Arrays.sort(values);
//        System.out.println(Arrays.toString(values));

        int largest = values[0];

//        for(int i= 1 ; i < values.length ; i++){
//
//            if(values[i] > largest){
//               largest = values[i];
//            }
//
//        }
//        System.out.println(largest);


//        int smallest = values[0];
//
//        for(int i = 1 ; i < values.length ; i++){
//
//            if(values[i] < smallest){
//                smallest = values[i];
//
//
//            }
//        }
//        System.out.println(smallest);

        int[] marks = {10, 20, 10, 30, 10, 40};

        int check = 10;
        boolean bb = false;
        int count = 0;
//
        for(int i = 0 ; i < marks.length ; i++){

            if(marks[i] == check){
                count++;
                bb = true;
            }
        }
        System.out.println(count);


        int[] numbers = {15, 28, 7, 42, 19};

        int checks = 42;
        boolean lean = false ;

        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == checks){
                lean = true;
            }
        }

        if(lean){
            System.out.println("Found");
        } else {
            System.out.println("not");
        }


    }
    }

