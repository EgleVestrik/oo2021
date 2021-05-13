package com.proj;

/**
Joogid

* Koosta Joogipudeli jaoks käsklus, mis leiaks Joogipudeli massi koos Joogiga (juhul kui see olemas), samuti käsklus sellise komplekti omahinna leidmiseks. Koosta tööks 
automaattestid.
* . Koosta käsk etteantud Joogipudeli täitmiseks (juhul kui Jooki jagub). Koosta käsklus kogu Joogivaaditäie 
Joogi villimiseks Joogipudelitesse. Koosta töö kontrolliks automaattestid.
* Koosta Joogipudelite Kasti jaoks klass. Väljadeks kastityyp, kastihind, kastimass ning pesade arv (mitu pudelit mahub). Loo käsklused kasti ja sinna kuuluvate pudelite ühise 
massi ja omahinna arvutamiseks. Loo käsklus Joogivaadist Kasti sisse pudelite villimiseks. Koosta automaattestid.
 */
public class App 
{
    public static void main( String[] args )
    {
        //ma ei oska öelda, palju sprite erikaal võib olla
        Jook sprite= new Jook("Sprite", 1, 2);
        Joogipudel spriteB = new Joogipudel(1, "plastmass", 2, "sprite");
        //joogipudeli mass koos joogiga
        int JPM=spriteB.joogipudelMass(sprite.ekaal);
        System.out.println(JPM);
        //omahind
        int OH=spriteB.omaHind(sprite.lHind, JPM);
        System.out.println(OH);

    }

    //aind testimiseks
    public int joogipudelMass(int jErikaal, int maht){
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
