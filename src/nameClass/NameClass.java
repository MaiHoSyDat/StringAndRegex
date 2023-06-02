package nameClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClass {
    private static final String nameClass = "^[C|A|P]\\d{4}[G|H|I|K]$";
    private Pattern pattern;
    private Matcher matcher;

    public NameClass() {
    }

    public boolean testNameClass(String name) {
        pattern = Pattern.compile(nameClass);
        matcher = pattern.matcher(name);
        return matcher.matches();
    }

    public static void main(String[] args) {
        NameClass test = new NameClass();
        String a = "C0323H";
        String b = "C0323";
        String c = "C032H";
        String d = "03231H";
        System.out.println(test.testNameClass(a));
        System.out.println(test.testNameClass(b));
        System.out.println(test.testNameClass(c));
        System.out.println(test.testNameClass(d));
    }
}
