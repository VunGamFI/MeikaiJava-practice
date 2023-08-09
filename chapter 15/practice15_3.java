import java.util.Scanner;

class practice15_3{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("字符串s1：");
        String s1 = stdIn.nextLine();
        System.out.print("字符串s2:");
        String s2 = stdIn.nextLine();

        int idk = s1.indexOf(s2);
        if(idk == -1)
            System.out.println("s1中不包含s2。");
        else{
            System.out.println("s1：" + s1);
            System.out.print("s2：");
            for(int i = 0; i < idk; i++)
                System.out.print(" ");
            System.out.print(s2);
        }
    }
}