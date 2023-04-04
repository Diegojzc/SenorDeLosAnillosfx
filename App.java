package com.tokioSchool.senorDeLosAnillos;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {

    private AppView appView;
    private Controlador controlador;
    @Override
    public void init() throws  Exception{
        super.init();
    }
    @Override
    public void start(Stage stage)  {

        appView = new AppView(stage);
        controlador = new Controlador(appView);

    }
    @Override
    public void stop()throws Exception{
        super.stop();
    }
    public static void main(String[]args){
        launch();
    }
}
