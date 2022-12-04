// By Using Prefix
// This approach is not working for me. I'll came back to solve it.
class SumOfSubArray2{
    public static void sumOfSubArray2(int nums[]){
        int prefix[] = new int[nums.length];
        int currentSum = 0;
        prefix[0] = nums[0];
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i - 1] + nums[i];
        }
    

        for(int i = 0; i < nums.length; i++){
            
            for(int j = i; j <= nums.length; j++){
                currentSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                System.out.println(currentSum);
            }
        }
    }

    public static void main(String...args){
        int numbers[] = {1, -2, 6, -1, 3};
        sumOfSubArray2(numbers);
    }
}