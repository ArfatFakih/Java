import java.util.*;

public class Palindrome {

    public static boolean isPalindrome(int nummber){
        int palindrome = nummber;
        int reverse = 0;

        while(palindrome != 0){
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        if(nummber == reverse){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();

        if(isPalindrome(palindrome)){
            System.out.println("Number : " + palindrome + " is a Palindrome");
        }else{
            System.out.println("Number : " + palindrome + " is not a Palindrome");
        }

        sc.close();
    }
}
