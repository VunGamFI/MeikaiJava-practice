package practice14_3;

public class DVDPlayer implements ExPlayer{
    public void play(){
        System.out.println("■DVD播放开始！");
    }

    public void stop(){
        System.out.println("■DVD播放结束！");
    }

    public void slow(){
        System.out.println("■DVD慢放开始：");
    }
}
