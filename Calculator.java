import java.util.Scanner;

public class Calculator {
    public static int add(int num1,int num2){
	return num1+num2;
    }
    public static int subtraction(int num1,int num2){
	return num1-num2;
    }
    public static int multiplication(int num1,int num2){
	return num1*num2;
    }
    public static int division(int num1,int num2){
	return num1/num2;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Select an operation:");
        System.out.println("1. Addition");
	System.out.println("2. Subtraction");
	System.out.println("3. Multiplication");
        System.out.println("4. Division");

	System.out.print("Enter your choice (1-4): ");
        
        int choice = scanner.nextInt();
        
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        switch (choice) {
            case 1: // Addition
                System.out.println("Result: " + add(num1,num2));
                break;
	    case 2: // Subtraction
                System.out.println("Result: " + subtraction(num1,num2));
                break;
	    case 3: // Multiplication
                System.out.println("Result: " + multiplication(num1,num2));
                break;
            case 4: // Division
                if (num2 != 0) {
                    System.out.println("Result: " + division(num1,num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
            default:
                System.out.println("Invalid choice! Please select a valid operation.");
        }
        
        scanner.close();
    }
}
