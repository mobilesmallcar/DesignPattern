package com.shaw.Adapt;

import com.shaw.Adapt.AdvancedMediaPlayer.AdvancedMediaPlayer;
import com.shaw.Adapt.AdvancedMediaPlayer.Mp4Player;
import com.shaw.Adapt.AdvancedMediaPlayer.VlcPlayer;

public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        switch(audioType.toLowerCase()){
            case "mp4":
                advancedMediaPlayer = new Mp4Player();
                break;
            case "vlc":
                advancedMediaPlayer = new VlcPlayer();
                break;
            default:
                break;
        }

    }
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }else{
            System.out.println("not Suport");
        }

    }
}
