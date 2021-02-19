import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        System.out.println(input());
        System.out.println("\n");      
        //nameTabel
    }
    public static String input(){
        System.out.println("Sisestage oma eesnimi:");
        Scanner obj1 = new Scanner(System.in);
        String firstName = obj1.nextLine();
        System.out.println("Sisestage oma perekonnanimi:");
        Scanner obj2 = new Scanner(System.in);
        String lastName = obj2.nextLine();
        return firstName + " " +lastName;
    }




    public static void nameTabel(){
        System.out.println("Sisesta nimi");
        Scanner obj1 = new Scanner(System.in);
        String firstName = obj1.nextLine();
        System.out.println("\n");






        
        //algab nulliga, kestab kuni number on väikse ja igakord lisab i
        //for(int i = 0; i < greetingArray.length; i++)
        for (int i = 0 ; i < 5;i++){
            System.out.println(firstName);
            for (int j = i; j > 5; j++){
                System.out.println(firstName);
            }
        }
    }
}
