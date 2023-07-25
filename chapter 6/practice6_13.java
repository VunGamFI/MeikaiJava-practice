import java.util.Scanner;
class practice6_13{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("元素个数：");
        int num = stdIn.nextInt();

        int[] a = new int[num];
        int[] b = new int[num];

        for(int i = 0; i < num; i++){
            System.out.print("a[" + i + "] = ");
            a[i] = stdIn.nextInt();
        }

        for(int i = 0; i < num; i++)
            b[i] = a[num - i - 1];

        System.out.print("数组b的元素为{ ");
        for(int i = 0; i < num; i++)
            System.out.print(b[i] + " ");
        System.out.println("}");
    }
}