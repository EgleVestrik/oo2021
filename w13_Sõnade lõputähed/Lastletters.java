import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
            File myFile = new File("Toretext.txt");
            Scanner s = new Scanner(myFile);
            ArrayList<String> filewords = new ArrayList<String>();
            //panen failid listi
            while (s.hasNext()){
                filewords.add(s.next());
            }
            //eemaldan 
            for (int i = 0; i < filewords.size(); i++) {
                if (filewords.get(i)=="–"){
                    filewords.remove(i);
                }
            }
            System.out.println(filewords);


            s.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        
    }

    public static void lastLetter(String word){

    }
}
