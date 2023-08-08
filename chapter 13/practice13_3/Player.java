package practice13_3;

public abstract class Player{
    private int hand;              //手势

    public int getHand(){ return hand; }

    public void setHand(int hand) { this.hand = hand; }

    public void handing(){
        switch(getHand()){
            case 0 : System.out.println("石头");      break;
            case 1 : System.out.println("剪刀");      break;
            case 2 : System.out.println("布");       break;
        }
    }
}