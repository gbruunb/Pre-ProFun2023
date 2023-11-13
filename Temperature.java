import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature In Celsius : ");
        double celsius = sc.nextDouble();
        // จากสูตร F = (C * (9/5)) + 32
        double fahrenheit = (celsius * (9.0/5)) + 32;
        System.out.println(celsius + " degrees Celsius = " + 
                            fahrenheit + " degrees Fahrenheit");
    }
}