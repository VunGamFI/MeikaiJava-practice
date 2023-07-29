import java.util.Scanner;
class practice7_32{
    static void printBits(byte x){
        for(int i = 7; i >= 0; i--)
            System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
    }
    static void printBits(short x){
        for(int i = 15; i >= 0; i--)
            System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
    }
    static void printBits(int x){
        for(int i = 31; i >= 0; i--)
            System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
    }
    static void printBits(long x){
        for(int i = 63; i >= 0; i--)
            System.out.print(((x >>> i & 1) == 1) ? '1' : '0');
    }

    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        System.out.print("byte型整数的值：");
        byte input_1 = stdIn.nextByte();
        System.out.print("位构成 = ");
        printBits(input_1);

        System.out.print("\nshort型整数的值：");
        short input_2 = stdIn.nextShort();
        System.out.print("位构成 = ");
        printBits(input_2);

        System.out.print("\nint型整数的值：");
        int input_3 = stdIn.nextInt();
        System.out.print("位构成 = ");
        printBits(input_3);

        System.out.print("\nlong型整数的值：");
        long input_4 = stdIn.nextLong();
        System.out.print("位构成 = ");
        printBits(input_4);
    }
}