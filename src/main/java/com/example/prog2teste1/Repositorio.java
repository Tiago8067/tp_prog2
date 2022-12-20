package com.example.prog2teste1;

import java.util.HashMap;
import java.util.Map;

public class Repositorio {
    private Map<Integer, Utilizador> utilizadorMap;

    public Repositorio() {
        this.utilizadorMap = new HashMap<>();
    }

    public void adicionaAdmin(Utilizador utilizador) {
        if (this.utilizadorMap.containsKey(utilizador.getUsername()))
            System.out.println("Duplicado");
        else{
            this.utilizadorMap.put(utilizador.getId(), utilizador);
            System.out.println("Inserido com sucesso");
        }
    }

    public void adicionaAdminDaPrimeiraVez() {
        Utilizador utilizador1 = null;
        utilizador1 = new Admin("admin", "admin");
        Repositorio r1 = new Repositorio();
        r1.utilizadorMap.put(utilizador1.getId(), utilizador1);

        utilizador1.login(utilizador1);
    }
}
