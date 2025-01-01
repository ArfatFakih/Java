// import java.util.*;


public class Practice {

    public static void arrays(int numbers[]){
       int ans[] = new int[5];
       for(int i=0; i<numbers.length; i++){
        int product = 1;
        for(int j=0; j<numbers.length; j++){
            if(i == j){
                continue;
            }
            product *= numbers[j];
        }
        ans[i] = product;
       }

       for(int i=0; i<ans.length; i++){
        System.out.print(ans[i] + " ");
       }

    }


    public static void main(String[] args) {
        // int arr[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int numbers[] = {-1, 1, 0, -3, 3};

       arrays(numbers);

    }
}