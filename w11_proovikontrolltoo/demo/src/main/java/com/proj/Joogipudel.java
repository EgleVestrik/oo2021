package com.proj;

//Koosta klass Joogipudel, millel on maht, pudelityyp, mass ning taara maksumus. Samuti sees olev Jook, 
//mis võib ka puududa.
public class Joogipudel {
    int maht;
    String pudeliTyyp;
    int tMaksumus;
    String jook;


    public Joogipudel(int maht, String pudeliTyyp, int tmaksumus, String jook){
        this.maht=maht;
        this.pudeliTyyp=pudeliTyyp;
        this.tMaksumus=tmaksumus;
        this.jook=jook;
    }


    //Koosta Joogipudeli jaoks käsklus, mis leiaks Joogipudeli massi koos Joogiga
    public int joogipudelMass(int jErikaal){
        //liidan pudeli massi ja joogi massi
        int mass = jErikaal + maht;
        return mass;
    }

    //käsklus sellise komplekti omahinna leidmiseks
    public int omaHind(int lHind, int mass){
        //korrutan kogu pudeli massi liitri hinnaga
        int hind = lHind * mass;
        return hind;
    }
}
