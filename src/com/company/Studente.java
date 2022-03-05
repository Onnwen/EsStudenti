package com.company;

public class Studente extends Persona implements Cloneable {
    private String classe;
    private Voto[] voti;
    private int votiTotali;

    public Studente(String nome, String cognome, String classe, Voto[] voti) {
        super(nome, cognome);
        this.classe = classe;
        this.voti = voti;
        this.votiTotali = voti.length;
    }

    public Studente(String nome, String cognome, String classe) {
        super(nome, cognome);
        this.classe = classe;
        this.voti = new Voto[2];
        this.votiTotali = 0;
    }

    public Studente(Studente studente) {
        super(studente.getNome(), studente.getCognome());
        this.classe = studente.getClasse();
        this.voti = studente.getVoti();
        this.votiTotali = studente.getVoti().length;
    }

    public void setVoti(Voto[] voti) {
        this.voti = voti;
        this.votiTotali = voti.length;
    }

    public Studente deepClone() {
        return new Studente(this);
    }

    public Studente shallowClone() throws CloneNotSupportedException {
        return (Studente) this.clone();
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Voto[] getVoti() {
        return voti;
    }

    public Voto getVoto(int index) {
        return voti[index];
    }

    public void addVoto(Voto voto) {
        voti[votiTotali] = voto;
        votiTotali++;
    }

}
