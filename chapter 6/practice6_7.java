import java.util.Scanner;
import java.util.Random;
class practice6_7{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        final int n = 12;
        int[] a = new int[n];

        for(int j = 0; j < n; j++)
            a[j] = rand.nextInt(10);

        System.out.print("数组a中全部元素的值\n{ ");
        for(int j = 0; j < n; j++)
            System.out.print(a[j] + " ");
        System.out.println('}');

        System.out.print("要查找的值：");
        int key = stdIn.nextInt();

        int i;
        for(i = a.length - 1; i >= 0; i--)
            if(a[i] == key){
                break;
            }
        if(i >= 0)
            System.out.println("该元素是a[" + i + "]。");
        else
            System.out.println("该元素不存在。");
    }
}