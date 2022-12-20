package com.example.prog2teste1;

public class User extends Utilizador{

    public User() {
    }

    public User(String username, String email, String password, String nome, String genero, String dataDeNascimento, String codigoPostal, String morada) {
        super(username, email, password, nome, genero, dataDeNascimento, codigoPostal, morada);
    }

    @Override
    public void login(Utilizador utilizador) {

    }
}
