import java.util.Scanner;

class practice16_4{
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
            throw new RuntimeException("空数组", e);
        }catch(ArrayIndexOutOfBoundsException e){
            throw new RuntimeException("reverse的Bug？", e);
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

        try{
            reverse(x);
            System.out.println("元素的倒序排列执行完毕。");
            for(int i = 0; i < num; i++)
                System.out.println("x[" + i + "] = " + x[i]);
        }catch(RuntimeException e){
            System.out.println("异常    ：" + e);
            System.out.println("异常原因 ：" + e.getCause());
        }
    }
}