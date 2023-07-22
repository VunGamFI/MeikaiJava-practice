import java.util.Scanner;
class practice3_12{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("第一个整数值：");
        int input_1 = stdIn.nextInt();
        System.out.print("第二个整数值：");
        int input_2 = stdIn.nextInt();
        System.out.print("第三个整数值：");
        int input_3 = stdIn.nextInt();

        int min = input_1;
        if(min > input_2)
            min = input_2;
        if(min > input_3)
            min = input_3;

        System.out.println("三个数中的最小值是：" + min + "。");
    }
}