package Java;

public class NewMethods {


//    static void cal(int a){
//        System.out.println(a * a);
//    }

    public static int cal(int a , int b){
        return a + b;
    }


    public static int cal(int a , int b ,int c){
        return a + b + c ;
    }


    public static void meow(){

        System.out.println("void hai return nhi hoga bss print hoga");

    }

    public static int meoww(){
        System.out.println("ye static hai , isme return or print dono hota hai but without return not working ");
        return 1;

    }

    void meroww(){
        System.out.println("isme bss print hoga again cuz void hai ");
    }


    public static void main(String[]args){

//        Scanner s = new Scanner(System.in);
//        System.out.println("enter num:" );
//        int a = s.nextInt();
//        cal(a);

//       int result = cal(12 ,14);
//        System.out.println(result);
//
//       int result2 =  cal(20 , 30 , 40);
//        System.out.println(result2);
//
//        New g = new New();
//        g.shrawni();

        meow();

        int me = meoww();
        System.out.println(me);

        NewMethods nn = new NewMethods();
        nn.meroww();


    }
}
