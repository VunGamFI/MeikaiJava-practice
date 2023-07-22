import java.util.Scanner;
class practice3_9{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("实数a：");
        double a = stdIn.nextDouble();
        System.out.print("实数b：");
        double b = stdIn.nextDouble();

        double max = a > b ? a : b;
        System.out.println("较大的值为：" + max + "。");
    }
}