import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Sõnade lõputähed

//Salvesta uurimiseks vähemalt paarileheküljeline tekst.
//* Trüki välja sõnade viimased tähed
//* Väljasta erinevad sõnalõputähed nende esinemissageduse järjekorras
//* Iga lõputähega sõnade jaoks on eraldi fail, kuhu need tekstist kirjutatakse. 
//Luuakse HTML-leht viidetega tekstis esinenud lõputähtedega failidele, iga viite juures arv, mitu korda vastava lõputähega sõna esines.

public class Lastletters {
    public static void main(String[] args) {
        readfile();
    }

    public static void readfile(){
        try {
            File myObj = new File("Toretext.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              System.out.println(data);
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
}
