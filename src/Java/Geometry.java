package Java;

public class Geometry {


    public static void cal(){
        System.out.println("hi");
    }

//    public static void par(int a , int b){
//        System.out.println(a + b);
//    }

    public static int par(int a , int b){
        return a + b;
    }

    public static void readKnow(){
        System.out.println("books");
    }

    public static void write(){
        System.out.println("withpen");
    }

//    public static void main(String[] args) {
//        int side = 5;
//        int area = calculateSquareArea(side);
//        System.out.println(area);
//    }
//
//    public static int calculateSquareArea(int s) {
//        int result = multiply(s, s);
//        return result;
//    }
//
//    public static int multiply(int a, int b) {
//        return a * b;
//    }
//}


//    static boolean isEven(int num) {
//        if (num % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
//
//    }

    public static void main(String[] args) {
//    int result = evaluate(3);
//    System.out.println("Final Result: " + result);
//}
//
//    public static int evaluate(int n) {
//        // Base isolation cases
//        if (n <= 1) return 1;
//
//        // TRICK 1: Variable Shadowing.
//        // This local 'n' belongs strictly to THIS frame instance.
//        int leftBranch = evaluate(n - 1); // 2
//
//        // TRICK 2: Deferred execution path.
//        // This line cannot execute until leftBranch completely finishes.
//        int rightBranch = evaluate(n - 2); // 2-2
//
//        return leftBranch + rightBranch;
//    }
//

//        Geometry gg = new Geometry();
//        int l =

        cal();
//        par(10,20);

        int result =  par(12 , 23);
        System.out.println(result);

readKnow();

//        Geometry g = new Geometry();
//        boolean result = g.isEven(2);
//        System.out.println(result);


//        int result = first();
//        System.out.println(result);
//    }
//
//    public static int first() {
//
//        int x = second();
//        return x + 5;
//    }
//
//    public static int second() {
//
//        return 10;
//    }
    }
    }


