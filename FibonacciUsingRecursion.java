public class FibonacciUsingRecursion {

    public static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int nm1 = fibonacci(n-1);
        int nm2 = fibonacci(n-2);
        int ans = nm1 + nm2;
        return ans;
    }
    public static void main(String[] args) {
        int n = 24;
        System.out.println(fibonacci(n));
    }
}
