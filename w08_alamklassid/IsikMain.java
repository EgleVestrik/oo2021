public class IsikMain {
    public static void main(String[] args) {
        Modell model = new Modell("Mari maasikas", 175, 60, "Toomas Leevike");
        Singer singer = new Singer("Meri Merike", 160, 70, "Toomas Leevike");
        System.out.println(model.nimi + " says:");
        model.person();
        System.out.println(singer.nimi + " says:");
        singer.person();

    }
}
