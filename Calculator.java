import java.util.Scanner;

public class Calculator {
    public static int add(int num1,int num2){
	return num1+num2;
    }
    public static int subtraction(int num1,int num2){
	return num1-num2;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Select an operation:");
        System.out.println("1. Addition");
	System.out.println("2. Subtraction");

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
            default:
                System.out.println("Invalid choice! Please select a valid operation.");
        }
        
        scanner.close();
    }
}
