import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Напишите регулярное выражение для поиска HTML-цвета, заданного как #ABCDEF,
    то есть # и содержит затем 6 шестнадцатеричных символов.*/

public class FirstTask {
    public static void main(String[] args) {
        String stringPattern = "#(\\d|[a-f]|[A-F]){6}";
        //String stringPattern = "#[0-9a-fA-F]{6}";
        String text = "color:#121212; background-color:#AA00ef bad-colors:f#fddee #fd2 #12345678";
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
