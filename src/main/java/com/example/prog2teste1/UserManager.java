package com.example.prog2teste1;

public class UserManager extends Utilizador{

    public UserManager() {
    }

    public UserManager(String username, String email, String password, String nome, String genero, String dataDeNascimento, String codigoPostal, String morada) {
        super(username, email, password, nome, genero, dataDeNascimento, codigoPostal, morada);
    }
}
