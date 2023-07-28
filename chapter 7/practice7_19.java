import java.util.Scanner;
class practice7_19{
    static void aryRmvN(int[] a, int idx, int n){
        for(int i = idx; i < idx + n; i++){
            if(idx + n == a.length)
                a[i] = 0;   //删除到最后一位时，删除掉的部分设为0
            else if(i < a.length - n)
                a[i] = a[i + n];    //删除位数小于末尾位数
            else
                a[i] = a[i + n - (a.length - idx - n)]; //删除位数大于末尾位数
        }
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("元素个数：");
        int num = stdIn.nextInt();
        int[] a = new int[num];
        for(int i = 0; i < num; i++){
            System.out.print("第" + (i + 1) + "个值为：");
            a[i] = stdIn.nextInt();
        }
        System.out.print("删除第几位元素：");
        int idx = stdIn.nextInt();
        System.out.print("删除几个元素：");
        int delnum = stdIn.nextInt();
        aryRmvN(a, idx, delnum);
        for(int i = 0; i < num; i++)
            System.out.print(a[i] + " ");
    }
}