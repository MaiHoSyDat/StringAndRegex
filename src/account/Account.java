package account;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String ACCOUNT = "^[_a-z]{6,}";

    public Account() {
    }
    public boolean validate(String account){
        pattern=Pattern.compile(ACCOUNT);
        matcher = pattern.matcher(account);
        return matcher.matches();
    }

    public static void main(String[] args) {
        Account test  = new Account();
        String a = "dhfssfd";
        String b = "ghj2";
        String c = "_hsddgf_";
        String d = "gh@";
        System.out.println(test.validate(a));
        System.out.println(test.validate(b));
        System.out.println(test.validate(c));
        System.out.println(test.validate(d));
    }
}
