class ReverseAnArray{
    public static void reveseArray(String arr[]){
        int first = 0, last = arr.length - 1;
        
        while(first < last){
            String temp = "";
            temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }


    public static void main(String...args){
        String fruits[] = {"Apple", "Mango", "Grapes", "Orange", "Banana"};

        reveseArray(fruits);

        for(int i = 0; i < fruits.length; i++){
            System.out.print(fruits[i] + " ");
        }
        System.out.println();
    }
}