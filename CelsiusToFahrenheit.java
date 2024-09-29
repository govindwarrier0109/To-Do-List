import java.util.Scanner;
public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        
        // Convert Celsius to Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;
        
        // Display the temperature in Fahrenheit
        System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit");
        
        // Close the scanner
        scanner.close();
    }
}
