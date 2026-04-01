import java.util.Scanner;

public class RectangleArea {
    private double length;
    private double width;
    private double area;

    public void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length in CM: ");
        length = scanner.nextDouble();
        System.out.print("Enter width in CM: ");
        width = scanner.nextDouble();
    }

    public void computeField() {
        area = length * width;
    }

    public void fieldDisplay() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
    }

    public static void main(String[] args) {
        RectangleArea rect = new RectangleArea();
        rect.getData();
        rect.computeField();
        rect.fieldDisplay();
    }
}