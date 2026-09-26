// [  TOPIC => LOOPS ( For loops , While loops , Do while loops )]

// => FOR LOOP

//class ForloopClass {
  //  public static void main (String [] args ){
    //    for(int counter = 0; counter < 30; counter = counter + 1) {       -----> (( Always use "counter < 30" to terminate code otherwise it will be infinity))
      //      System.out.println("Hello World");
        //}
    //}
//}


//OUTPUT WILL BE =>   Hello World
//                    Hello World
//                    Hello World


//-----------------------------------------------------------------------------------------------------------------------

// [* Question ]

//class FiftClass {
  //  public static void main (String [] args) {
        //counter++ => counter = counter + 1
    //    for(int counter = 0; counter < 11; counter++) {
      //      System.out.println(counter+" ");
        //}
    //}
//}


// OUTPUT WILL BE =>   1
//                     2
//                     3
//                     4
//                     5
//                     6
//                     7
//                     8
//                     9
//                     10


//---------------------------------------------------------------------------------------------------------------- 

// [ PROPER WAY TO WRITE THE CODE ]

// class ProperClass {
//     public static void main (String [] args) {
//         for (int i = 0; i < 11; i++) {
//             System.out.println(i + " ");
//         }
//     }
// }

//OUTPUT WILL BE => 1
                    // 2
                    // 3
                    // 4
                    // 5
                    // 6
                    // 7
                    // 8
                    // 9
                    // 10


//----------------------------------------------------------------------------------------------------------------

// ==> While loop 

// class Whileloop {
//     public static void main (String [] agrs) {
//         int i = 0;
//         while(i < 11) {
//             System.out.println(i);
//             i= i + 1; // i++;
//         }
//     }
// }


// OUTPUT WILL BE ==> 1
//                    2
//                    3
//                    4
//                    5
//                    6
//                    7
//                    8
//                    9
//                    10


//--------------------------------------------------------------------------------------------------------------------

// ==> DO WHILE LOOP

// class DowhileloopClass {
//     public static void main (String [] args) {
//         int i = 0;
//         do { 
//             System.out.println(i);
//             i = i + 1;
//         } while (i < 11);
//     }
// }


// OUTPUT WILL BE ==> 1
//                    2
//                    3
//                    4
//                    5
//                    6
//                    7
//                    8
//                    9
//                    10


//-----------------------------------------------------------------------------------------------------------------------------

// QUESTION =>   Print the Sum of First n Natural Numbers.

// import java.util.*;

// class QuesClass {
//   public static void main (String [] args) {
//     Scanner sc = new Scanner (System.in);
//     int n = sc.nextInt();

//     int sum = 0;
//     for (int i = 0; i <= n; i++) {
//       sum = sum + i;
//       System.out.println(sum);

//       sc.close();
//     }
//   }
// }


// OUTPUT WILL BE => 4
//                     0
//                     1
//                     3 
//                     6 
//                     10


//---------------------------------------------------------------------------------------------------------------------

