package demo;

import javax.crypto.Mac;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("^\\+[0-9]{1,3}[1-9][0-9]{8,9}$");
//        Matcher matcher = pattern.matcher("+84866976761");
//        System.out.println(matcher.matches());

//
//        Pattern pattern = Pattern.compile("[a-zA-Z]*(@gmail.com)$");
//        Matcher matcher = pattern.matcher("a@gmail.com");
//        System.out.println(matcher.matches());

        Pattern pattern = Pattern.compile("[^!@,.;':#$%^&*()?]");
        Matcher matcher = pattern.matcher("Hello, how are you?");
        while (matcher.find()){
            System.out.print(matcher.group());
        }
    }
}