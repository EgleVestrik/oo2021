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
        ArrayList<String> filewords = new ArrayList<String>();
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<String> letters = new ArrayList<String>();
        try {
            File myFile = new File("Toretext.txt");
            Scanner s = new Scanner(myFile);       
            //panen failid listi
            while (s.hasNext()){
                filewords.add(s.next());
            }
            s.close();
            
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        //eemaldada üleliigsed märgid    
        for (int i = 0; i < filewords.size(); i++) {
            if ((filewords.get(i)).contains(".") ){
                words.add(((filewords.get(i)).replace(".","")).toLowerCase());                
            } else if((filewords.get(i)).contains(",")){
                words.add(((filewords.get(i)).replace(",","")).toLowerCase());
            } else if((filewords.get(i)).contains("-")||(filewords.get(i)).contains("-")){
                
            } else if((filewords.get(i)).contains("!")){
                words.add(((filewords.get(i)).replace("!","")).toLowerCase());
            } else if((filewords.get(i)).contains(")")){
                words.add(((filewords.get(i)).replace(")","")).toLowerCase());
            } else if((filewords.get(i)).contains("(")){
                words.add(((filewords.get(i)).replace("(","")).toLowerCase());
            }else{
                words.add((filewords.get(i)).toLowerCase());
            }
            
        }
        System.out.println(words);
        System.out.println("------");
        //System.out.println(filewords);
        for (int i = 0; i < words.size(); i++) {
            //kui pikk on sõna
            int lCount = (words.get(i)).length();
            //leia viimane täht           
            String lastL = (words.get(i)).substring(lCount-1,lCount);
            letters.add(lastL);
        }
        System.out.println(letters);
        
    }


}
