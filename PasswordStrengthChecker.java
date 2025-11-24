import java.util.Scanner;

public class PasswordStrengthChecker {

    public static boolean isStrongPassword(String password) {
        boolean length = password.length() >= 8;
        boolean upper = password.matches(".*[A-Z].*");
        boolean lower = password.matches(".*[a-z].*");
        boolean digit = password.matches(".*\\d.*");
        boolean special = password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*");

        if (length && upper && lower && digit && special) {
            return true;
        } else {
            System.out.println(" Weak Password. Please improve the following:");
            if (!length) System.out.println("- Minimum 8 characters required");
            if (!upper) System.out.println("- Include at least one uppercase letter");
            if (!lower) System.out.println("- Include at least one lowercase letter");
            if (!digit) System.out.println("- Include at least one number");
            if (!special) System.out.println("- Include at least one special character");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = sc.nextLine();
        if (isStrongPassword(password)) {
            System.out.println("Strong Password!");
        }
        sc.close();
    }
}

