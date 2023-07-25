import java.util.Scanner;
import java.util.Random;
class practice6_4{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("元素个数：");
        int input = stdIn.nextInt();

        int[] a = new int[input];
        int[] count = new int[input];

        for(int i = 0; i < input; i++)
            a[i] = rand.nextInt(10) + 1;

        int max = a[0];
        for(int i = 1; i < input; i++)
            if(max < a[i])  max = a[i];

        for(int i = 0; i < input; i++)
            count[i] = max - a[i];

        for(int i = 0; i < max; i++){
            for(int j = 0; j < input; j++){
                if(count[j] > 0){
                    System.out.print("  ");
                    count[j]--;
                }else
                    System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 0; i < input; i++)
            System.out.print("--");

        System.out.println();

        for(int i = 0; i < input; i++)
            System.out.print(i % 10 + " ");
    }
}