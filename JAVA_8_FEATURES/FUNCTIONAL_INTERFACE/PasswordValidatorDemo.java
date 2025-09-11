interface SecurityUtils {
    static boolean isStrongPassword(String password) {
        return password.length() >= 8 && password.matches(".*[A-Z].*") 
               && password.matches(".*[0-9].*") && password.matches(".*[@#$%^&+=].*");
    }
}

public class PasswordValidatorDemo {
    public static void main(String[] args) {
        String password = "Insure@123";
        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Password is strong.");
        } else {
            System.out.println("Password is weak.");
        }
    }
}

