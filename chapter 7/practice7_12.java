import java.util.Scanner;
class practice7_12{
    static void printBits(int x){
        for(int i = 31; i >= 0; i--)
            System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
    }
    static int rRotate(int x, int n){
        int moveL = x << (32 - n);
        int moveR = x >> n;
        return (moveL + moveR);
    }
    static int lRotate(int x, int n){
        int moveL = x >> (32 - n);
        int moveR = x << n;
        return (moveL + moveR);
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数：");
        int input = stdIn.nextInt();
        System.out.print("旋转的值：");
        int rotate = stdIn.nextInt();

        System.out.print("位构成 = ");
        printBits(input);
        System.out.print("\n向右旋转" + rotate + "位后的值为：");
        printBits(rRotate(input, rotate));
        System.out.print("\n向左旋转" + rotate + "位后的值为：");
        printBits(lRotate(input, rotate));
    }
}