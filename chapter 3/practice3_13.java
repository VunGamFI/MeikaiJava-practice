import java.util.Scanner;
class practice3_13{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("第一个整数：");
        int input_1 = stdIn.nextInt();
        System.out.print("第二个整数：");
        int input_2 = stdIn.nextInt();
        System.out.print("第三个整数：");
        int input_3 = stdIn.nextInt();

        if((input_1 >= input_2 && input_1 <= input_3) || (input_1 >= input_3 && input_1 <= input_2))
            System.out.println("中间值是：" + input_1 + "。");
        else if((input_2 >= input_1 && input_2 <= input_3) || (input_2 >= input_3 && input_2 <= input_1))
            System.out.println("中间值是：" + input_2 + "。");
        else
            System.out.println("中间值是：" + input_3 + "。");
    }
}