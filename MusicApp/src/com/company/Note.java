package com.company;

import java.io.File;
import javafx.scene.media.AudioClip;


public class Note implements Sound  {

    AudioClip ac;


    public Note(String path){
        ac = new AudioClip(new File(path).toURI().toString());


    }

    @Override
    public void setVolume(double volume){
        ac.setVolume(volume);
    }

    @Override
    public void setCycleCount(int count){
        ac.setCycleCount(count);
    }

    @Override
    public void setRate(double rate){
        ac.setRate(rate);
    }

    @Override
    public void play(){
        ac.play();
    }

}
