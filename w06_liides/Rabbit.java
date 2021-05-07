

public class Rabbit implements Animal{
    public String name;
    public int age;
    public String fur;

    //speak, eat, sleep, beSneaky, lookAround, attack, defend

    public Rabbit(String name, int age, String fur){
        this.name = name;
        this.age=age;
        this.fur=fur;
    }

    @Override 
    public void speak(){
        System.out.println(fur+ " "+name+" sits quietly and stares");
    }

    @Override 
    public void eat(){
        if (age >= 5){
            System.out.println(age+" year old rabbit " + name + " chews grass slowly");
        }else{
            System.out.println(age+" year old rabbit " + name + " chews grass fast");
        }
    }

    @Override 
    public void sleep(){
        if (age >= 5){
            System.out.println(age+" year old rabbit " + name + " sleeps all day unless he is eating");
        }else{
            System.out.println(age+" year old rabbit " + name + " sleeps only at night");
        }
    }

    @Override 
    public void beSneaky(){
        System.out.println(name + " stops moving like a rock");
    }

    @Override 
    public void lookAround(){
        if (age >= 5){
            System.out.println(name + " looks around");
        }else{
            System.out.println(name+ " jumps and runs around");
        }
    }

    @Override 
    public void attack(){
        if (age >= 5){
            System.out.println(name + " starts eating grass");
        }else{
            System.out.println(name+ " jumps around enemy");
        }
    }

    @Override 
    public void defend(){
        if (age >= 5){
            System.out.println(name + " stares at you");
        }else{
            System.out.println(name+ " come by your side");
        }
    }


}
