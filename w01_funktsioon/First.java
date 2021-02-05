import java.text.StringCharacterIterator;

import javax.lang.model.util.ElementScanner6;

public class First{
    public static void main(String[] args){
        //System.out.println(args.length);
        int[] numberArray=new int[5];

        String[] stringArray=new String[5];
        String[] greetingArray = new String[]{"hello", "world","!"}; //algväärtustamine

        String name = "Raimo";
        int year = 2021;

        int myInt = Integer.MAX_VALUE;
        long myLong =Long.MAX_VALUE;
        byte bait = Byte.MAX_VALUE; //-128 kuni 127
        short myShort = Short.MAX_VALUE;
        double doubleNumber = 3.4;
        float floatNumber = 3.4f;
        boolean flag = true; //false
        char character = 'F';

        //algus, kestus, mis teeb iga ring
        //algab nulliga, kestab kuni number on väikse ja igakord lisab i
        for(int i = 0; i < greetingArray.length; i++){
            System.out.println(greetingArray[i]);
        }

        //foreach
        for(String text : greetingArray){
            System.out.println(text);
        }

        //while
        int lenght = greetingArray.length;
        while (lenght > 0 ){
            lenght--;
            System.out.println("Inside while");
        }

        if (year == 2021){
            System.out.println(year+" is equal to 2021");
        }else if (year >2021){
            System.out.println(year+" is larger than 2021");
        }else {
            System.out.println(year);
        }

        System.out.println("hello World");
        System.out.println("test one");
        System.out.println("Test two");
        System.out.println("\n");

        String hello = "hello world";
        System.out.println(hello);
    }
}

