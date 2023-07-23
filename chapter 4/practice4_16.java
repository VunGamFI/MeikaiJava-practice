import java.util.Scanner;
class practice4_16{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int input;
        do{
            System.out.print("要显示多少个*呢：");
            input = stdIn.nextInt();
        }while(input < 0);
        for(int i = 1; i <= input; i++){
            System.out.print('*');
            if(i % 5 == 0)
                System.out.println();
        }
    }
}