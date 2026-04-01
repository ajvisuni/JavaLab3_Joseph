import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;
        int min = 101;
        int max = 0;

        System.out.print("Random numbers drawn: ");

        while (count < 10) {
            int currentNumber = random.nextInt(100) + 1;
            System.out.print(currentNumber + " ");

            if (currentNumber > max) {
                max = currentNumber;
            }

            if (currentNumber < min) {
                min = currentNumber;
            }

            count++;
        }

        System.out.println("\n\nThe smallest number is: " + min);
        System.out.println("The largest number is: " + max);
    }
}