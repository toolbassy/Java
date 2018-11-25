package com.company;

public class Mac implements OS {
    @Override
    public void createButton() {
        System.out.println("MacButton was created!");

    }

    @Override
    public void createCL() {
        System.out.println("MacCommandLine was created!");

    }
}
