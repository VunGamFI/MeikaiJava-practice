import java.util.Scanner;

class practice15_4{
    static void printDouble(double x, int p, int w){
        System.out.printf(String.format("%%%d.%df", w, p), x);
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        double test = 1.9;

        printDouble(test, 4, 9);
    }
}