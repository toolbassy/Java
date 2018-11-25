package com.company;

public class Windows implements OS {


    @Override
    public void createButton() {

        System.out.println("WindowsButton was created!");
    }

    @Override
    public void createCL() {

        System.out.println("WindowsCommandLine was created!");

    }
}
