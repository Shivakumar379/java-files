import java.util.Scanner;

public class StringisRotated {
    // Function to check if str2 is a rotation of str1
    public static boolean isRotated(String str1, String str2) {
        if (str1 == null || str2 == null) return false;
        if (str1.length() != str2.length()) return false;
        String concatenated = str1 + str1;
        return concatenated.contains(str2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        if (isRotated(str1, str2)) {
            System.out.println(str2 + " is a rotation of " + str1);
        } else {
            System.out.println(str2 + " is NOT a rotation of " + str1);
        }
        scanner.close();
    }
}