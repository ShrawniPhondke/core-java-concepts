package Java;

public class Operator {
    public static void main(String[] args) {

        //Operand
        //Operator
        //Operand


        int a = 10;
        int b = 20;
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mol = a % b;
//      System.out.println(sum);
//      System.out.println(sub);
//      System.out.println(mul);
//      System.out.println(div);
//      System.out.println(mol);

//        BODMAS
        int result = (10 + 5) * 4 / 2 % 7 - 3;
//        System.out.println(result);

        int x = 5;

        x = x++ + ++x;

//        System.out.println(x);

        int j = 44;
        j = 2;
//        System.out.println(j);

        int k = 23;
        int l = 22;

//        System.out.println(k == l);
//        System.out.println(k != l);
//        System.out.println(k < l);
//        System.out.println(k > l);
//        System.out.println(k <= l);
//        System.out.println(k >= l);

        int age = 18;
//
//        if (age > 18 && age < 30) {
//
//            System.out.println("eligible for voting");
//        } else {
//            System.out.println("not eligible for voting");
//        }

       int score = 90;
        if(score  > 70 || score < 85){
            System.out.println("Admission");
        }
        else{
            System.out.println("not Admission");
        }

        boolean isLoggedIn = true;

        if (!isLoggedIn) {
            System.out.println("Please login first.");
        } else {
            System.out.println("Welcome!");
        }

    }
}