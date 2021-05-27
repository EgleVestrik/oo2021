import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//kuvada kõik nädalapäevad
//lisada päevaseid tegevusi
//kuvada päevaplaani , seda muuta ja kustutada


public class Main {
    public static void main(String[] args) {
        program();

    }

    public static void program(){
        //int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        //nimetus, aelgus kellaaeg, lõpp kellaaeg, nädalapäev, ruum
        ArrayList<String> nimetusA = new ArrayList<String>();
        ArrayList<Integer> algusAegA = new ArrayList<Integer>();
        ArrayList<String> loppAegA = new ArrayList<String>();
        ArrayList<String> nadalaPA = new ArrayList<String>();
        ArrayList<String> ruumA = new ArrayList<String>();

        HashMap<Integer, String> esmasP = new HashMap<Integer, String>();
        HashMap<Integer, String> teisiP = new HashMap<Integer, String>();
        HashMap<Integer, String> kolmaP = new HashMap<Integer, String>();
        HashMap<Integer, String> neljaP = new HashMap<Integer, String>();
        HashMap<Integer, String> reede = new HashMap<Integer, String>();
        HashMap<Integer, String> lauP = new HashMap<Integer, String>();
        HashMap<Integer, String> puhaP = new HashMap<Integer, String>();

        //kuvatakse päevaplaan
        paevakava(esmasP, teisiP, kolmaP, neljaP, reede, lauP, puhaP);

        System.out.println("Uue tegevuse lisamiseks kirjutage : uus");
        Scanner uusTegevusS = new Scanner(System.in);  // Create a Scanner object
        String uusTegevus = uusTegevusS.nextLine();
        String more="veel";
        while (more.equals("veel")){
            if (uusTegevus.equals("uus")){
                sisestab(nimetusA, algusAegA, loppAegA, nadalaPA, ruumA);

                System.out.println("Kas on veel tegevusi lisada (Y/N)");
                Scanner tegevusS = new Scanner(System.in);  // Create a Scanner object
                String tegevus = tegevusS.nextLine();
                if (!tegevus.equals("Y")){
                    more="Y";
                }
            }
        }

        for (int i = 0; i < nimetusA.size(); i++){
            if (nadalaPA.get(i).equals("E")){
                esmasP.put(algusAegA.get(i),nimetusA.get(i));
            }
            else if(nadalaPA.get(i).equals("T")){
                teisiP.put(algusAegA.get(i),nimetusA.get(i));
            }
            else if(nadalaPA.get(i).equals("K")){
                kolmaP.put(algusAegA.get(i),nimetusA.get(i));
            }
            else if(nadalaPA.get(i).equals("N")){
                neljaP.put(algusAegA.get(i),nimetusA.get(i));
            }
            else if(nadalaPA.get(i).equals("R")){
                reede.put(algusAegA.get(i),nimetusA.get(i));
            }
            else if(nadalaPA.get(i).equals("L")){
                puhaP.put(algusAegA.get(i),nimetusA.get(i));
            }
            else if(nadalaPA.get(i).equals("P")){
                lauP.put(algusAegA.get(i),nimetusA.get(i));
            }
        }

        paevakava(esmasP, teisiP, kolmaP, neljaP, reede, lauP, puhaP);
        
        
        try {
            File myFile = new File("plaan"+".txt");
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        

        try {
            FileWriter myWriter = new FileWriter("plaan"+".txt");
            
                    
                myWriter.write("Esmaspäev"+esmasP+"\n");
                myWriter.write("Teisipäev"+teisiP+"\n");
                myWriter.write("Kolmapäev"+kolmaP+"\n");
                myWriter.write("Neljapäev"+neljaP+"\n");
                myWriter.write("Reede"+reede+"\n");
                myWriter.write("Laupäev"+lauP+"\n");
                myWriter.write("Pühapäev"+lauP+"\n");
                   
            
            //myWriter.write(count.get(alphabeth[i]));                      
            myWriter.close();  
            
           // myWriter.write("Files in Java might be tricky, but it is fun enough!");                   
            System.out.println("Successful");
          } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
          }        
    }

    public static void kustutamine(){

    }

    public static void vaatamine(){

    }


    public static void sisestab( ArrayList<String> nimetusA,  ArrayList<Integer> algusAegA,  ArrayList<String> loppAegA,  ArrayList<String> nadalaPA,  ArrayList<String> ruumA){
       
        
        Scanner nimetusS = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Nimetus");
        String nimetus = nimetusS.nextLine();  // Read user input
        nimetusA.add(nimetus);

        Scanner algusAegS = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Algus aeg");
        String algusAeg = algusAegS.nextLine();  // Read user input
        int aeg=Integer.parseInt(algusAeg);
        algusAegA.add(aeg);

        Scanner loppAegS = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Lõpp aeg");
        String loppAeg = loppAegS.nextLine();  // Read user input
        loppAegA.add(loppAeg);

        String yes="Y";
        String nadalaP="Test";
        while (yes.equals("Y")){
            Scanner nadalaPS = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Nädalapäeva (Kasutage lühendit E,T,K,N,R,L,P)");
            nadalaP = nadalaPS.nextLine();  // Read user input
            if (nadalaP.length()==1){               
                yes="ei";
                nadalaPA.add(nadalaP);
                
            }else{
                System.out.println("Palun kasutage lühendeid E,T,K,N,R,L,P");
                yes="Y";
            }              
        }
        Scanner ruumS = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Ruum");
        String ruum = ruumS.nextLine();  // Read user input
        ruumA.add(ruum);         

        
    }
    public static void paevakava(HashMap<Integer, String> esmasP, HashMap<Integer, String> teisiP,HashMap<Integer, String> kolmaP,HashMap<Integer, String> neljaP, HashMap<Integer, String> reede, HashMap<Integer, String> lauP, HashMap<Integer, String> puhaP){
        System.out.println("Esmaspäev");
        System.out.println(esmasP);
        System.out.println("Teisipäev");
        System.out.println(teisiP);
        System.out.println("Kolmapäev");
        System.out.println(kolmaP);
        System.out.println("Neljapäev");
        System.out.println(neljaP);
        System.out.println("Reede");
        System.out.println(reede);
        System.out.println("Lauppäev");
        System.out.println(lauP);
        System.out.println("Pühapäev");
        System.out.println(puhaP);
    }

}