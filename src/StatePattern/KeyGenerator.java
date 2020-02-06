package StatePattern;

public class KeyGenerator {
    public static String getKey(int amount) {
        if (amount >= 500000) {
            return "Platinum";
        } else if (amount >= 300000) {
            return "Gold";
        }
        return "Silver";
    }
}
