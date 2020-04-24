package audio;

import javax.sound.sampled.*;
import java.io.File;
import java.util.ArrayList;
import javax.sound.sampled.AudioFormat;




public class MusicPlayer implements Runnable {
    private ArrayList<String> musicFiles;
    private int currentSongIndex;

    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MusicPlayer();
        Thread thread = new Thread(musicPlayer);
        thread.start();
    }

    public MusicPlayer(String... files) {
     /*   musicFiles = new ArrayList<String>();
        for (String file : files) {
            musicFiles.add("resources/music/"+ file +"");

        }*/
    }
    public void playSound(String fileName){
        try{
            File soundFile = new File(fileName);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
            AudioFormat format = audioInputStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            Clip clip = (Clip) AudioSystem.getLine(info);
            clip.open(audioInputStream);
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(+10);
            clip.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        playSound("resources/music/Supermarket7.wav");
    }

}
