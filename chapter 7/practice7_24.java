import java.util.Scanner;
class practice7_24{
    static int[] arrayRmvOf(int[] a, int idx){
        int[] del = new int[a.length - 1];
        for(int i = 0; i < a.length - 1; i++){
            if(i < idx)
                del[i] = a[i];
            else
                del[i] = a[i + 1];
        }
        return del;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("数组a元素个数：");
        int num = stdIn.nextInt();
        int[] a = new int[num];

        for(int i = 0; i < num; i++){
            System.out.print("第" + (i + 1) + "个元素值：");
            a[i] = stdIn.nextInt();
        }
        System.out.print("要删除的元素位置：");
        int idx = stdIn.nextInt();

        System.out.print("删除后的数组元素为{ ");
        int[] del = arrayRmvOf(a, idx);
        for(int i : del)
            System.out.print(i + " ");
        System.out.println("}");
    }
}