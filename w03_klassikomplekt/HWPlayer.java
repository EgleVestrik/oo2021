import java.util.ArrayList;

public class HWPlayer {
    public String name;
    public String job;
    public int point=0;
    private ArrayList<HWGift> gifts = new ArrayList<>();

    public HWPlayer(String name, String job){
        this.name=name;
        this.job=job;
    }

    public void addGifts(HWGift name){
        gifts.add(name);
    }

    public void removeGift(HWGift name){
        gifts.remove(name);
    }

    public void allGifts(){
        for (HWGift hwGift:gifts){
            System.out.println(hwGift.name);
        }    
    }
    public void points(){
        point=point+1;
    }


}
