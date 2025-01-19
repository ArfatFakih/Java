public class ExpoUsingRecursion {

    public static int exponentail(int x, int n){
        if(n == 0){
            return 1;
        }

        int halfPower = exponentail(x, n/2);
        int answer = halfPower * halfPower;

        if(n % 2 != 0){
            answer = x * answer;
        }

        return answer;

    }
    public static void main(String[] args) {
        System.out.println(exponentail(2, 5));
    }
}
