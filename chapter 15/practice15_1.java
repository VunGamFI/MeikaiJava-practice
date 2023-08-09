import java.util.Scanner;
class practice15_1{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("字符串s：");
        String s = stdIn.nextLine();

        System.out.println("倒序显示");
        for(int i = s.length() - 1; i >= 0; i--)
            System.out.print(s.charAt(i));
    }
}
