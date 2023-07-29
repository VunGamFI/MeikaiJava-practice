import java.util.Scanner;
class practice7_25{
    static int[] arrayRmvOfN(int[] a, int idx, int n){
        int[] del = new int[a.length - n];
        for(int i = 0; i < del.length; i++){
            if(i < idx)
                del[i] = a[i];
            else
                del[i] = a[i + n];
        }
        return del;
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
        System.out.print("要删除的元素：");
        int idx = stdIn.nextInt();
        System.out.print("删除个数：");
        int n = stdIn.nextInt();

        int[] del = arrayRmvOfN(a, idx, n);

        System.out.print("删除后的元素值为{ ");
        for(int i : del)
            System.out.print(i + " ");
        System.out.println("}");
    }
}