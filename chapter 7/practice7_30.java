import java.util.Scanner;
class practice7_30{
    static int min(int a, int b){
        int min = a;
        if(min > b)
            min = b;
        return min;
    }
    static int min(int a, int b, int c){
        int min = a;
        if(min > b)
            min = b;
        if(min > c)
            min = c;
        return min;
    }
    static int min(int[] a){
        int min = a[0];
        for(int i = 1; i < a.length; i++)
            if(min > a[i])
                min = a[i];
        return min;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("a的值：");
        int a = stdIn.nextInt();
        System.out.print("b的值：");
        int b = stdIn.nextInt();
        System.out.print("c的值：");
        int c = stdIn.nextInt();
        System.out.print("数组a的元素个数：");
        int num = stdIn.nextInt();
        int[] array = new int[num];
        for(int i = 0; i < num; i++){
            System.out.print("第" + (i + 1) + "个整数：");
            array[i] = stdIn.nextInt();
        }

        System.out.println("a、b中的最小值为" + min(a, b) + "。");
        System.out.println("a、b、c中的最小值为" + min(a, b, c) + "。");
        System.out.println("数组中的最小值为" + min(array) + "。");
    }
}