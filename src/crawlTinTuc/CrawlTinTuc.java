package crawlTinTuc;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlTinTuc {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
           scanner.useDelimiter("\\Z");

            String content = scanner.next();
            scanner.close();
            content = content.replaceAll("\\n+","");
            content = content.replaceAll("&quot;","'");


            Pattern p = Pattern.compile("h3 class=(.*?)htm\">(.*?)</a>");
            Matcher m = p.matcher(content);
            while (m.find()){
                System.out.println(m.group(2));
            }

        }catch (Exception e ){
            e.printStackTrace();
        }
    }
}
