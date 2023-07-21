import java.util.Random;
class practice2_9{
    public static void main(String[] args){
        Random rand = new Random();
        double a = rand.nextDouble(1.0);
        double b = rand.nextDouble(10.0);
        double c = rand.nextDouble(1.0) - 1.0;
        System.out.println("大于等于0.0小于1.0的实数：" + a);
        System.out.println("大于等于0.0小于等于10.0的实数：" + b);
        System.out.println("大于等于-1.0小于1.0的实数：" + c);
    }
}