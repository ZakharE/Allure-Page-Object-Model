import net.bytebuddy.utility.RandomString;

public class UtilMethods {
    public static String emailGeneration(int randomPartLength) {
        String fixedPart = "+wpt@wriketask.qaa";
        String randomPart = RandomString.make(randomPartLength);
        return randomPart + fixedPart;
    }
}
