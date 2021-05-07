public abstract class Parent{
    public String name;
    public String dream;
    public int age;


    public Parent(String name, String dream, int age){
        this.name=name;
        this.dream=dream;
        this.age=age;
    }

    public void favouritHobbyIs(String hobby){
        System.out.println(this.name + "'s favourit hobby is "+ hobby);
    }

    public void firstThingIDO(){
        System.out.println("I Brush my teeth");
    }

    public abstract void howISpendMyEvening();
}