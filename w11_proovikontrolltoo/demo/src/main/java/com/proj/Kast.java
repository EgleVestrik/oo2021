package com.proj;

//Koosta Joogipudelite Kasti jaoks klass. Väljadeks kastityyp, kastihind, kastimass ning pesade arv (mitu pudelit mahub)
public class Kast {
    String kastityyp;
    int kastihind;
    int kastimass;
    int pesad;

    public Kast(String kastityyp,  int kastihind, int kastimass, int pesad){
        this.kastityyp=kastityyp;
        this.kastihind=kastihind;
        this.kastimass=kastimass;
        this.pesad=pesad;
    }
}
