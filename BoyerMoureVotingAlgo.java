public class BoyerMoureVotingAlgo {
    public static int majorityElement(int[] nums) {
        int majority =  nums[0] , lead = 1;

        for(int i=1; i<nums.length; i++){
            if(nums[i] == majority){
                lead++;
            }else if(lead > 0){
                lead--;
            }else{
                majority = nums[i];
                lead = 1;
            }
        }
        return majority;
    }

    public static void main(String[] args) {
        int nums[] = {2, 2, 1, 1, 1, 2, 2};

        System.out.println(majorityElement(nums));
    }
}
