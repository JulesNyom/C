import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int number1 = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer
        
        System.out.println("Enter a sign (+, -, *, /): ");
        String signs = scanner.nextLine();
        
        System.out.println("Enter a second number: ");
        int number2 = scanner.nextInt();
        
        Operations operations = new Operations();
        try {
            int result = operations.calculate(number1, number2, signs);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        scanner.close();

        Binary binary = new Binary();
        Linear linear = new Linear();

        int [] array = {1,2,3,4,5,6,7,8,9};
        
        System.out.println(linear.linearsearch(array, 3));
        
    }
}