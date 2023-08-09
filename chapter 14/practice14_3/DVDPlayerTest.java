package practice14_3;

public class DVDPlayerTest{
    public static void main(String[] args){
        Player test_1 = new DVDPlayer();
        ExPlayer test_2 = new DVDPlayer();
        DVDPlayer test_3 = new DVDPlayer();

        test_1.play();
        test_1.stop();

        test_2.slow();
        test_3.slow();
    }
}