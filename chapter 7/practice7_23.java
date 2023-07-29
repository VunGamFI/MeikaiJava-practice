import java.util.Scanner;
class practice7_23{
    static int[] arraySrchIdx(int[] a, int x){
        int key = 0;
        for(int j : a)
            if(j == x)   key++;
        int[] search = new int[key];
        int i = 0, t = 0;
        for(; i < key; i++)
            for(; t < a.length; t++){
                if(a[t] == x){
                    search[i] = t;
                    t++;
                    break;
                }
            }
        return search;
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("数组a的元素个数：");
        int num = stdIn.nextInt();
        int[] a = new int[num];
        for(int i = 0; i < num; i++){
            System.out.print("第" + (i + 1) + "个元素的值：");
            a[i] = stdIn.nextInt();
        }
        System.out.print("要查找的值：");
        int key = stdIn.nextInt();

        int[] result = arraySrchIdx(a, key);
        System.out.print("返回值为{ ");
        for(int i : result)
            System.out.print(i + " ");
        System.out.println("}");
    }
}