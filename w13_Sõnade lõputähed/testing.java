public class testing {
    public static void main(String[] args) {
        String s = "testimise testimiseks, testime testi)";
        if (s.contains(",")){
            String a = s.replace(",", "");
            System.out.println(a);
        }else if(s.contains(")")){
            String t = s.replace(")", "");
            System.out.println(t);
        }
    }
}
