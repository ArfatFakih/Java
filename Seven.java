//Arrays
import java.util.*;

public class Seven {
    // public static void main(String[] args) {
    //     // int[] marks = new int[3];

    //     // int marks[] = {97, 98, 95}; 

    //     int marks[] = new int[3]; //another representation
    //     marks[0] = 97;
    //     marks[1] = 98;
    //     marks[2] = 95;

    //     // System.out.println(marks[0]);
    //     // System.out.println(marks[1]);
    //     // System.out.println(marks[2]);

    //     for(int i=0; i<3; i++){
    //         System.out.println(marks[i]);
    //     }
    // }

    //Take an input Array from user
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        //input 
        for(int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }

        //output
        for(int i=0; i<size; i++){
            System.out.print(number[i]+" ");
        }

        sc.close();
    }
}
