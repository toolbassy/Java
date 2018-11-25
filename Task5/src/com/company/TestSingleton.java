package com.company;

public class TestSingleton extends Thread {
    public static void main(String args[]) {

        LoggerSingleton logger1 = LoggerSingleton.getInstance();
        LoggerSingleton logger2 = LoggerSingleton.getInstance();
        LoggerSingleton logger3 = LoggerSingleton.getInstance();

        Thread th1 = new Thread() {
            @Override
            public void run() {
                logger1.logError("11111", "HIGH");
                logger1.logConnection("100.10.0.82", "18:12");
                logger1.logChange("Folder bin", "00:42");
                System.out.println(1);
            }
        };
        th1.start();

        Thread th2 = new Thread() {
            @Override
            public void run() {
                logger2.logError("11251", "LOW");
                logger2.logConnection("122.10.0.7", "11:36");
                System.out.println(2);
            }
        };
        th2.start();

        Thread th3 = new Thread() {
            @Override
            public void run() {
                logger3.logConnection("28.100.0.19", "06:37");
                logger3.logChange("File exam.txt", "07:44");
                System.out.println(3);
            }
        };
        th3.start();
    }
}
