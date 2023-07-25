import java.util.Scanner;
import java.util.Random;
class practice6_10 {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("元素个数：");
        int input = stdIn.nextInt();
        int[] a = new int[input];

        a[0] = rand.nextInt(10) + 1;
        for(int i = 1; i < input; i++){
            a[i] = rand.nextInt(10) + 1;
            if(a[i] == a[i - 1])
                a[i] = rand.nextInt(10) + 1;
        }

        System.out.print("该数组的元素为{ ");
        for(int i = 0; i < input; i++)
            System.out.print(a[i] + " ");
        System.out.println("}");
    }
}