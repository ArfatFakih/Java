// import java.util.*;


public class Practice {

    public static void decThenInc(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        decThenInc(n-1);
        System.out.println(n);
    }


    public static void main(String[] args) {
        decThenInc(5);
    }
}