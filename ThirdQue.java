import java.util.*;

public class ThirdQue {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The first n natural number is: ");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of n natural number is: "+sum);

        int num;
        System.out.println("Table of "+n+" is:");
        for (int i = 1; i < 11; i++) {
            num = n*i;
            System.out.println(n+" * "+i+" = "+num);
        }
        sc.close();
    }
}
