import java.util.Scanner;
class practice7_17{
    static int linearSearchR(int[] a, int key){
        for(int i = a.length - 1; i >= 0; i--)
            if(a[i] == key)
                return i;
        return -1;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("元素个数：");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for(int i = 0; i < num; i++){
            System.out.print("x[" + i + "] = ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("要查找的值：");
        int key = stdIn.nextInt();

        int idx = linearSearchR(x, key);
        if(idx == -1)
            System.out.println("不存在该值的元素。");
        else
            System.out.println("该值的元素是x[" + idx + "]。");
    }
}