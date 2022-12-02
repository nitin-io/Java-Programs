import java.util.*;

class LinearSearch{
    public static int linearSearch(int arr[], int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String...args){
        int randomNumbers[] = {44, 53, 77, 89, 98, 47};
        int key = 53;

        int index = linearSearch(randomNumbers, key);

        if(index == -1){
            System.out.println("Key Not Found");
        }
        else{
            System.out.println("Index number of " + key + " is " + index);
        }
    }
}