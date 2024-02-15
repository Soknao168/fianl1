import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the number index: ");
                int n = scanner.nextInt();
                int[] numbers = new int[n];

                System.out.println("Enter the numbers:");
                for (int i = 0; i < n; i++) {
                    System.out.print("Number " + (i + 1) + ": ");
                    numbers[i] = scanner.nextInt();
                }
                System.out.println("Entered numbers:");
                for (int i = 0; i < n; i++) {
                    System.out.println(numbers[i]);
                }





    }
}