public class Other {
    public static void main(String[] args){
        int x=3, y=5, z=10;

        int a = 10;

        System.out.println(a+" "+ --a*a-- + " " + a);
        System.out.println(++z + y - y + z + x++);

        for(int i = 0; i <= 5; i++){
            for(int j = i; j > 0; j--){
                System.out.print(i);
            }
            System.out.println();
        }

        int meal = 5;
        int tip = 2;
        int total = meal + (meal > 6 ? ++tip: --tip);
        System.out.println(tip);
        System.out.println(total);

        int i;
        for(i = 1; i < 6; i++){
            System.out.println(i);
            if(i>3) continue;
        }
        System.out.println(i);

        x = 5;
        x *= (3 + 7);
        System.out.println(x);

        for(i = 1; i <= 5; i++){
            for(int j = 5; j >= i; j--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
