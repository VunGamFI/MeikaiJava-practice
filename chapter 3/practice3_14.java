import java.util.Scanner;
class practice3_14{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数a：");
        int a = stdIn.nextInt();
        System.out.print("整数b：");
        int b = stdIn.nextInt();
        int max, min;

        if(a == b)
            System.out.println("两个值相等。");
        else {
            if (a > b) {
                max = a;
                min = b;
            } else {
                max = b;
                min = a;
            }
            System.out.println("较大的值是" + max + "。");
            System.out.println("较小的值是" + min + "。");
        }
    }
}