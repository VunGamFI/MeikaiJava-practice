import java.util.Scanner;
class practice7_18{
    static void aryRmv(int[] a, int idx){
        for(int i = 0; i < a.length - idx - 1; i++)
            a[idx + i] = a[idx + i + 1];
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("元素个数：");
        int num = stdIn.nextInt();
        int[] a = new int[num];

        for(int i = 0; i < num; i++){
            System.out.print("第" + (i + 1) + "个元素为：");
            a[i] = stdIn.nextInt();
        }

        System.out.print("删除第几位元素：");
        int idx = stdIn.nextInt();
        while(idx < 0 || idx >= num)
            idx = stdIn.nextInt();

        aryRmv(a, idx);
        System.out.print("删除操作后的元素为{ ");
        for(int i = 0; i < num; i++)
            System.out.print(a[i] + " ");
        System.out.println("}");
    }
}