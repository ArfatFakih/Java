public class TrappingRainWater {

    public static int trappedRainWater(int height[]){
        int n = height.length;
        int width = 1;
        
        //calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //calculate Right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater = 0;

        for(int i=0; i<n; i++){
            //waterlevel = min(lefmax boundary, rightmax boundary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trappedwater = (waterlevel - height[i]) * width 
            trappedWater += (waterLevel - height[i]) * width;
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};

        System.out.println("Total Trapped Water is : " + trappedRainWater(height));
    }
}
