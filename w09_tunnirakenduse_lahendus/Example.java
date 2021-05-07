public class Example{
    public static void main(String[] args) {

        int divideByZero= 5/0;

        getArrayElement(3);

        System.out.println("");
    }

    public static int getArrayElement(int posi){
        int[] intArray = new int[]{1,2,3};
        return intArray[posi];
    }
}