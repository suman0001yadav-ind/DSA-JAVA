
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

// QUESTION >>> PRINT NO. FROM 5 TO 1 ?

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

// QUESTION >>> PRINT NO. FROM 1 TO 5 ?

// class RecursionClass{
//     public static void PrintNumber(int n){

//         if (n == 6) {
//             return;
//         }
//         System.out.println(n);
//         PrintNumber(n+1);
//     }
//     public static void main (String args []) {

//         int n = 1;
//         PrintNumber(n);
//     }
// }

//-----------------------------------------------------------------------------------------------------------------

// QUESTION >>> PRINT SUM OF FIRST N NATURAL NUMBERS ?

class NaturalClass{
    public static void PrintSum(int i, int n, int sum) {

        if (i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        PrintSum(i+1, n, sum);
        System.out.println(i);
        
    }
    public static void main (String args []) {
        PrintSum(1, 5, 0);
    }
}