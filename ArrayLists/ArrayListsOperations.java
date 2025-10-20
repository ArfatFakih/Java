package ArrayLists;

import java.util.ArrayList;

public class ArrayListsOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>();

        //To add elements in ArrayList use add operation Time Complexity - O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        //Get Operation - O(1)
        int element = list.get(2);
        System.out.println(element);

        //Remove Operation - O(n)
        //Use to delete the element for the ArrayList
        list.remove(1);
        System.out.println(list);


        //Set operation - O(n)
        //Use to the change the value at given index in ArrayList
        list.set(2, 10);
        System.out.println(list);


        //contains operation - O(n)
        //Use to check is the given element exists or not in ArrayList
        System.out.println(list.contains(1));
        System.out.println(list.contains(15));


        //If you want to add the element at particular index
        list.add(1, 9);
        System.out.println(list);


        //If you want to Know the size of ArrayList
        System.out.println(list.size());


        //To print all the elements in ArrayList
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        //Print Reverse 
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }
    }
}
