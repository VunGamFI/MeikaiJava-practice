import java.util.Scanner;
class practice4_22{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("层数：");
        int input = stdIn.nextInt();
        for(int i = 1; i <= input; i++){
            for(int j = 1, turn = 0; j <= (2 * input - 1); j++){
                if(j > input - i && turn < (2 * i - 1)){
                    System.out.print('*');
                    turn++;
                }
                else
                    System.out.print(' ');
            }System.out.println();
        }
    }
}