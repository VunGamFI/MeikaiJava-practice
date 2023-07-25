import java.util.Scanner;
class practice6_8{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int sum = 0;
        System.out.println("计算。");
        System.out.print("元素个数：");
        int input = stdIn.nextInt();
        double[] a = new double[input];

        for(int i = 0; i < input; i++){
            System.out.print("数值：");
            a[i] = stdIn.nextInt();
        }

        for(double i : a){
            sum += i;
        }

        System.out.println("合计值为" + sum + "。");
        System.out.println("平均值为" + (double)sum / input + "。");
    }
}