import java.util.Scanner;
class practice7_21{
    static Scanner stdIn = new Scanner(System.in);
    static void add(int[] a, int n){
        for(int i = 0; i < n; i++){
            System.out.print("第" + (i + 1) + "个元素值：");
            a[i] = stdIn.nextInt();
        }
    }
    static void printArray(int[] a){
//        for(int i = 0; i < a.length; i++)
//            System.out.print(a[i] + " ");
        for (int i : a)
            System.out.print(i + " ");
    }
    static void aryExchng(int[] a, int[] b){
        int shortN = a.length;
        if(a.length > b.length)
            shortN = b.length;
        for(int i = 0; i < shortN; i++){
            int midN = a[i];
            a[i] = b[i];
            b[i] = midN;
        }
    }
    public static void main(String[] args){
        System.out.print("数组a的元素个数：");
        int num_a = stdIn.nextInt();
        int[] a = new int[num_a];
        System.out.print("数组b的元素个数：");
        int num_b = stdIn.nextInt();
        int[] b = new int[num_b];

        System.out.println("输入数组a的元素值");
        add(a, num_a);
        System.out.println("输入数组b的元素值");
        add(b, num_b);

        aryExchng(a, b);
        System.out.print("交换数值后数组a的元素为{ ");
        printArray(a);
        System.out.println("}");
        System.out.print("交换数值后数组b的元素为{ ");
        printArray(b);
        System.out.println("}");
    }
}