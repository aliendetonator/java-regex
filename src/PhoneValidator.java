import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneValidator {
    //mobil ^(\+3|0)6 ?\(?(20|30|31|50|70)\)? ?(\d(-| )?){7}$
    //budapest ^(\+3|0)6 ?\(?(?!(?:20|30|31|50|70))1\)? ?(\d(-| )?){7}$
    //vezetékes ^(\+3|0)6 ?\(?(?!(?:20|30|31|50|70))\d{2}\)? ?(\d(-| )?){6}$

    private static Pattern MOBILE_PATTERN = Pattern.compile("^(\\+3|0)6 ?\\(?(20|30|31|50|70)\\)? ?(\\d(-| )?){7}$");
    private static Pattern BUDAPEST_PATTERN = Pattern.compile("^(\\+3|0)6 ?\\(?(?!(?:20|30|31|50|70))1\\)? ?(\\d(-| )?){7}$");
    private static Pattern LANDLINE_PATTERN = Pattern.compile("^(\\+3|0)6 ?\\(?(?!(?:20|30|31|50|70))\\d{2}\\)? ?(\\d(-| )?){6}$");

    /**
     * @param number as String
     * @return true if number is a valid hungarian phone number, otherwise false
     */
    public static boolean validate(String number) {
        // mobile check
        Matcher matcher = MOBILE_PATTERN.matcher(number);
        if (matcher.find()) {
            return Boolean.TRUE;
        }
        //budapest check
        matcher = BUDAPEST_PATTERN.matcher(number);
        if (matcher.find()) {
            return Boolean.TRUE;
        }
        //landline check
        matcher = LANDLINE_PATTERN.matcher(number);
        if (matcher.find()) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

}
