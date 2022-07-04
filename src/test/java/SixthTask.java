import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*Создать запрос для выделения текста, заключенного в кавычки.
При решении задачи учесть, что текст может быть расположен на нескольких строках).*/
public class SixthTask {
    public static void main(String[] args) {
        String stringPattern = "\"(.*\\n?)*\"";
        String text = "invalid text\"string 1\n" +
                "String 2\n" +
                "string_3\n" +
                "\"invalid text";
        Pattern pattern = Pattern.compile(stringPattern);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
