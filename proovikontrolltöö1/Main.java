import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        /*HashMap<Integer, Integer> arvud = new HashMap<Integer, Integer>();
        arvud.put(1, 12);
        arvud.put(2, 13);
        arvud.put(3, 12);
        arvud.put(4, 11);*/

        ArrayList<Integer> arvud = new  ArrayList<Integer>();
        arvud.add(12);
        arvud.add(78);
        arvud.add(13);
        arvud.add(18);
        arvud.add(40);
        arvud.add(30);
        System.out.println(aKeskmine(50, 20, 9));
        System.out.println(lKeskmine(arvud));
        

    }

    public static Integer aKeskmine(int a, int b, int c){
        int keskmine= (a + b + c) /3;
        return keskmine;
    }

    public static ArrayList<Integer> lKeskmine (ArrayList<Integer>input){
        ArrayList<Integer> output = new ArrayList<Integer>();

        for (int i = 0; i+2 < input.size(); i++){
            int a=aKeskmine(input.get(i), input.get(i+1), input.get(i+2));
            output.add(a);   
              
        } 

        return output;
    }
}

