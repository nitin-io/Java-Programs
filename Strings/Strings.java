import java.util.*;

class Strings{
    public static void main(String...args){
        // Strings are IMMUTABLE.
        String str;
        Scanner sc = new Scanner(System.in);

        str = sc.nextLine();

        System.out.println("Hello " + str);
        System.out.println("The First Letter of your name is " + str.charAt(0)+ ".");
        System.out.println("The Last Letter of your fullname is " + str.charAt(str.length() - 1)+ ".");
    }
}