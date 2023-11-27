import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    // ^[\w-.]+@[\w-.]+\.[\w-]{2,}$
    private static Pattern EMAIL_PATTERN = Pattern.compile("^[\\w-.]+@[\\w-.]+\\.[\\w-]{2,}$");

    /**
     * @param email as String
     * @return true if email is valid, otherwise false
     */
    public static boolean validate(String email) {
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        if (matcher.find()) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

}
