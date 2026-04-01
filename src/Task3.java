import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter coefficients for ax^2 + bx + c = 0");
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();

        if (a == 0) {
            System.out.println("The value of 'a' cannot be 0 for a quadratic equation.");
            scanner.close();
            return;
        }

        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        System.out.printf("Variables: a = %.2f, b = %.2f, c = %.2f\n", a, b, c);

        double delta = Math.pow(b, 2) - (4 * a * c);
        int numberOfRoots;

        if (delta > 0) {
            numberOfRoots = 2;
        } else if (delta == 0) {
            numberOfRoots = 1;
        } else {
            numberOfRoots = 0;
        }

        switch (numberOfRoots) {
            case 2:
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.printf("Delta > 0. Two roots:\nx1 = %.2f\nx2 = %.2f\n", x1, x2);
                break;
            case 1:
                double x = -b / (2 * a);
                System.out.printf("Delta = 0. One root:\nx1 = %.2f\n", x);
                break;
            case 0:
                System.out.println("Delta < 0. There are no real roots.");
                break;
        }

        scanner.close();
    }
}