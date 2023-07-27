import java.util.Scanner;
import java.util.Random;
class practice7_10{
    static Scanner stdIn = new Scanner(System.in);
    static Random rand = new Random();

    static boolean confirmRetry(){
        int count;
        do{
            System.out.print("再来一次？ <Yes --- 1 / No --- 0>：");
            count = stdIn.nextInt();
        }while(count != 0 && count != 1);
        return count == 1;
    }

    static char symbol(int n){
        char[] symbol = {'+', '-'};
        return symbol[n];
    }

    public static void main(String[] args){
        System.out.println("心算能力训练！！");
        do{
            int x = rand.nextInt(900) + 100;
            int y = rand.nextInt(100) + 100;
            int z = rand.nextInt(100) + 100;
            char symbol_1 = symbol(rand.nextInt(2));
            char symbol_2 = symbol(rand.nextInt(2));

            while(true){
                System.out.print(x + " " + symbol_1 + " " + y + " " + symbol_2 + " " + z + " = ");
                int k = stdIn.nextInt();
                if(symbol_1 == '+' && symbol_2 == '+'){
                    if (k == (x + y + z))
                        break;
                }
                else if(symbol_1 == '+' && symbol_2 == '-'){
                    if (k == (x + y - z))
                        break;
                }
                else if(symbol_1 == '-' && symbol_2 == '+'){
                    if (k == (x - y + z))
                        break;
                }else
                    if (k == (x - y - z))
                        break;
                System.out.println("回答错误！！");
            }
        }while(confirmRetry());
    }
}