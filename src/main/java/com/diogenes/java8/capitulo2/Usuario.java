package com.diogenes.java8.capitulo2;

/**
 * Created by diogenes on 21/06/16.
 */
public class Usuario {

    private String nome;
    private int pontos;
    private boolean moderador;

    public Usuario() {

    }

    public Usuario(String nome, int pontos) {
        this.nome = nome;
        this.pontos = pontos;
    }

    public Usuario(String nome, int pontos, boolean isModerador) {
        this.nome = nome;
        this.pontos = pontos;
        this.moderador = isModerador;
    }

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }

    public void tornaModerador() {
        this.moderador = true;
    }

    public boolean isModerador() {
        return moderador;
    }
}
