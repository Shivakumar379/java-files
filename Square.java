import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square: ");
        // Corrected the class name from 'Scannar' to 'Scanner' and 'Syetem' to 'System'
        // Also corrected the spelling of 'Scanner' and 'System'
        int n = sc.nextInt();   

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close(); // Close the scanner to prevent resource leaks
    }
}