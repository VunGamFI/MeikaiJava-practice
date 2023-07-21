import java.util.Scanner;
class practice2_4{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数值：");
        int InputNum = stdIn.nextInt();
        int a = InputNum + 10;
        int b = InputNum - 10;
        System.out.println("加上10后的值是：" + a + "。");
        System.out.println("减去10后的值是：" + b + "。");
    }
}