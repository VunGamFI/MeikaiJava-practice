class practice15_7{
    public static void main(String[] args){
        double sum = 0.0;
        double[] temp = new double[args.length];

        for(int i = 0; i < args.length; i++)
            temp[i] = Double.parseDouble(args[i]);

        for(double i : temp){
            sum += i;
        }
        System.out.println("合计值为" + sum + "。");
    }
}