import java.util.Scanner;

public class HouseMain {
    public static void main(String[] args) {   
    
        House building1 = new House("Tallinn", 12, 3);
        System.out.println("House on the " +
            building1.streetName + " street is " + building1.getColor()
        );

        House building2 = new House("Paapli", 300, 9);
        building2.setColor("yellow");
        System.out.println("House on the " +
        building2.streetName + " street is " + building2.getColor()
        );

        Scanner myobj1 = new Scanner(System.in);  
        System.out.println("Enter street name");
        String myStreetName = myobj1.nextLine();  

        Scanner myobj2 = new Scanner(System.in);  
        System.out.println("Enter street number");
        String myStreetNumber = myobj2.nextLine(); 
        int myStreetNr = Integer.parseInt(myStreetNumber);

        Scanner myobj3 = new Scanner(System.in);  
        System.out.println("Enter apartment number");
        String myApartmentNumber = myobj3.nextLine(); 
        int myApartmentNr = Integer.parseInt(myApartmentNumber);

        House building3 = new House(myStreetName, myStreetNr, myApartmentNr); 
        //System.out.println("Your address is "+myStreetName+" "+myStreetNr+"-"+myApartmentNr+".");
        System.out.println("Your address is "+building3.streetName+" "+building3.streetnr+"-"+building3.apartmentNr+".");
    }
}
