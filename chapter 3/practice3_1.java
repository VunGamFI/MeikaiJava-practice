import java.util.Scanner;
class practice3_1{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数值：");
        int input = stdIn.nextInt();
        if(input < 0)
            System.out.println("其绝对值是" + (- input) + "。");
        else
            System.out.println("其绝对值是" + input + "。");
    }
}