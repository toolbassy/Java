package com.company;


import javafx.application.Application;




import javafx.stage.Stage;


public class Test extends Application {

    @Override
    public void start(Stage primaryStage) throws InterruptedException {
        Composite c = new Composite();

        Note Do = new Note("do.wav");
        Note Re = new Note("C:\\Users\\user\\IdeaProjects\\MusicApp\\re.wav");
        Note Mi = new Note("C:\\Users\\user\\IdeaProjects\\MusicApp\\mi.wav");
        Note Fa = new Note("C:\\Users\\user\\IdeaProjects\\MusicApp\\fa.wav");
        Note Sol = new Note("C:\\Users\\user\\IdeaProjects\\MusicApp\\sol.wav");
        Note La = new Note("C:\\Users\\user\\IdeaProjects\\MusicApp\\la.wav");
        Note Si = new Note("C:\\Users\\user\\IdeaProjects\\MusicApp\\si.wav");


        c.add(Mi);
        c.add(Mi);
        c.add(Mi);
        c.add(Mi);
        c.add(Mi);
        c.add(Mi);

        c.add(Mi);
        c.add(Sol);
        c.add(Do);
        c.add(Re);
        c.add(Mi);

        c.add(Fa);
        c.add(Fa);
        c.add(Fa);
        c.add(Fa);

        c.add(Mi);
        c.add(Mi);
        c.add(Mi);
        c.add(Mi);



        c.add(Re);
        c.add(Re);
        c.add(Mi);
        c.add(Re);
        c.add(Sol);



        c.add(Mi);
        c.add(Mi);
        c.add(Mi);
        c.add(Mi);
        c.add(Mi);
        c.add(Mi);

        c.add(Mi);
        c.add(Sol);
        c.add(Do);
        c.add(Re);
        c.add(Mi);

        c.add(Fa);
        c.add(Fa);
        c.add(Fa);
        c.add(Fa);

        c.add(Mi);
        c.add(Mi);
        c.add(Mi);
        c.add(Mi);



        c.add(Sol);
        c.add(Sol);
        c.add(Fa);
        c.add(Re);





        Composite c2 = new Composite();
        c2.add(c, Do);
        c2.play();
    }


    public static void main(String[] args) {
        launch(args);
    }

}

