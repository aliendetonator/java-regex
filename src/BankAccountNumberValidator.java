import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BankAccountNumberValidator {
    // ^((\d{8}[ -]?\d{8})|(\d{8}[ -]?\d{8}[ -]?\d{8}))$
    private static Pattern ACCOUNT_PATTERN = Pattern.compile("^((\\d{8}[ -]?\\d{8})|(\\d{8}[ -]?\\d{8}[ -]?\\d{8}))$");

    /**
     * @param bankAccountNumber as String
     * @return true if bankAccountNumber is a valid bank account number, otherwise false
     */
    public static boolean validate(String bankAccountNumber) {
        Matcher matcher = ACCOUNT_PATTERN.matcher(bankAccountNumber);
        if (matcher.find()) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

}
