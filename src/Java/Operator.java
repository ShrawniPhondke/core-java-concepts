package Java;

public class Operator {
    public static void main(String[]args){

    int a = 10;
    int b = 20;
    int sum = a + b;
    int sub = a - b;
    int mul = a*b;
    int div = a / b;
    int mol = a % b ;
//      System.out.println(sum);
//      System.out.println(sub);
//      System.out.println(mul);
//      System.out.println(div);
//      System.out.println(mol);


    int result = (10 + 5) * 4 / 2 % 7 - 3;
        System.out.println(result);

    int x = 5;

        x = x++ + x++;

        System.out.println(x);
        System.out.println(x);
}
}