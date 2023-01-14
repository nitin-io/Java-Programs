public class RecursionBasics {
    public static void printDecNum(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.print(n + " ");
        printDecNum(n - 1);
    }

    public static void printIncNum(int n){
        if(n == 1){
            System.out.print(1 +" ");
            return;
        }
        
        printIncNum(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args){
        int n = 10;
        printDecNum(n);
        printIncNum(n);
    }
}
