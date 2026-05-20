import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        float weightBielecki = scanner.nextFloat();

        System.out.print("Enter your height in meters (e.g., 1.75): ");
        float heightBielecki = scanner.nextFloat();

        float bmi = (float) (weightBielecki / Math.pow(heightBielecki, 2));

        System.out.printf("\nYour BMI is: %.2f\n", bmi);
        System.out.print("Category: ");

        if (bmi < 16.00f) {
            System.out.println("starvation");
        } else if (bmi >= 16.00f && bmi <= 16.99f) {
            System.out.println("emaciation");
        } else if (bmi >= 17.00f && bmi <= 18.49f) {
            System.out.println("underweight");
        } else if (bmi >= 18.50f && bmi <= 22.99f) {
            System.out.println("normal, low range");
        } else if (bmi >= 23.00f && bmi <= 24.99f) {
            System.out.println("normal, high range");
        } else if (bmi >= 25.00f && bmi <= 27.49f) {
            System.out.println("overweight, low range");
        } else if (bmi >= 27.50f && bmi <= 29.99f) {
            System.out.println("overweight, high range");
        } else if (bmi >= 30.00f && bmi <= 34.99f) {
            System.out.println("1st degree obesity");
        } else if (bmi >= 35.00f && bmi <= 39.99f) {
            System.out.println("2nd degree obesity");
        } else if (bmi >= 40.00f) {
            System.out.println("3rd degree obesity");
        }

        scanner.close();
    }
}