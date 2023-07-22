import java.util.Scanner;
class practice3_15{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("第一个整数：");
        int input_1 = stdIn.nextInt();
        System.out.print("第二个整数：");
        int input_2 = stdIn.nextInt();

        if(input_1 > input_2){
            int min = input_2;
            input_2 = input_1;
            input_1 = min;
        }
        System.out.println("排序成" + input_1 + "<=" + input_2 + "。");
    }
}