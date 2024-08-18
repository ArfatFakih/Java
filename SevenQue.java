// import java.util.*;

// public class SevenQue {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int number[] = new int[size];

//         for(int i=0; i<size; i++){
//             number[i] = sc.nextInt();
//         }

//         for(int i=0; i<size; i++){
//             System.out.print(number[i]+" ");
//         }

//         System.out.println();
//         int x = sc.nextInt();

//         for(int i=0; i<number.length; i++){
//             if(number[i] == x){
//                 System.out.println("x found at index : " + i);
//             }
//         }

//         sc.close();
//     }
// }




//Ouestion
// Take an array of numbers as input and check if it is an array sorted in ascending order.
// Eg : { 1, 2, 4, 7} is sorted in ascending order.
//      { 3, 4, 6, 2} is not sorted in ascending order.


import java.util.*;

public class SevenQue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        
        //input
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for(int i=0; i<numbers.length-1; i++){
            if(numbers[i] > numbers[i+1]){
                isAscending = false;
            }
        }

        if(isAscending){
            System.out.println("The array is sorted in ascending order");
        }else{
            System.out.println("The array is not sorted in ascending order");
        }

        sc.close();
    }
}
