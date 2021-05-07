public class Child extends Parent {
    public Child(String name, String dream, int age){
        super(name, dream, age);
    }

    @Override
    public void firstThingIDO(){
        super.firstThingIDO();
        System.out.println("I get up to the  mischief");
    }

    @Override
    public void howISpendMyEvening() {
        System.out.println("I run around");
        
    }
}
