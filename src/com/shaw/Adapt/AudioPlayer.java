package com.shaw.Adapt;

public class AudioPlayer implements MediaPlayer{
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("play mp3 vedio,name: "+fileName);
        }else {
            MediaPlayer mediaPlayer = new MediaAdapter(audioType);
            mediaPlayer.play(audioType, fileName);
        }
    }
}
