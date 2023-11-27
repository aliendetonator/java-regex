import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TAJValidator {
    // ^\d{3} ?\d{3} ?\d{3}$

    private static Pattern TAJ_PATTERN = Pattern.compile("^\\d{3} ?\\d{3} ?\\d{3}$");

    /**
     * @param taj as String
     * @return true if taj is valid, otherwise false
     */
    public static boolean validate(String taj) {
        Matcher matcher = TAJ_PATTERN.matcher(taj);
        if (!matcher.find()) {
            return Boolean.FALSE;
        }
        taj = taj.replaceAll(" ", "");

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += 3 * Character.getNumericValue(taj.charAt(i * 2)); //odd
            sum += 7 * Character.getNumericValue(taj.charAt(i * 2 + 1)); //even
        }
        int cdv = sum % 10;

        if (Character.getNumericValue(taj.charAt(8)) == cdv) {
            return Boolean.TRUE;
    }

        return Boolean.FALSE;
    }
}
