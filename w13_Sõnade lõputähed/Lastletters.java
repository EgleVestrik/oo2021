import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.HashMap;
import java.util.*;

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
        String[] alphabeth = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "z", "t", "u", "v", "w", "õ", "ä", "ö", "ü", "x", "y"}; 
        HashMap<String, Integer> count = new HashMap<String, Integer>();
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
            } else if((filewords.get(i)).contains("-")){
                
            } else if((filewords.get(i)).contains("!")){
                words.add(((filewords.get(i)).replace("!","")).toLowerCase());
            } else if((filewords.get(i)).contains(")")){
                words.add(((filewords.get(i)).replace(")","")).toLowerCase());                
            } else if((filewords.get(i)).contains("(")){
                words.add(((filewords.get(i)).replace("(","")).toLowerCase());
            } else if((filewords.get(i)).contains(":")){
                words.add(((filewords.get(i)).replace(":","")).toLowerCase());
            }else{
                words.add((filewords.get(i)).toLowerCase());
            }
            
        }
        System.out.println(words);
        System.out.println("------");
        //System.out.println(filewords);
        //leiab viimase sõna ja paneb listi
        for (int i = 0; i < words.size(); i++) {
            //kui pikk on sõna
            int lCount = (words.get(i)).length();
            //leia viimane täht           
            String lastL = (words.get(i)).substring(lCount-1,lCount);
            letters.add(lastL);
        }
        
        //loeb kokku elemendid ja paneb uude hasmapi
        System.out.println(letters);
        for (int i = 0; i < letters.size(); i++) {            
            if (count.containsKey(letters.get(i))){
                int many= count.get(letters.get(i));
                count.put(letters.get(i), many+1);
            }else{
                count.put(letters.get(i), 1);
            }
            
        }
        System.out.println(count);

        //panen järjekorda        
        Object[] a = count.entrySet().toArray();
        Arrays.sort(a, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Map.Entry<String, Integer>) o2).getValue()
                        .compareTo(((Map.Entry<String, Integer>) o1).getValue());
            }
        });
        for (Object e : a) {
            System.out.println(((Map.Entry<String, Integer>) e).getKey() + " : "
                    + ((Map.Entry<String, Integer>) e).getValue());
        }

        for (int i = 0; i < alphabeth.length; i++){
            //kontrolling, et antud tähes on sõnu
            if (count.containsKey(alphabeth[i])){
                //loob uue faili
                try {
                    File myFile = new File(alphabeth[i]+".txt");
                    if (myFile.createNewFile()) {
                    System.out.println("File created: " + myFile.getName());
                    } else {
                    System.out.println("File already exists.");
                    }
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
                //kirjutab faili sisse
                try {
                    FileWriter myWriter = new FileWriter(alphabeth[i]+".txt");
                    for (int j = 0; j < words.size(); j++) {
                        //kui pikk on sõna
                        int lCount = (words.get(j)).length();
                        //leia viimane täht           
                        String lastL = (words.get(j)).substring(lCount-1,lCount);
                        if (lastL.equals(alphabeth[i])){
                            
                            myWriter.write(words.get(j)+"\n");
                        }
                        
                    }
                    //myWriter.write(count.get(alphabeth[i]));                      
                    myWriter.close();  
                    
                   // myWriter.write("Files in Java might be tricky, but it is fun enough!");                   
                    System.out.println("Successfully wrote "+alphabeth[i]+" to the file!");
                  } catch (IOException e) {
                    System.out.println("An error occurred on : "+alphabeth[i]);
                    e.printStackTrace();
                  }
            }
        }
        
    }


}
