public class HMMain {
    public static void main(String[] args) {
        
        Kaks two = new Kaks(50);
        System.out.println(two.lahutamine()+ " "+
        two.liitmine()+" "+
        two.korrutamine()+" "+
        two.jagamine());
        
        Kaksymmend twenty = new Kaksymmend(50);
        System.out.println(twenty.lahutamine()+" "+
        twenty.liitmine()+" "+
        twenty.korrutamine()+" "+
        twenty.jagamine());
        
    }
}
