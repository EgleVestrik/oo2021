public class Modell extends Isik {

    public Modell(String nimi, int pikkus, int kaal, String manager) {
       super(nimi, pikkus, kaal, manager);
    }

    @Override
    public void person(){
        System.out.println("i am a model");
    }
}
