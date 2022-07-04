import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Создать запрос для определения в тексте цифр, за которыми не стоит знак +.*/

public class SecondTask {
    public static void main(String[] args) {
        String stringPattern = "\\d+\\.\\d+";
        String text = "0.0 1.3434 .32 34234. 123";
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
