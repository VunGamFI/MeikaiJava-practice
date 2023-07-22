import java.util.Scanner;
class practice2_5{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("x的值：");
        double x = stdIn.nextDouble();
        System.out.print("y的值：");
        double y = stdIn.nextDouble();
        System.out.println("合计值是：" + (x + y) + "。");
        System.out.println("平均值是：" + (x + y) / 2 + "。");
    }
}
