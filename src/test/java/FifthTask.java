import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FifthTask {
    public static void main(String[] args) {
        String stringPattern = "[0-23]\\d:[0-5]\\d";
        String text = "Завтрак в 09:00. Учтите, что 23:98";
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
