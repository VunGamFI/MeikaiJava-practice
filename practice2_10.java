import java.util.Scanner;
class practice2_10{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("姓：");
        String LastName = stdIn.next();
        System.out.print("名：");
        String FirstName = stdIn.next();
        System.out.println("您好" + LastName + FirstName + "先生。");
    }
}