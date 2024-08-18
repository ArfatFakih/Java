//2D Arrays

// //Quesion
// //Take the input matirx from the user and print the matrix

// import java.util.*;

// public class Eight {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of rows: ");
//         int rows = sc.nextInt();

//         System.out.print("Enter the number of columns: ");
//         int cols = sc.nextInt();

//         int[][] numbers = new int[rows][cols];

//         //input
//         //rows
//         for(int i=0; i<rows; i++){
//             //cols
//             for(int j=0; j<cols; j++){
//                 numbers[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("The Martix is: ");
//         //output
//         for(int i=0; i<rows; i++){
//             for(int j=0 ;j<cols; j++){
//                 System.out.print(numbers[i][j] + " ");
//             }
//             System.out.println();
//         }

//         sc.close();
//     }
// }


//Question 2
//Searching for an element x in a matrix.

import java.util.*;

public class Eight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        //Search for the element is at which index
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){

                if(numbers[i][j] == x){
                    System.out.println("x found at the location (" + i +"," + j +")");
                }
            }
        }

        sc.close();
    }
}