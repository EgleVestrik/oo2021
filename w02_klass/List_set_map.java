/* 1) Tutvuda näiteks Listidest (ArrayList, LinkedList, Vector), Set (HashSet, TreeSet), Map (HashMap, TreeMap).
2) Valida vähemalt üks listist, üks setist ja üks mapist omal valikul ja teha läbi nendega erinevaid protseduure ehk proovida lisada/kustutada ja vaadata, mis muid funktsioone/meetodeid nendega kasutada saab
3) Luua 1 või rohkem reaalelulist näidet nii listi, seti kui ka mapi kohta
4) Miks erinevad üldse olemas? Mis on nende vahe? */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class List_set_map {
    public static void main(String[] args) {
        arrayList();
        hashSet();
        hashMap();

        //arrayList array = new arrayList();
        //System.out.println(array());
    }
    public static void arrayList(){        
        ArrayList<String> food = new ArrayList<String>();
        food.add("Bread");
        food.add("Carrot");
        food.add("Potatoe");
        food.add("Salat");
        System.out.println(food);

        System.out.println(food.get(2) + " is 3rd item in list");

        food.set(2, "Milk");
        System.out.println(food.get(2) + " is 3rd item in list");
        //food.remove(0); --eemaldab elemendi indexil 
        //food.clear();   --tühjendab kõik
        //food.size();    --küsib listi suuruse
        /*    for (int i = 0; i < food.size(); i++) {
                System.out.println(food.get(i));
             } 
             -- loop list
             */
    }
    public static void hashSet(){
        HashSet<String> food = new HashSet<String>();
        food.add("Bread");
        food.add("Carrot");
        food.add("Potatoe");
        food.add("Fish");
        food.add("Salat");
        System.out.println(food);

        //food.contain("Bread"); --kontrollib, kas element asub setis
        //food.remove("Bread");  --eemaldab elemendi
        //food.clear();          --tühjendab kõik
        //food.size();           --küsib seti suuruse
        /*for (String i : cars) {
             System.out.println(i);
        }  --loop set*/
    }
    public static void hashMap(){
        HashMap<String, String> Estonia = new HashMap<String, String>();

        Estonia.put("Harjumaa", "Tallinn");
        Estonia.put("Järvamaa", "Paide");
        Estonia.put("Jõgevamaa", "Jõgeva");
        Estonia.put("Viljandimaa", "Viljandi");
        System.out.println(Estonia);

        System.out.println(Estonia.get("Harjumaa"));
        //Estonia.remove("Harjumaa"); --eemaldab elemedi
        //Estonia.clear();           --tühjendab kõik
        //Estonia.size();            --loeb mapi suuruse
        /* for (String i : Estonia.keySet()) {
             System.out.println(i);
            }    --loop*/

    }

}
