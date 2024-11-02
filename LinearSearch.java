public class LinearSearch {

    public static int linerSearch(int number[], int key){
        for(int i=0; i<number.length; i++){
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 12;

        int index = linerSearch(number, key);
        if(index == -1){
            System.out.println("Number Not Found");
        }else{
            System.out.println("Number is at index : " + index);
        }

    }
}
