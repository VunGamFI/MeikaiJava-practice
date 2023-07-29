import java.util.Scanner;
class practice7_26{
    static int[] arrayInsOf(int[] a, int idx, int x){
        int[] add = new int[a.length + 1];
        for(int i = 0; i < add.length; i++){
            if(i < idx)
                add[i] = a[i];
            else if(i == idx)
                add[i] = x;
            else
                add[i] = a[i - 1];
        }
        return add;
    }
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("数组a的元素个数：");
        int num = stdIn.nextInt();
        int[] a = new int[num];
        for(int i = 0; i < num; i++){
            System.out.print("第" + (i + 1) + "个元素值：");
            a[i] = stdIn.nextInt();
        }
        System.out.print("插入位置：");
        int idx = stdIn.nextInt();
        System.out.print("插入的数值：");
        int x = stdIn.nextInt();

        int[] add = arrayInsOf(a, idx, x);
        System.out.print("插入元素后的数组为{ ");
        for(int i : add)
            System.out.print(i + " ");
        System.out.println("}");
    }
}