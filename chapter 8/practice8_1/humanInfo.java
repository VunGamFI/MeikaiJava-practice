package practice8_1;
import java.util.Scanner;
class humanInfo{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        Human zhangsan = new Human("张三", 165, 40);
        Human wangwu = new Human("王五", 170, 55);

        System.out.print("名字：");
        String name = stdIn.nextLine();
        System.out.print("身高：");
        int height = stdIn.nextInt();
        System.out.print("体重：");
        int weight = stdIn.nextInt();

        Human humaninfo_input = new Human(name, height, weight);
        humaninfo_input.humaninfo();

        System.out.println("张三的体重为" + zhangsan.getHeight() + "kg。");
        System.out.println("王五的身高为" + wangwu.getWeight() + "cm。");

    }
}
