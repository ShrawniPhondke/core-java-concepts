package Java;

public class jumpStatement {
    public static void main(String[] args) {

//         for(int i = 1; i <= 10 ; i++){
//             if(i == 8){
//                 break;
//             }
//             System.out.println(i);
//         }


//         int j = 1;
//         do{
//             System.out.println(j);
//             if(j == 3){
//                 break;
//             }
//             j++;
//         } while (j >= 5);


//         for(int x = 10 ; x >=1 ; x--){
//             if(x == 7){
//                 break;
//             }
//             System.out.println(x);
//         }


//         int y = 10;
//         do{
//             System.out.println(y);
//             if(y == 7){
//                 break;
//             }
//             y--;
//         }while (y >= 1);


//         int f = 10;
//
////            f--;
////            --f;
//         System.out.println(f--);
//         System.out.println(f);

//         for(int q = 1 ; q <=10; q++){
//             if(q == 4){
//                 continue;
//             }
//             System.out.println(q);
//         }

//         int z = 1;
//         do{
//             System.out.println(z);
//                 if (z == 4)
//                 {
//                     z++;
//                     continue;
//                 } z++;
//         } while (z <= 10);


//       for(int x = 1; x >= 12 ; x++){
//           if(x == 1){
//               continue;
//           }
//           System.out.println(x);
//       }
//     }

        int sum = 0;

        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                continue;
            }

            for (int j = 1; j <= 4; j++) {

                if (j == 3) {
                    break;
                }

                sum = sum + i + j;
                System.out.println("i = " + i + ", j = " + j + ", sum = " + sum);
            }
        }

        System.out.println("Final Sum = " + sum);

    }
}