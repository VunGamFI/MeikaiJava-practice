import java.util.Random;
class practice3_17{
    public static void main(String[] args){
        Random rand = new Random();
        int RandNum = rand.nextInt(3);

        switch(RandNum){
            case 0 : System.out.println("石头");   break;
            case 1 : System.out.println("剪刀");   break;
            case 2 : System.out.println("布");    break;
        }
    }
}