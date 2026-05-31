public class Exercise07_TypeCastingDemo{
    
    public static void main(String[] args){

        // BEFORE TYPE CASTING
        double d = 89.76;
        int i = 50;

        System.out.println("Before Type Casting");
        System.out.println("Double value: " + d);
        System.out.println("Int value: " + i);

        // double → int (explicit casting)
        int di = (int) d;

        // int → double (implicit casting)
        double id = i;

        // AFTER TYPE CASTING
        
        System.out.println("\nAfter Type Casting");
        System.out.println("Double to Int: " + di);
        System.out.println("Int to Double: " + id);
        
    }
}