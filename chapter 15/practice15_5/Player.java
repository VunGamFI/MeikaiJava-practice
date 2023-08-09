package practice15_5;

public abstract class Player{
    private int hand;              //手势

    public abstract String toString();
    public int getHand(){ return hand; }

    public void setHand(int hand) { this.hand = hand; }

    public void handing(){
        System.out.print(toString());
        switch(getHand()){
            case 0 : System.out.println("石头");      break;
            case 1 : System.out.println("剪刀");      break;
            case 2 : System.out.println("布");       break;
        }
    }
}