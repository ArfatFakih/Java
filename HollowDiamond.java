import java.util.Scanner;

public class HollowDiamond {
    public static void hollowDiamond(int n){
        int spaces = 1;
        for(int i=1; i<=(2*n)-1; i++){
            if(i<=n){
                for(int j=1; j<=(n-i); j++){
                    System.out.print(" ");
                }
            }else{
                for(int j=1; j<=(i-n); j++){
                    System.out.print(" ");
                }
            }

            if(i == 1 || i == (2*n)-1){
                System.out.print("*");
            }else{
                System.out.print("*");
                for(int j=1; j<=spaces; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
                if(i<n){
                    spaces += 2;
                }else{
                    spaces -= 2;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        hollowDiamond(n);

        sc.close();
    }
}
