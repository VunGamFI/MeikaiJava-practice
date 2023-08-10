import java.util.Scanner;

class practice16_3{

    static void swap(int[] a, int idx1, int idx2){
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int[] a){
        try{
            for(int i = 0; i < a.length / 2; i++)
                swap(a, i, a.length - i);
        }catch(NullPointerException e){
            System.out.println("数组为空引用！！");
            System.exit(1);
        }catch(ArrayIndexOutOfBoundsException e){
            System.exit(1);
        }
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("元素个数：");
        int num = stdIn.nextInt();

        int[] x = new int[num];

        for(int i = 0; i < num; i++){
            System.out.print("x[" + i + "]：");
                x[i] = stdIn.nextInt();
        }

        reverse(x);

        System.out.println("元素的倒序排列执行完毕。");
        for(int i = 0; i < num; i++)
            System.out.println("x[" + i + "] = " + x[i]);
    }
}