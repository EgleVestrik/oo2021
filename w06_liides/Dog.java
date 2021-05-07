

public class Dog implements Animal{
    public String name;
    public int age;

    //speak, eat, sleep, beSneaky, lookAround, attack, defend

    public Dog(String name, int age){
        this.name = name;
        this.age=age;
    }

    @Override 
    public void speak(){
        System.out.println(name+" says: woof");
    }

    @Override 
    public void eat(){
        if (age >= 10){
            System.out.println(age +" year old " + name + " eats slowly");
        }else{
            System.out.println(age +" year old " + name + " eats fast");
        }
    }

    @Override 
    public void sleep(){
        if (age >= 10){
            System.out.println(age+" year old " + name + " enjoys a lot of sleep");
        }else{
            System.out.println(age+" year old " + name + " doesn't like long sleeps");
        }
    }

    @Override 
    public void beSneaky(){
        System.out.println(name + " goes low and moves slowly");
    }

    @Override 
    public void lookAround(){
        if (age >= 10){
            System.out.println(name + " is old and slowly turns head");
        }else{
            System.out.println(name+ " turns head fast");
        }
    }

    @Override 
    public void attack(){
        if (age >= 10){
            System.out.println(name + " is too old to attack");
        }else{
            System.out.println(name+ " jumps closer playfully");
        }
    }

    @Override 
    public void defend(){
        if (age >= 10){
            System.out.println(name + " is old and slowly walks away");
        }else{
            System.out.println(name+ " growls");
        }
    }


}
