public class Second {
    public static void main(String[] args) {
        System.out.println(myName());
        System.out.println(add(2,2));
        System.out.println(fullName("Egle", "Vestrik"));
        System.out.println(checkEqual(5, 2));
        System.out.println(notEqual(2, 3));

        myMath();
        myLogical();
        areStringsEqual();
    }
    public static String myName(){
        return "Egle";
    }
    public static int add(int number1, int number2){
        return number1+number2;
    }
    public static String fullName(String firstName, String lastName){
        return firstName+ " " + lastName;
    }
    public static boolean checkEqual(int number1, int number2){
        return number1 == number2;
    }
    public static boolean notEqual(int number1, int number2){
        return number1 != number2;
    }
    public static void myMath(){
        System.out.println(Math.pow(5, 2));
        int number = (int)Math.pow(5,2);
        System.out.println(number);
        
        System.out.println(Math.sqrt(9));;

    }
    public static void myLogical() {
        System.out.println(5<10&& 5>4);
        System.out.println(6>8||3 == 3);
    }
    public static void areStringsEqual(){
        String name1 = new String("Egle");  
        String name2 = new String("Egle");
        System.out.println(name1 == name2);
        System.out.println(name1);
        System.out.println(name1.equals(name2)); //stringide jaoks
    }
}

    
