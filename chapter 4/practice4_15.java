import java.util.Scanner;
class practice4_15{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("从多少cm开始：");
        int start = stdIn.nextInt();
        System.out.print("到多少cm结束：");
        int end = stdIn.nextInt();
        System.out.print("每次增量多少cm：");
        int add = stdIn.nextInt();
        System.out.println("身高       标准体重");
        for(; start <= end; start += add)
            System.out.println(start + "        " + (start - 100) * 0.9);
    }
}