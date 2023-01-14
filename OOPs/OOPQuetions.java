import java.util.*;

// Print the sum,difference and product of two complex numbers by creating a class named 'Complex' with separate methods for each operation whose real and imaginary parts are entered by the user.



class Complex {
    void sum(int a, int b){
        System.out.println("Sum of "+a+" and "+b+" is "+ a + b +".");
    }
    void diff(int a, int b){
        System.out.println("Difference of "+a+" and "+b+" is "+ (b - a) +".");
    }
    void product(int a, int b){
        System.out.println("Product of "+a+" and "+b+" is "+ (a*b) +".");
    }
}

public class OOPQuetions {
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a real number: ");
        int realNum = sc.nextInt();
        System.out.println("Enter an Imaginary number: ");
        int imaginaryNum = sc.nextInt();
        sc.close();

        Complex obj = new Complex();

        obj.sum(realNum, imaginaryNum);
        obj.diff(realNum, imaginaryNum);
        obj.product(realNum, imaginaryNum);
    }
}
