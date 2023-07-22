import java.util.Scanner;
class practice3_16{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("第一个整数：");
        int input_1 = stdIn.nextInt();
        System.out.print("第二个整数：");
        int input_2 = stdIn.nextInt();
        System.out.print("第三个整数：");
        int input_3 = stdIn.nextInt();

        int max, mid, min;

        if(input_1 > input_2){
            if(input_3 < input_2){
                min = input_3;
                mid = input_2;
                max = input_1;
            }else if(input_3 > input_1){
                min = input_2;
                mid = input_1;
                max = input_3;
            }else{
                min = input_2;
                mid = input_3;
                max = input_1;
            }
            System.out.println("三个整数从小到大排序为：" + min + mid + max + "。");
        }else{
            if(input_3 < input_1){
                min = input_3;
                mid = input_1;
                max = input_2;
            }else if(input_3 > input_2){
                min = input_1;
                mid = input_2;
                max = input_3;
            }else{
                min = input_1;
                mid = input_3;
                max = input_2;
            }
            System.out.println("三个整数从小到大排序为：" + min + mid + max + "。");
        }
    }
}