import java.util.HashMap;

//Ette antud stringist vaja üles lugeda kõikide tähtede esinemine
public class HWChosenAs1 {
    
    public static void main(String[] args) {
        String text="aabbbccccddde";
        loendur(text);
    }

    public static void loendur(String text){
        int countA=0;
        int countB=0;
        int countC=0;
        int countD=0;
        int count=0;
        for (int i = 0;i < text.length(); i++){
                //System.out.println(text.charAt(i));
                //letters.put(i,text.charAt(i));
                if (text.charAt(i)=='a'){
                    countA++;
                }else if(text.charAt(i)=='b'){
                    countB++;
                }else if(text.charAt(i)=='c'){
                    countC++;
                }else if(text.charAt(i)=='d'){
                    countD++;
                }else{
                    count++;
                }
        }
        System.out.println("A " + countA);
        System.out.println("B " + countB);
        System.out.println("C " + countC);
        System.out.println("D " + countD);
        System.out.println("Muid tähti " + count);
    }
}
