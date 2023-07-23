import java.util.Scanner;
class practice4_21{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("层数：");
        int input = stdIn.nextInt();
        System.out.println("显示直角在左上方的三角形。");
        for(int i = input; i > 0; i--){
            for(int j = i; j > 0; j--)
                System.out.print('*');
            System.out.println();
        }
        System.out.println("显示直角在右下方的三角形。");
        for(int i = 1; i <= input; i++){
            for(int j = input; j > 0; j--){
                if(j <= i)
                    System.out.print('*');
                else
                    System.out.print(' ');
            }System.out.println();
        }
        System.out.println("显示直角在右上方的三角形。");
        for(int i = input; i > 0; i--){
            for(int j = input; j > 0; j--){
                if(j <= i)
                    System.out.print('*');
                else
                    System.out.print(' ');
            }System.out.println();
        }
    }
}