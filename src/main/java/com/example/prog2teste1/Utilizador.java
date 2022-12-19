package com.example.prog2teste1;

public class Utilizador {
    private  String username;
    private  String email;
    private  String password;
    private  String nome;
    private  String genero;
    private  String dataDeNascimento;
    private  String codigoPostal;
    private  String morada;

    public Utilizador() {
    }

    public Utilizador(String username, String email, String password, String nome, String genero, String dataDeNascimento, String codigoPostal, String morada) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.nome = nome;
        this.genero = genero;
        this.dataDeNascimento = dataDeNascimento;
        this.codigoPostal = codigoPostal;
        this.morada = morada;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }
}
