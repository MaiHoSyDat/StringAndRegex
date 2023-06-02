package phoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static final String PHONE = "^\\d{2}-0\\d{9}$";
    private Pattern pattern;
    private Matcher matcher;

    public PhoneNumber() {
    }
    public boolean phoneNumber(String phone){
        pattern = Pattern.compile(PHONE);
        matcher = pattern.matcher(phone);
        return matcher.matches();
    }

    public static void main(String[] args) {
        PhoneNumber test = new PhoneNumber();
        String a = "84-0987654321";
        String b = "8d-0987654321";
        String c = "84-09876a5432";
        System.out.println(test.phoneNumber(a));
        System.out.println(test.phoneNumber(b));
        System.out.println(test.phoneNumber(c));
    }
}
