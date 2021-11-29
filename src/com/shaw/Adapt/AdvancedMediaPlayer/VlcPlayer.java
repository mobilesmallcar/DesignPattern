package com.shaw.Adapt.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer{

    @Override
    public void playMp4(String fileName) {
        System.out.println("do nothing");
    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("play vlc video,name: "+fileName);
    }
}
