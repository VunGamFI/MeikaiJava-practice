import java.util.Scanner;
class practice7_15{
    static int sumOf(int[] a){
        int sum = 0;
        for(int i = 0; i < a.length; i++)
            sum += a[i];
        return sum;
    }
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("元素个数：");
        int num = stdIn.nextInt();
        int[] sum = new int[num];

        for(int i = 0; i < num; i++) {
            System.out.print("第" + (i + 1) + "个整数：");
            sum[i] = stdIn.nextInt();
        }
        System.out.println("全部元素的总和为" + (sumOf(sum)) + "。");
    }
}