import java.util.Random;
class practice2_7{
    public static void main(String[] args){
        Random rand = new Random();
        int a = rand.nextInt(9) + 1;
        int b = - (rand.nextInt(9) + 1);
        int c = rand.nextInt(90) +10;
        System.out.println("1 ~ 9间的值：" + a);
        System.out.println("-9 ~ -1间的值：" + b);
        System.out.println("10 ~ 99间的值：" + c);
    }
}