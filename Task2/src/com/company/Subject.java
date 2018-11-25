package com.company;


public interface Subject {
    void registerObserver(Observer var1);

    void removeObserver(Observer var1);

    void notifyObservers();
}
