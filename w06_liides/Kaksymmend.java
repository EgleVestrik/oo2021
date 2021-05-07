public class Kaksymmend implements Kalkulaator {
    public int first_number;

    public Kaksymmend(int first_number){
        this.first_number=first_number;
    }

    @Override
    public int korrutamine(){
        return first_number * 20;
    }

    @Override
    public int jagamine(){
        return first_number / 20;
    }

    @Override
    public int lahutamine(){
        return first_number - 20;
    }

    @Override
    public int liitmine(){
        return first_number + 20;
    }

}

