public class PrintSubArrays {
    
    public static void printingSubArrays(int numbers[]){
        int ts = 0;
        for(int i=0; i<numbers.length; i++){
            int sum = 0;
            for(int j=i; j<numbers.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(numbers[k] + " ");
                    sum = sum + numbers[k];
                }
                ts++;
                System.out.println();
            }
            System.out.println("Total sum is: " + sum);
            System.out.println();
        }
        System.out.println("Total numbers of SubArrays are: " + ts);
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};

        printingSubArrays(numbers);
    }
}
