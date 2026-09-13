package Java;

import com.sun.jdi.Value;

import javax.print.DocFlavor;

public class NewMethods {


    public static int calculatePercantage(int obtained , int total){
     return (obtained * 100) / total;
    }


    public static int getmax(int w , int h){
        if(w > h){
            System.out.println(w);
           return w;
        }else {
            System.out.println(h);
           return h;

        }
    }

//    static void cal(int a){
//        System.out.println(a * a);
//    }

    void Display( String name){
        System.out.println(name);
    }

    public  static void Display(String name, String age){

        System.out.println(name + age );
    }
    public static void Update(int x){
        x = 12;
        System.out.println(x);
    }



    public static int cal(int a , int b){

        return a + b;
    }


    public static int cal(int a , int b ,int c)
    {

        return a + b + c ;
    }


    public static void meow(){

        System.out.println("void hai return nhi hoga bss print hoga, but hum static use kar rahe hai sath mai toh without obj call kar sakte ahai");


    }

    public static int meoww(){
        System.out.println("ye static hai , isme return or print dono hota hai but without return not working ");
        return 1;

    }

    void meroww(){

        System.out.println("isme bss print hoga again cuz void ha , and need to create an object");
    }


    public static void main(String[]args){

//        Scanner s = new Scanner(System.in);
//        System.out.println("enter num:" );
//        int a = s.nextInt();
//        cal(a);

//        int result = cal(12 ,14);
//        System.out.println(result);
//
//        int result2 =  cal(20 , 30 , 40);
//        System.out.println(result2);
//
//        New g = new New();
//        g.shrawni();

//        meow();
//
//        int me = meoww();
//        System.out.println(me);
//
//        NewMethods nn = new NewMethods();
//        nn.meroww();


         int value = 13;
        System.out.println(value);

        Update(value);
        System.out.println(value);


//       Display("shrawnni");
       Display("yash" , "23");

       NewMethods jj = new NewMethods();
       jj.Display("hiw");


       getmax(9 , 4);
    }
}
