class practice5_7{
    public static void main(String[] args){
        for(int i = 0; i <= 1000; i++){
            float FloatNum = (float)i / 1000;
            float square = (float)(i * i) / 1000000;
            System.out.printf("%9.7f", FloatNum);
            System.out.printf("   %9.7f\n", square);
        }
    }
}