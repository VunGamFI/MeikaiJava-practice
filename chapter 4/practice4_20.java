import java.util.Scanner;
class practice4_20{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("层数：");
        int input = stdIn.nextInt();

        for(int i = 1; i <= input; i++){
            for(int j = 1; j <= input; j++)
                System.out.print('*');
            System.out.println();
        }
    }
}