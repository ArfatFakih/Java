//Patterns Questions

public class FourthQue {
    public static void main(String[] args) {
        System.out.println("Example 6: ");
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("Example 7: ");

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        System.out.println("Example 8: ");
        int k = 5;
        int number = 1;

        for(int i=1;i<=k;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }

        System.out.println("Example 9:");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int sum = i+j;
                if(sum % 2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 "); 
                }
            }
            System.out.println();
        }
    }
}
