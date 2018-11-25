package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;





public class Composite implements Sound  {
    int cycleCount=1;

    ArrayList<Sound> sounds = new ArrayList<>();

    public void add(Sound...  s) {
        sounds.addAll(Arrays.asList(s));
    }
    public void remove(Sound... s) {
        sounds.removeAll(Arrays.asList(s));
    }

    @Override
    public void play(){
        for (int i=0;i<cycleCount;i++){
            for (Sound s:sounds){

                s.play();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Composite.class.getName()).log(Level.SEVERE, null, ex);
                }



            }
        }

    }


    @Override
    public void setVolume(double volume){
        sounds.forEach((sound) -> {
            sound.setVolume(volume);
        });

    }

    @Override
    public void setRate(double rate){
        sounds.forEach((sound) -> {
            sound.setRate(rate);
        });
    }

    @Override
    public void setCycleCount(int count){
        cycleCount=count;

    }
}
