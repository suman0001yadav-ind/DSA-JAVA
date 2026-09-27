
// NORMAL WAY TO PRINT AND RUN LOOP :--

// import java.util.*;
// class AddingClass{
//     public static void main (String args []) {
//         Scanner sc = new Scanner (System.in);

//         int sum = 0;

//         for (int i = 1; i <= 10; i++){
//             sum = sum + i;
//         }
//         System.out.println("The sum of this number is = " +sum);
//     }
// }

//-----------------------------------------------------------------------------------------------------------------
// RECURSION :-- 

// class RecursionClass{

//     public static void PrintNumber  (int n) {

//         if (n == 0) {
//             return;
//         }

//         System.out.println(n);  
//         PrintNumber(n-1);
//     }
//     public static void main (String args []) {
//         int n = 5;
//         PrintNumber(n); // n = 5
//     }
// }

//-----------------------------------------------------------------------------------------------------------------

class RecursionClass{

    public static void PrintArray(int n) {

        if ( n == 0) {
            return;
        }

        System.out.println(n);
        PrintArray(n-1);
    }
    public static void main (String args []) {

        int n = 5;
        PrintArray(n);
    }
}