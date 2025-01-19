// import java.util.*;


public class Practice {

    public static int factorail(int arr[], int key, int i){

        if(i == arr.length){
            return -1;
        }
        int isFound = factorail(arr, key, i+1);

        if(isFound == -1 && arr[i] == key){
            return i;
        }

        return isFound;
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 8, 5, 3, 9, 5, 4};
        System.out.println(factorail(arr, 5, 0));
    }
}