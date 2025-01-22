import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        //Using Scanner in order to take in input from the user.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms there will be in the sequence: ");
        int terms = scanner.nextInt();
        //calls my method and takes the term I put in to generate NotFibonacci
        generateNotFibonacci(terms);
        scanner.close();
    }

    public static void generateNotFibonacci(int terms) {
        long n1 = 0;
        long n2 = 1;
        // Iterates through the terms, and evaluates the sequence based on the equation we were given
        for (int i = 0; i < terms; i++) {
            System.out.print(n1 + " ");

            long n3 = (3 * n2) + (2 * n1);
            n1 = n2;
            n2 = n3;
        }

        System.out.println();
    }
}
