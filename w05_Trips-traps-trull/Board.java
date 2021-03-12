import java.util.HashMap;
import javax.print.attribute.standard.PrinterResolution;

//import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;

public class Board {
 
    public void insert(HashMap<String, String> table){
        System.out.println(table.get("1") + "|" + table.get("2") + "|" + table.get("3"));
        System.out.println("-+-+-");
        System.out.println(table.get("4") + "|" + table.get("5") + "|" + table.get("6"));
        System.out.println("-+-+-");
        System.out.println(table.get("7") + "|" + table.get("8") + "|" + table.get("9"));

    }
    public String check(HashMap<String, String> table,String p1, String p2){
        String s1="Mängija "+ p1+ " on võitnud";
        String s2="Mängija "+ p2+ " on võitnud";
        //ülemine rida
        if (table.get("1")=="x" && table.get("2")=="x"&&table.get("3")=="x"){
            return s1;            
        } else if(table.get("1")=="0" && table.get("2")=="0"&&table.get("3")=="0"){
            return s2;
        }//keskmine rida
        else if(table.get("4")=="x" && table.get("5")=="x"&&table.get("6")=="x"){
            return s1; 
        } else if(table.get("4")=="0" && table.get("5")=="0"&&table.get("6")=="0"){
            return s2;
        }//alumine rida
        else if(table.get("7")=="x" && table.get("8")=="x"&&table.get("9")=="x"){
            return s1; 
        } else if(table.get("7")=="0" && table.get("8")=="0"&&table.get("9")=="0"){
            return s2;
        }//esimene ülevalt alla
        else if(table.get("1")=="x" && table.get("4")=="x"&&table.get("7")=="x"){
            return s1; 
        } else if(table.get("1")=="0" && table.get("4")=="0"&&table.get("7")=="0"){
            return s2;
        }//teine ülevalt alla
        else if(table.get("2")=="x" && table.get("5")=="x"&&table.get("8")=="x"){
            return s1; 
        } else if(table.get("2")=="0" && table.get("5")=="0"&&table.get("8")=="0"){
            return s2;
        }//kolmas ülevalt alla
        else if(table.get("3")=="x" && table.get("6")=="x"&&table.get("9")=="x"){
            return s1; 
        } else if(table.get("3")=="0" && table.get("6")=="0"&&table.get("9")=="0"){
            return s2;
        }//esimene diagonaal
        else if(table.get("1")=="x" && table.get("5")=="x"&&table.get("9")=="x"){
            return s1; 
        } else if(table.get("1")=="0" && table.get("5")=="0"&&table.get("9")=="0"){
            return s2;
        }//teine diagonaal
        else if(table.get("3")=="x" && table.get("5")=="x"&&table.get("7")=="x"){
            return s1; 
        } else if(table.get("3")=="0" && table.get("5")=="0"&&table.get("7")=="0"){
            return s2;
        }else if(table.get("1")!=" " &&table.get("2")!=" " &&table.get("3")!=" " &&table.get("4")!=" " &&table.get("5")!=" " &&table.get("6")!=" " &&table.get("7")!=" " &&table.get("8")!=" " &&table.get("9")!=" "){
            return "Võitu ei saavutatud";
        }else {
            return "1";
        }
    }


    
    
    

}
