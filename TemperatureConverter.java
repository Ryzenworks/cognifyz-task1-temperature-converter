package LevelOneTasks;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Conversion unit (Celsius/Fahrenheit): ");
        String unit = scanner.nextLine();
        switch (unit){
            case "Fahrenheit" -> {
                System.out.print("Enter celsius: ");
                double c = scanner.nextLong();
                double fahrenheit = (c * ((double) 9 /5)) + 32;
                String formatFahrenheit = String.format("%.2f", fahrenheit);
                System.out.println(c + "°C" +" is " + formatFahrenheit + "°F");
            }
            case "Celsius" -> {
                System.out.print("Enter Fahrenheit: ");
                double f = scanner.nextLong();
                double celsius = (f - 32)* ((double) 5 /9);
                String formatCelsius = String.format("%.2f", celsius);
                System.out.println(f + "°F" +" is " + formatCelsius + "°C");
            }
            default -> System.out.println("Invalid Input");
        }
        scanner.close();
    }
}
