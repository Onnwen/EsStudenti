package com.company;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Studente studente = new Studente("Onnwen", "Cassitto", "4 BIT", new Voto[]{new Voto("Informatica", 9), new Voto("Italiano", 8.5)});
        Studente studenteDeepClone = studente.deepClone();
        Studente studenteShallowClone = studente.shallowClone();

        studente.setVoti(new Voto[]{new Voto("Informatica", 10), new Voto("Italiano", 8.5)});

        System.out.println(studenteDeepClone.getVoto(0).getVoto() + " " + studenteShallowClone.getVoto(0).getVoto() + " " );
    }
}
