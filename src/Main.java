import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Variables
        double tempCelsius = 0;
        double tempFahrenheit = 0;
        String trash = "";
        // Code for user Input
        Scanner in = new Scanner(System.in);
        // Initial prompt from program
        System.out.print("Please enter the temperature in degrees Celsius: ");
        // If the user input is valid
        if (in.hasNextDouble())
        {
            tempCelsius = in.nextDouble();
            // Formula
            tempFahrenheit = (tempCelsius * 1.8) + 32;
            // Output "Your temperature in degrees Fahrenheit is: " + tempFahrenheit
            System.out.print("Your temperature in degrees Fahrenheit is: " + tempFahrenheit);
        }
        // If the user input is invalid/contains a letter
        else
        {
            trash = in.nextLine();
            // output "Invalid temperature: " + trash
            System.out.print("Invalid temperature: " + trash);
        }
    }
}