package Java;

public class ques {


    static int square(int a) {

         return a * a;
    }

//    static boolean isEven(int n){
//        return n % 2 == 0;
//       if (n % 2 == 0){
//           return true;
//       }else {
//           return false;
//       }

    static boolean isGreater(int s , int q){

        if(s > q){
            return true;
        } else {
            return false;
        }
        }

    static void printEvenNumbers(int n){

        for(int i = 1 ; i <= n ; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    static int findLargest(int v , int m){
        if(v > m){
            return v;
        } else {
            return m;
        }
    }


    static int countPositive(int a, int b, int c) {
int count = 0;
       if(a > 0){
            count++;
       } if ( b > 0){
           count++;
       } if ( c > 0){
           count++;
        }
    return count;
    }


        public static void main(String[] args) {


            int result = countPositive(10, -5, 7);

            System.out.println(result);

//            int i = square(5);
//            System.out.println(i);

//            boolean j = isEven(8);
//            System.out.println(j);

//            boolean k = isGreater(10 , 5);
//            System.out.println(k);

//            ques q = new ques();
//            q.printEvenNumbers(30);

//            int l = findLargest(10 , 9);
//            System.out.println(l);


//            int result = calculate(4);
//
//            System.out.println("Final Result: " + result);
//        }
//
////        public static int calculate(int n) {
////
////            if (n == 1) {
////                return 5;
////            }
////
////            int x = calculate(n - 1);
////
////            return x + n;
//
//
////             static int calculate(int n) {
////
////                if (n == 1) {
////                    return 2;
////                }
////
////                int x = calculate(n - 1);
////                int y = calculate(n - 1);
////
////                return x + y;
////            }
//    public static int calculate(int n) {
//
//        if (n == 1) {
//            return 5;
//        }
//
//        if (n % 2 == 0) {
//            return calculate(n - 1) + 2;
//        } else {
//            return calculate(n - 1) * 2;
//        }
//    }
//    }

        }
}