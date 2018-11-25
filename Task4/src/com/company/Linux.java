package com.company;

public class Linux implements OS {


    @Override
    public void createButton() {
        System.out.println("LinuxButton was created!");

    }

    @Override
    public void createCL() {
        System.out.println("LinuxCommandLine was created!");

    }
}
