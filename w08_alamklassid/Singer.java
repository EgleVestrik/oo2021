public class Singer extends Isik {

    public Singer(String nimi, int pikkus, int kaal, String manager) {
       super(nimi, pikkus, kaal, manager);
    }

    @Override
    public void person(){
        System.out.println("i am a singer");
    }
}