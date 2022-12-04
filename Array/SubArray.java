class SubArray{
    public static void printSubArrays(int nums[]) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length; j++){
                int total = 0;
                System.out.print("(");
                for(int k = i; k <= j; k++){

                    // Also calculating total of every sub array                    
                     total += nums[k] ;
                     System.out.print(nums[k] + " ");
                }
                System.out.print(") " + total + " ");
            }
            System.out.println();
        }
    }


    public static void main(String...args){
        int numbers[] = {2, 4, 6, 8, 10};
        printSubArrays(numbers);
    }
}