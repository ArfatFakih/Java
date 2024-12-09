public class ReverseArray {
    
    public static void reverse(int numbers[]){
        int temp;
        int i = 0;
        int j = numbers.length-1;

        while(i < j){
            temp = numbers[j];
            numbers[j] = numbers[i];
            numbers[i] = temp;

            i++;
            j--;
        }
       
    }   

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};

        reverse(numbers);
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
    }
}
