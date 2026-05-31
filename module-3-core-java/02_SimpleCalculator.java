import java.util.*;

public class Exercise02_SimpleCalculator{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int fnum = sc.nextInt();

        System.out.println("Enter the second number: ");
        int snum = sc.nextInt();

        System.out.println("Choose an operation (+, -, *, /): ");
        char choice = sc.next().charAt(0);

        switch(choice){

            case '+':
                System.out.println("Addition of " + fnum + " and " + snum + " is " + (fnum + snum));
                break;

            case '-':
                System.out.println("Subtraction of " + fnum + " and " + snum + " is " + (fnum - snum));
                break;

            case '*':
                System.out.println("Multiplication of " + fnum + " and " + snum + " is " + (fnum * snum));
                break;

            case '/':

                if(snum != 0) {
                    System.out.println("Division of " + fnum + " and " + snum + " is " + (fnum / snum));
                }
                else{
                    System.out.println("Cannot divide by zero");
                }
                break;

            default:
                System.out.println("Invalid Choice. Please enter +, -, * or /");
                
        }
    }
}