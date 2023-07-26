import java.util.Scanner;
class practice7_7{
    static void putChars(char c, int n){
        while(n-- > 0)
            System.out.print(c);
    }
    static void putStars(int n){
        for(int i = 1; i <= n; i++){
            putChars('*', i);
            System.out.println();
        }
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.println("显示直角在左下方的三角形。");
        System.out.print("层数：");
        int n = stdIn.nextInt();
        putStars(n);
    }
}