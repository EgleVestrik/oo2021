import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

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

        HashMap<String, Integer> count = new HashMap<String, Integer>();
        count.put("a", 1);
        count.put("b", 2);
        //count.keySet().toArray()[1];
        //System.out.println(count.keySet([1]));

        readTest();


    }

    public static void readTest(){
        String[] list = {"a", "b"};
        for (int j = 0; j < list.length; j++){
            try {
                //kirjuta faili a
                FileWriter myWriter = new FileWriter(list[j]+".txt");
                for (int i = 0; i < list.length; i++){
                    myWriter.write(list[i]);
                }               
                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
}
