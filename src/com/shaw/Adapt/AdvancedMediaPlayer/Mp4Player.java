package com.shaw.Adapt.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playMp4(String fileName) {
        System.out.println("play mp4 video,name: "+fileName);
    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("do nothing");
    }
}
