class LargestNumber {
    public static int getLargest(int arr[]) {
        int largestNum = Integer.MIN_VALUE;
        // int smallestNum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestNum) {
                largestNum = arr[i];
            }
        }
        return largestNum;
    }

    public static void main(String... args) {
        int numbers[] = { 23, 53, 99, 55, 73 };
        System.out.println(getLargest(numbers));
    }
}