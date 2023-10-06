package java_test.DesignPattern.StructuralPatterns.Adapter;

public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("playing mp4 file:" + fileName);
    }
}
