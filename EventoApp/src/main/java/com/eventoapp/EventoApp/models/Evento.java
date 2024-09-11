package com.eventoapp.EventoApp.models;

public class Evento {

    private String nome;
    private String local;
    private String data;
    private String horario;


    public String nome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String local() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String data() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String horario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
