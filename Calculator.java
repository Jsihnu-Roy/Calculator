package calculator;
import java.util.Scanner;
/**
 * @author Sayan Mondal
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:-");
        System.out.print("First Number:  ");
        int num1 = sc.nextInt();
        System.out.print("\nSecond Number:  ");
        int num2 = sc.nextInt();
        System.out.println("\n\n");
        System.out.println("Enter an operator to perform the specific calculation: +, -, *, /, %");
        String operator = sc.next();
        switch(operator){
            case "+":
                System.out.println("The result is = " +(num1+num2));
                break;
            case "-":
                System.out.println("The result is = " +(num1-num2));
                break;
            case "*":
                System.out.println("The result is = " +(num1*num2));
                break;
            case "/":
                System.out.println("The result is = " +(num1/num2));
                break;
            case "%":
                System.out.println("The result is = " +(num1%num2));
                break;
            default:
                System.out.println("Please enter a valid operator!");
        }
    }
    
}
