import java.util.Random;

public class HWMain {
    public static void main(String[] args) {
        HWPlayer player1= new HWPlayer("Toomas", "mängija");
        HWPlayer player2= new HWPlayer("Teele", "admin");

        HWGift gift0=new HWGift("10 eur");
        HWGift gift1=new HWGift("kinkekaart");
        HWGift gift2=new HWGift("kaisukaru");



        Random rand =new Random();      
        int count=0;
        for (int i=0;i<3;i++){
            int p1nr = rand.nextInt(100);
            int p2nr = rand.nextInt(100);
            if (p1nr<p2nr){
                if (count==0){
                    player1.addGifts(gift0); 
                    player1.points();  
                    count++;
                }else if(count==1){
                    player1.addGifts(gift1); 
                    player1.points();  
                    count++;
                }else if(count==2){
                    player1.addGifts(gift2);
                    player1.points();
                    count++;
                }
            }else{
                if (count==0){
                    player2.addGifts(gift0); 
                    player2.points();  
                    count++;
                }else if(count==1){
                    player2.addGifts(gift1); 
                    player2.points();  
                    count++;
                }else if(count==2){
                    player2.addGifts(gift2);
                    player2.points();
                    count++;
                }

            }
        }
        System.out.println("1. player võitis: ");
        player1.allGifts();
        System.out.println("2. player võitis: ");
        player2.allGifts();
        System.out.println("1. mängija punktid "+player1.point);
        System.out.println("2. mängija punktid "+player2.point);
        
        //teine peab ka auhindu saama
        if (player1.point==3){
            System.out.println("VÕRDSUSTAMINE");
            player1.removeGift(gift2);
            player2.addGifts(gift2);
            System.out.println("1. player võitis: ");
            player1.allGifts();
            System.out.println("2. player võitis: ");
            player2.allGifts();
            System.out.println("1. mängija punktid "+player1.point);
            System.out.println("2. mängija punktid "+player2.point);
        }else if(player2.point==3){
            System.out.println("VÕRDSUSTAMINE");
            player2.removeGift(gift2);
            player1.addGifts(gift2);
            System.out.println("1. player võitis: ");
            player1.allGifts();
            System.out.println("2. player võitis: ");
            player2.allGifts();
            System.out.println("1. mängija punktid "+player1.point);
            System.out.println("2. mängija punktid "+player2.point);
        }
        else{
            System.out.println("Aitäh mängimast!");
        }
        

    }
}
