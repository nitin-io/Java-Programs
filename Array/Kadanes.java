// Maximum Sum Of Subarray of a array 
// Using Kadane's Algorithm

// Main point in this algorithm is if you have nagetive value
// make it 0 (for example see the line 15 and 16)

class Kadanes{
    public static void kadanes(int nums[]) {
        int currentSum = 0;
        int maximumSum = Integer.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            currentSum += nums[i];

            if(currentSum < 0){
                currentSum = 0;
            }

            maximumSum = Math.max(currentSum, maximumSum);
        }
        System.out.println(maximumSum);
    }


    public static void main(String...args){
        int numbers[] = {-2,1,-3,4,-1,2,1,-5,4};
        kadanes(numbers);
    }
}