import java.util.Scanner;

public class degreefahrenheit{

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.println("Enter the unit of measurement");
        System.out.println("C for Celsius, F for Fahrenheit");
        char unit = scanner.next().toUpperCase().charAt(0);

        if (unit == 'C')
        {
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.printf("%.2f\u00B0C is equal to %.2f\u00B0F%n", temperature, fahrenheit);
        }
        else if (unit == 'F')

        {
            double celsius = fahrenheitToCelsius(temperature);
            System.out.printf("%.2f\u00B0F is equal to %.2f\u00B0C%n", temperature, celsius);
        }
        else
        {
            System.out.println("Invalid unit. Please enter C for Celsius or F for Fahrenheit.");
        }

        scanner.close();
    }
}