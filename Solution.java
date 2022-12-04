class Solution {
    public static int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++){
            
            if(currSum < 0){
                currSum = 0;
            }

            currSum += nums[i];
            maxSum = Math.max(nums[i], currSum);
        }
        return maxSum;
    }

    public static void main(String...args){
        int numbers[] = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(numbers);
    }
}
