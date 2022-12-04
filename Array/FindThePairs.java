class FindThePairs{
    public static void printPairs(int nums[]){
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                System.out.print("(" + nums[i] + ", " + nums[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String...args){
        int numbers[] = {2, 4, 6, 8, 10, 12};

        printPairs(numbers);
    }
}