/* Trips-traps-trull

* Joonista sümbolite abil ekraanile trips-traps-trulli ruudustik
* Kasutaja teatab rea ja veeru. Vastavasse kohta märgitakse kordamööda x ja 0
* Kontrollitakse käikude õigsust, teatatakse mängu lõpust. */
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> table = new HashMap<String, String>();
        table.put("9", " ");
        table.put("8", " ");
        table.put("7", " ");
        table.put("6", " ");
        table.put("5", " ");
        table.put("4", " ");
        table.put("3", " ");
        table.put("2", " ");
        table.put("1", " ");
        //mängijate loomine 
        Player player1= new Player();
        Player player2= new Player(); 
        System.out.println("Esimene mängija");
        String name1 = player1.askName();
        System.out.println("Teine mängija");
        String name2 = player2.askName();   
        //laua loomine        
        Board gameBoard= new Board();
        gameBoard.insert(table);
        //loeb mitu korda on mäng käinud
        int count=0;
            
        for (int i=0;count<9;i++){
            System.out.println("Sisestage arv 1-9, et valida nupu asukoht");
            String p = player1.location();
            int intp=Integer.parseInt(p);
                //kontrollib, kas arv sobib
            if (intp<=9&&intp>=1&&table.get(p)==" "){
                //valib nupu
                if (count%2==0){
                    table.put(p, "x");
                    gameBoard.insert(table);
                    //kas mäng on läbi                        
                    if((gameBoard.check(table, name1, name2))=="1"){
                        count = count+1;
                    }
                    else{
                        System.out.println(gameBoard.check(table, name1, name2));
                        break;
                    }
                        
                }else{
                    table.put(p, "0");
                    gameBoard.insert(table);
                    //kas mäng on läbi                        
                    if((gameBoard.check(table, name1, name2))=="1"){
                        count = count+1;
                    }
                    else{
                        System.out.println(gameBoard.check(table, name1, name2));
                        break;
                    }
                }
            } else{
                System.out.println("Valige mingi muu arv, see ei sobi");
                    

            }  
            }
        

        /*
        System.out.println("Sisestage asukoha number 1-9");

        for (int i=0;i<6;i++){
            System.out.println("Esimene mängija");
            //esimene mängija valib koha
            String p1 = player1.location();
            int intp1=Integer.parseInt(p1);
            if (intp1<=9&&intp1>=1&&table.get(p1)==" "){
                table.put(p1, "x");
                gameBoard.insert(table);
                gameBoard.check(table, name1, name2);
                count = count+1; 
            }else {
                System.out.println("Teie number ei sobi, proovige uuesti");
                p1 = player1.location();
                table.put(p1, "x");
                gameBoard.insert(table);
                gameBoard.check(table, name1, name2);
                count = count+1; 
            }
            

            //teine mängija valib koha
            System.out.println("Teine mängija");
            String p2 = player2.location();
            int intp2=Integer.parseInt(p2); 
            if (intp2<=9 && intp2>=1 && table.get(p2)==" "){
                table.put(p2, "0");
                gameBoard.insert(table);
                gameBoard.check(table, name1, name2);
                count = count+1; 
            }else {
                System.out.println("Teie number ei sobi, proovige uuesti");
                p2 = player2.location();
                table.put(p2, "0");
                gameBoard.insert(table);               
                gameBoard.check(table, name1, name2);
                count = count+1; 
            }*/

    }
    

    
}
