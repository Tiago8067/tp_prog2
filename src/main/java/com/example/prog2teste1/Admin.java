package com.example.prog2teste1;

import java.util.Scanner;

public class Admin extends Utilizador{

    public Admin() {
    }

    //para teste de login por defeito
    public Admin(String nomeUtilizadror, String pass){
        this.setUsername(nomeUtilizadror);
        this.setPassword(pass);
    }

    public Admin(String username, String email, String password, String nome, String genero, String dataDeNascimento, String codigoPostal, String morada) {
        super(username, email, password, nome, genero, dataDeNascimento, codigoPostal, morada);
    }

    @Override
    public void login(Utilizador utilizador) {
        String user;
        String pass;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("User: ");
        user=scanner.next();
        System.out.printf("Pass: ");
        pass=scanner.next();

        if (utilizador.getUsername().equals(user) && utilizador.getPassword().equals(pass))
            System.out.println("logado com Sucesso");
        else{
            System.out.println("logado com Insucesso");
        }

    }
}
