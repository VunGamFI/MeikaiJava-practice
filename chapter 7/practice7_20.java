import java.util.Scanner;
class practice7_20{
    static void aryIns(int[] a, int idx, int x){
        if(idx == a.length - 1)
            a[a.length - 1] = x;
        else {
            for (int i = a.length - 1; i > idx; i--)
                a[i] = a[i - 1];
            a[idx] = x;
        }
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("元素个数：");
        int num = stdIn.nextInt();
        int[] a = new int[num];

        for(int i = 0; i < num; i++){
            System.out.print("第" + (i + 1) + "个元素值：");
            a[i] = stdIn.nextInt();
        }
        System.out.print("插入到第几位：");
        int idx = stdIn.nextInt();
        System.out.print("要插入的数值：");
        int InsertNum = stdIn.nextInt();
        aryIns(a, idx, InsertNum);
        System.out.print("更新后的数据为{ ");
        for(int i = 0; i < num; i++)
            System.out.print(a[i] + " ");
        System.out.println("}");
    }
}