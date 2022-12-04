class SumOfSubArray1 {
    // Using Brute Force
    public static void sumOfSubArray(int nums[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            for (int j = i; j < nums.length; j++){
                int total = 0;
                for (int k = i; k <= j; k++){
                    total += nums[k];
                    if(total > max)
                        max = total;
                    else if(total < min)
                        min = total;
                };
                System.out.print(total + " ");
            }
            System.out.println();
        }
        System.out.println("Maximux Sum Of Sub Array: " + max);
        System.out.println("Minimum Sum Of Sub Array: " + min);
    }

    public static void main(String...args){
        int numbers[] = {1, -2, 6, -1, 3};
        sumOfSubArray(numbers);
    }
}