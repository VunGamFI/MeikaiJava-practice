import java.util.Scanner;
class practice7_16{
    static int minOf(int[] a){
        int min = a[0];
        for(int i = 1; i < a.length; i++)
            if(min > a[i])
                min = a[i];
        return min;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("元素个数：");
        int num = stdIn.nextInt();
        int[] min = new int[num];

        for(int i = 0; i < num; i++){
            System.out.print("第" + (i + 1) + "个整数：");
            min[i] = stdIn.nextInt();
        }
        System.out.println("最小值为" + minOf(min) + "。");
    }
}