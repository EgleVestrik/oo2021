import java.util.Scanner;
public class Player {
    public String askName(){
        Scanner name = new Scanner(System.in);
        System.out.println("Sisestage oma nimi");
        String playerName = name.nextLine();
        return playerName;
    }
    //küsib mängija soovitud asukohta
    public String location(){
        Scanner button = new Scanner(System.in);
        String move = button.nextLine();  
        return move;      
    }

    
}
