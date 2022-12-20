package com.example.prog2teste1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();*/
    }

    public static void main(String[] args) {
        //launch();
        Scanner in = new Scanner(System.in);
        //teste admin ja por defeito
        /*Utilizador u1 = new Admin("admin", "admin");
        Repositorio r1 = new Repositorio();

        r1.adicionaAdmin(u1);*/

        //realiza login
        Utilizador u1 = new Admin();
        Repositorio r1 = new Repositorio();

        r1.adicionaAdminDaPrimeiraVez();
        //u1.login();
    }
}