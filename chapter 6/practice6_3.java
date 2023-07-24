class practice6_3{
    public static void main(String[] args){
        double[] a = new double[5];
        for(int i = 0; i < a.length; i++){
            a[i] = (double)(i + 1) * 11 / 10;
            System.out.println("a[" + i + "] = " + a[i] + "。");
        }
    }
}