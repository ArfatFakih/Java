// import java.util.*;


public class Practice {

    public static int[] arrays(int numbers[]){
        int n = numbers.length;

        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = numbers[0];
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1] * numbers[i];
        }

        suffix[n-1] = numbers[n-1];
        for(int i=n-2; i>=0; i--){
            suffix[i] = suffix[i+1] * numbers[i];
        }

        int[] ans = new int[n];

        ans[0] = suffix[1];
        ans[n-1] = prefix[n-2];
        for(int i=1; i<=n-2; i++){
            ans[i] = prefix[i-1] * suffix[i+1];
        }

        return ans;
    }


    public static void main(String[] args) {
        // int arr[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int numbers[] = {-1, 1, 0, -3, 3};
        arrays(numbers);    
    }
}