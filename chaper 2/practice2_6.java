import java.util.Scanner;
class practice2_6{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("求三角形的面积。\n底：");
        double a = stdIn.nextDouble();
        System.out.print("高：");
        double h = stdIn.nextDouble();
        System.out.println("面积是：" + (a * h) / 2 + "。");
    }
}
