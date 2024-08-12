//Advance Patterns

public class Fifth {
    public static void main(String[] args) {
        System.out.println("ButterFly Pattern");
        int n = 5;

        //upper half
        for(int i=1; i<=n; i++){
            //1st part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //spaces
            int spaces = 2 * (n-i);
            for(int j=1;j<=spaces; j++){
                System.out.print(" ");
            }

            //2nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }

        //lower half
        for(int i=n; i>=1; i--){
            //1st part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            //spaces
            int spaces = 2 * (n-i);
            for(int j=1;j<=spaces; j++){
                System.out.print(" ");
            }

            //2nd part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("Example 10:");
        int k = 5;
        for(int i=1; i<=k; i++){
            //spaces
            for(int j=1; j<=k-i; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Number Pyramid:");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
