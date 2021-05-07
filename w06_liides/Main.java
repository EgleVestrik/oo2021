

public class Main {
    public static void main(String[] args) {
      EstonianID est = new EstonianID("49610176516");
      System.out.println(est.getGender());
      System.out.println(est.getFullYear());
      System.out.println(est.getDOB());
      System.out.println(est.getAge());

      //koer ja jänes
      Dog doggy = new Dog("Tuki", 8);
      Rabbit bunny = new Rabbit("Rob", 8, "hall");
      
      System.out.println("There once was a rabbit and a dog. On a lowely day they were both having a breakfast.");

      doggy.eat();
      bunny.eat();
      System.out.println("When the night came they went to sleep.");
      doggy.sleep();
      bunny.sleep();
      System.out.println("THE END");
    }
  }