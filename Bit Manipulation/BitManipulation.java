public class BitManipulation {
    public static int ithBit(int n, int i){
        int rightShiftValue = n >> i;
        int ithBit = rightShiftValue & 1;
        return ithBit;
    }

    // public static String convertBinary(int number){
    //     StringBuilder binaryNumber = new StringBuilder("");
    //     for(int i = 0; i <= 8; i++){
    //          binaryNumber += ((number >> i) & 1);
    //     }

    public static boolean isEvenOrOdd(int n){
        if((n & 1) == 0){
            System.out.println("Even");
            return true;
        }
        return false;
    }
    public static void main(String...args){
        // if(isEvenOrOdd(4)){
        //     System.out.println("Number is even");
        // }
        // else {
        //     System.out.println("Number is odd");
        // }

        // System.out.println(ithBit(9, 0));
        System.out.println(1<<9);
    }
}
