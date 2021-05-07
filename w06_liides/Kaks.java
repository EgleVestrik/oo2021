public class Kaks implements Kalkulaator {
    public int first_number;

    public Kaks(int first_number){
        this.first_number=first_number;
    }

    @Override
    public int korrutamine(){
        return first_number * 2;
    }

    @Override
    public int jagamine(){
        return first_number / 2;
    }

    @Override
    public int lahutamine(){
        return first_number - 2;
    }

    @Override
    public int liitmine(){
        return first_number + 2;
    }

}
