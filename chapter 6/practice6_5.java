import java.util.Scanner;
class practice6_5{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("元素个数：");
        int input = stdIn.nextInt();

        int[] a = new int[input];
        for(int i = 0; i < input; i++){
            System.out.print("a[" + i + "] = ");
            a[i] = stdIn.nextInt();
        }

        System.out.print("a = {");
        for(int i = 0; i < input - 1; i++)
            System.out.print(a[i] + "，");
        System.out.println(a[a.length - 1] + "}");
    }
}