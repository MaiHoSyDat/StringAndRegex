package validateGmail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValiDateGmail {
    private static Pattern pattern;
    private Matcher matcher;
    private final String EMAIL = "^[A-Za-z0-9]+@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*$";

    public ValiDateGmail(){
        pattern= Pattern.compile(EMAIL);
    }
    public boolean test(String email){
        return pattern.matcher(email).matches();
    }

    public static void main(String[] args) {
        ValiDateGmail test = new ValiDateGmail();
        String a = "Adfad@gmail.com";
        String b = "a@email";
        String c = "ds@code.";
        String d = "b@#email.com";
        System.out.println(test.test(a));
        System.out.println(test.test(b));
        System.out.println(test.test(c));
        System.out.println(test.test(d));
    }
}

