package practice13_3;

import java.util.Random;
public class Computer extends Player{
    Random rand = new Random();

    private int hand;

    public Computer( ) {
        hand = rand.nextInt(3);
        setHand(hand);
    }
}