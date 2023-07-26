import java.util.Scanner;
class practice7_2{
    static int min(int a, int b, int c){
        int min = a;
        if(min > b)
            min = b;
        if(min > c)
            min = c;
        return min;
    }
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int[] input = new int[3];
        for(int i = 0; i < 3; i++){
            System.out.print("第" + (i + 1) +"个整数：");
            input[i] = stdIn.nextInt();
        }
        System.out.print("最小值为" + min(input[0], input[1], input[2]));
    }
}