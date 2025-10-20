import java.util.ArrayList;

public class SubsequenceUsingRecursion {

    public static void subSequence(int idx, ArrayList<Integer> ans, int s, int sum, int arr[], int n) {
        if(idx == n) {
            if(s == sum) {
                for(int i=0; i<ans.size(); i++) {
                    System.out.print(ans.get(i) + " ");
                }
                System.out.println();
            }
            return;
        }

        ans.add(arr[idx]);
        s += arr[idx];

        subSequence(idx + 1, ans, s, sum, arr, n);

        s -= arr[idx];
        ans.remove(ans.size() - 1);

        subSequence(idx + 1, ans, s, sum, arr, n);

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 1};
        int n = arr.length;
        int sum = 2;

        ArrayList<Integer> ans = new ArrayList<>();

        subSequence(0, ans, 0, sum, arr, n);
    }
}
