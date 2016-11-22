package eu.sig.training.ch04;

/**
 * Created by atarsa on 22.11.16.
 */
public class ChecksumUtils {

    public static int createSum(String counterAccount) {
        int sum = 0;
        for (int i = 0; i < counterAccount.length(); i++) {
            sum = sum + (9-i) * Character.getNumericValue(
                    counterAccount.charAt(i));
        }
        return sum;
    }
}
