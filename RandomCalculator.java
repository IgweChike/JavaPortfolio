/*Denzel Chike
12/5/2020
JDK 1.8
Practice with writing a methods in a separate file
 */
import java.util.Scanner;
public class RandomCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Would you like to add, subtract, multiply, or divide");
        String choice = input.next();
        System.out.println("pick an integer number:");
        int n1 = input.nextInt();
        System.out.println("Pick an integer number:");
        int n2 = input.nextInt();
        int r1 = Calculations.generateRandomNum(n1, n2);
        int r2 = Calculations.generateRandomNum(n1, n2);
        switch (choice) {
            case "add":
                System.out.println(r1 + "+" + r2 + "=" + Calculations.add(r1, r2));
                break;
            case "subtract":
                System.out.println(r1 + "-" + r2 + "=" + Calculations.subtract(r1, r2));
                break;
            case "multiply":
                System.out.println(r1 + "*" + r2 + "=" + Calculations.multiply(r1, r2));
                break;
            case "divide":
                System.out.println(r1 + "/" + r2 + "=" + Calculations.divide(r1, r2));
                break;
            default:
                System.out.println("Invalid");
                break;
        }


    }
    
}
