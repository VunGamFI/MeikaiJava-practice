import java.util.Scanner;

class practice15_2{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("字符串s：");
        String s = stdIn.nextLine();

        for(int i = 0; i < s.length(); i++){
            System.out.printf("0x%x", s.codePointAt(i));
            System.out.println();
        }
    }
}