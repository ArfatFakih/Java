package ArrayLists;

import java.util.ArrayList;

public class ContainerWithMostWater2 {

    // 2 Pointer approach
    // Time Complexity - O(n)
    public static int storeWater(ArrayList<Integer> heigth){

        int maxWater = 0;
        int lp = 0;
        int rp = heigth.size() - 1;

        while(lp < rp){
            //Calculate Water area
            int ht = Math.min(heigth.get(lp), heigth.get(rp));
            int width = rp - lp;
            int currWater = ht * width;
            maxWater = Math.max(maxWater, currWater);

            //Update pointer
            if(heigth.get(lp) < heigth.get(rp)){
                lp++;
            }else {
                rp--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {

        ArrayList<Integer> height = new ArrayList<>(); 

        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("Maximum water can be Stored is: " + storeWater(height));
    }
}
