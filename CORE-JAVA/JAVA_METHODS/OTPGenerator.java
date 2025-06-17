import java.util.HashSet;
import java.util.Random;

public class OTPGenerator {

    public static int generateOTP() {
        Random rand = new Random();
        return 100000 + rand.nextInt(900000);
    }

    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> set = new HashSet<>();
        for (int otp : otps) {
            if (!set.add(otp)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = new int[10];

        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        boolean unique = areOTPsUnique(otps);
        if (unique) {
            System.out.println("All generated OTPs are unique.");
        } else {
            System.out.println("Duplicate OTPs found.");
        }
    }
}

