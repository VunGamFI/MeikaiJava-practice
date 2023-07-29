import java.util.Scanner;
class practice7_22{
    static int[] arrayClone(int[] a){
        int[] clone = new int[a.length];
        for(int i = 0; i < a.length; i++)
            clone[i] = a[i];
        return clone;
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
        int[] clone = arrayClone(a);
        System.out.print("复制后的数组元素值为{ ");
        for(int i : clone)
            System.out.print(i + " ");
        System.out.println("}");
    }
}