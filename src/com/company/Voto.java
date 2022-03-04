package com.company;

public class Voto {
    String materia;
    double voto;

    public Voto(String materia, double voto) {
        this.materia = materia;
        this.voto = voto;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getVoto() {
        return voto;
    }

    public void setVoto(double voto) {
        this.voto = voto;
    }
}

