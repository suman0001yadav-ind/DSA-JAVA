// 2D ARRAYS :-

// import java.util.*;

// class TwoDArray {
//     public static void main (String args [] ) {
//         Scanner sc = new Scanner (System.in);  //( ==> Ye ek object h user se input lene ke liye liya jata h ) 
//         int rows = sc.nextInt();
//         int cols = sc.nextInt();

//         int [][] number = new int [rows][cols];

//         for (int i = 0; i < rows; i++) {

//             for (int j = 0; j < cols; j++) {
//                 number[i][j] = sc.nextInt();
//             }
//         }

//         for (int i = 0; i <= rows; i++) {

//             for (int j = 0; j < cols; j++) {
//                 System.out.print(number[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

//---------------------------------------------------------------------------------------------------------------------------

// import java.util.*;

// class TwoDArray {
//     public static void main (String args [] ) {
//         Scanner sc = new Scanner (System.in);
//         int rows = sc.nextInt();
//         int cols = sc.nextInt();
        
//         int [][] numbers = new int [rows] [cols];

//         for (int i = 0; i < rows; i++) {

//             for (int j = 0; j < cols; j++) {
//                 numbers[i][j] = sc.nextInt();
//             }
//         }

//         int x = sc.nextInt();

//         for (int i = 0; i < rows; i++) {

//             for (int j = 0; j < cols; j++) {
//                 if(numbers[i][j] == x) {
//                     System.out.println("x found at locations (" + i +", " + j + ")");
//                 }
//             }
//         }
//     }
// }