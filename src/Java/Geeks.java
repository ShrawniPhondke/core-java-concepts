package Java;

public class Geeks {

    public static void main(String args[]) {
//    {
//        String[] names = { "Sweta", "Gudly", "Amiya" };
//
//        for (String name : names) {
//            System.out.println("Name: " + name);
//        }
//    }

        {
            String[] ages = {"shrawni", "Shreya", "Sanika"};

            for (String nam : ages) {
                System.out.println(nam);

            }

        }


//        String str = "education";
//        String reverse = "";
//
//        for (int i = str.length() - 1 ; i >= 6; i--) {
//            reverse = reverse + str.charAt(i);
//        }
//
//        System.out.println("Original String: " + str);
//        System.out.println("Reversed String: " + reverse);


        String s = "education";
        System.out.println(s.length());

        String str = "java";
        String reverse = "";


        for(int i = str.length()- 1; i >=0 ;i--){
            reverse = reverse + str.charAt(i);
        }
        System.out.println(reverse);

    }
}


