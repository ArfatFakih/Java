package StackDSA;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s =  new Stack<>();
        int nextGreater[] = new int[arr.length];

        for(int i=arr.length - 1; i>=0; i--){
            //step-1 while
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }

            //step-2 if-else
            if(s.isEmpty()){
                nextGreater[i] = -1;
            }else {
                nextGreater[i] = arr[s.peek()];
            }

            //step-3 push in stack
            s.push(i);
        }

        for(int i=0; i<nextGreater.length; i++){
            System.out.print(nextGreater[i] + " ");
        }
        System.out.println();

        //4 types of this problem 
        //Difference is only need to change the sign of the loop

        //1- next Greater Right
        //2- next Greater Left
        //3- next Smaller Right
        //4- next Smaller Left
    }
}
