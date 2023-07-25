import java.util.Random;
import java.util.Scanner;
class practice6_12{
    public static void main(String[] args){
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("元素个数：");
        int total = stdIn.nextInt();

        int[] ChangBefore = new int[total];
        int[] ChangAfter = new int[total];

        for(int i = 0; i < total; i++)
            ChangBefore[i] = rand.nextInt(100);
        for(int i = 0; i < total; i++)
            ChangAfter[i] = ChangBefore[i];

        for(int i = 0; i < total; i++){
            int t = ChangAfter[i];
            int n = rand.nextInt(total);
            ChangAfter[i] = ChangAfter[n];
            ChangAfter[n] = t;
        }
        System.out.print("数组的元素为{ ");
        for(int i = 0; i < total; i++)
            System.out.print(ChangBefore[i] + " ");
        System.out.println("}");

        System.out.print("按随机顺序混合后的数组为{ ");
        for(int i = 0; i < total; i++)
            System.out.print(ChangAfter[i] + " ");
        System.out.println("}");
    }
}