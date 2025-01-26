public class TilingProblem {

    public static int tiling(int n){
        if(n==0 || n==1){
            return 1;
        }
        //vertical choice
        int verticalTiles = tiling(n-1);

        //horizontal choice
        int horizontalTiles = tiling(n-2);

        int ans =  verticalTiles + horizontalTiles;

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(3);
    }
}
