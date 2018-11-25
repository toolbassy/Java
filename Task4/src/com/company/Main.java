package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String osName = System.getProperty("os.name").toLowerCase();


        if (osName.contains("windows")) {
            OS os = new Windows();
            os.createButton();
            os.createCL();

        }
        else if (osName.contains("mac")){
            OS os = new Mac();
            os.createButton();
            os.createCL();

        }
        else if (osName.contains("linux")){
            OS os = new Linux();
            os.createButton();
            os.createCL();


        }

    }
}
