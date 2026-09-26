 // SORTING :--

 // BUBBLE SORT :--

// import java.util.*;

// class SortingClass {

//     public static void printArray(int arr []) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr [i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main (String args []) {
//         Scanner sc = new Scanner (System.in);
        
//         int arr [] = {7 ,8 ,3 ,2 , 1};

//         //bubble sort
//         for (int i = 0; i < arr.length-1; i++) {
//             for (int j = 0; j < arr.length-i-1; j++) {

//                 if (arr[j] > arr[j+1])  {

//                     // swap

//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;

//                 }
//             }
//         }

//         printArray(arr); 
//     }
// }

//---------------------------------------------------------------------------------------------------------------
// SELECTION SORT :--

// import java.util.*;

// class SelectionSortClass{
//     public static void PrintArray(int nums[]) {
//         for (int i = 0; i < nums.length; i++) {
//             System.out.println(nums[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main (String args []) {
        
//         int nums[] = {7, 8, 3, 2, 1};

//         for (int i = 0; i < nums.length-1; i++) {
//             int smallest = i;
//             for (int j = i+1; j < nums.length; j++) {
//                 if (nums[smallest] > nums[j]) {
//                     smallest = j;

//                 }
//             }

//                 int temp = nums[smallest];
//                 nums[smallest] = nums[i];
//                 nums[i] = temp;
//             }
//         PrintArray(nums);
//     }
// }

//---------------------------------------------------------------------------------------------------------------
// INSERTION SORT :--

// class InsertioSortClass {
//     public static void PrintArray(int arr[]){
//         for (int i = 0; i < arr.length; i++) {
//             System.out.println(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main (String args[]) {
        
//         int arr[] = {7, 8, 3, 2, 1};

//         for (int i = 1; i < arr.length; i++){
//             int current = arr[i];
//             int j = i-1;
//             while(j >= 0 && current < arr[j]){
//                 arr[j+1] = arr[j];
//                 j--;
//             }

//             //Placement
//             arr[j+1] = current;
//         }
//         PrintArray(arr);
//     }
// }