package Java;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

//        int a[] = {1 , 2 , 3 , 4  , 5 , 6 , 7 , 8 , 9 , 10 };
//
//
//       for(int i = 0; i < a.length; i++){
//           System.out.println(a[i]);
//       }
//
//        for (int i = a.length - 1; i >= 0; --i) {
//            System.out.println(a[i]);
//        }
//
//        System.out.println(a[4]);
//
//        System.out.println(a.length);
//
//         a[2] = 20;
//        System.out.println(Arrays.toString(a));
////
//        System.out.println(a[2]);
//        System.out.println(a[7]);



//        String b[] = {"shrawni" , "shreya" , "neha" , "anikta" , "priya" , "rohan" , "tanishq" ,"rohit"};
//
//        for( String n = 0 ; n < n.length() ; n++){
//
//        }
//        b[2] = "maduri";
//        System.out.println(b[2]);
//        System.out.println(Arrays.toString(b));

//        System.out.println(b.length);


//        int i = 30;
//        while(i < 20){
//            System.out.println(i);
//        }


//        for(int i = 0; i >= 10; i++){
//
//        }

//
//        int su[] = {1, 2, 3, 4, 5, 6};

//        int x = 3;
//        boolean y = false;
//
//        for(int i = 0 ; i < a.length; i++){
//           if(a[i] == x){
//               y = true;
//               System.out.println("found at index : " + i);
//               break;
//           }
//        }
//        if(! y) {
//            System.out.println("not found");
//        }
//
//        int min = a[0];
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] < min) {
//                min = a[i];
//            }
//        }
//        System.out.println(min);


//         for(int i = 0 ; i <= 4; i++){
//             for (int j = 0 ; j <= 2 ; j++) {
//                 System.out.println("helo");
//             }


//        int A[]={10 , 70 , 20 , 5, 30 ,80 , 40};
//
//        Arrays.sort(A);
//        System.out.println(Arrays.toString(A));
//
//        int sum = 0;
//
//        sum = A[5] + A[6];
//        System.out.println(sum);
//
//        for(int i = 0 ; i < A.length; i++){
//            sum = sum + A[i];
//            System.out.println(sum);
//        }
//        System.out.println(sum);
//
//
//        for (int number : A) {
//            sum += number;
//        }
//
//        double average = (double) sum / A.length;
//        System.out.println("Average = " + average);


//        if(f == 1){
//            System.out.println("found");
//        }else {
//            System.out.println("not found");
//        }
//
//
//
//        for(int i = 0 ; i < x.length ; i++){
//            if( x[i] % 2 == 0 ){
//                System.out.println(x[i] + "   even");
//            }else {
//                System.out.println(x[i] + "    odd");
//            }
//        }
//        int sum = 0;

//        int[] number = {25, 10, 45, 30, 15};
//
//
//        Arrays.sort(number);
//        System.out.println(Arrays.toString(number));
////        System.out.println(number.length);
//        System.out.println(number[number.length - 1]);
////        System.out.println(number[4]);

//      for(int i = 0 ; i < number.length; i++){
//          sum =  sum + number[i];
//
//      }
//        System.out.println(sum);


//        int[] number = {25, 10, 45, 30, 15};
//
//        int smallest = number[0];
//
//        for (int i = 1; i < number.length; i++) {
//
//            if (number[i] < smallest) {
//                smallest = number[i];
//            }
//        }
//
//        System.out.println(smallest);

        int ss[] = {25, 67, 44, 78 , 99 };

        int smallest = ss[0];

        for(int i = 1  ; i < ss.length; i++) {

            if (ss[i] < smallest) {
                smallest = ss[i];
            }

        }
        System.out.println(smallest);


    }
}


