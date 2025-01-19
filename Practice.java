// import java.util.*;


public class Practice {

    public static int factorail(int n){
        if(n == 1){
            return 1;
        }
        int fact = n + factorail(n-1);

        return fact;
    }


    public static void main(String[] args) {
        int n = 5;
        System.out.println(factorail(n));
    }
}