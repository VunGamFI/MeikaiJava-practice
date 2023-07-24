class practice5_6{
    public static void main(String[] args){
        System.out.println("  float        int   ");
        System.out.println("---------------------");
        float i;
        int j;
        for(i = 0, j = 0; j <= 1000; i += 0.001, j++){
            System.out.printf("%9.7f",i);
            System.out.printf("   %9.7f\n", ((float)j / 1000));
        }
    }
}