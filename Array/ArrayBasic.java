import java.util.*;

class ArrayBasic {
    public static void update(int myArray[]) {
        for (int i = 0; i < myArray.length; i++) {
            myArray[i]++;
        }
    }

    public static void main(String... args) {
        int marks[] = new int[3];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < marks.length; i++) {
            marks[i] = scan.nextInt();
        }
        scan.close();
        update(marks);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}