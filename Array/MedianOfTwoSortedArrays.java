import java.util.*;

class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        double newArray[] = new double[m+n];

        for(int i = 0; i < m; i++){
            newArray[i] = nums1[i];
        }

        int count = 0;
        for(int i = m; i < newArray.length; i++){
            newArray[i] = nums2[count];
            count++;
        }

        Arrays.sort(newArray);

        if(newArray.length%2==0){
            int leftMid = newArray.length/2;
            int rightMid = newArray.length/2-1;
            return (newArray[rightMid] + newArray[leftMid]) / 2;
        } else {
            int a = newArray.length/2;
            return newArray[a];
        }
    }

    public static void main(String...args){
        int num1[] = {1, 3};
        int num2[] = {2, 4};
        System.out.println(findMedianSortedArrays(num1, num2));
    }
}


