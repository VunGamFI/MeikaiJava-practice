import java.util.Scanner;
class practice3_10{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("第一个整数：");
        int input_1 = stdIn.nextInt();
        System.out.print("第二个整数：");
        int input_2 = stdIn.nextInt();

        int diff = input_1 > input_2 ? (input_1 - input_2) : (input_2 - input_1);
        System.out.println("两数的差值为；" + diff + "。");
    }
}