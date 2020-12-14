import java.util.ArrayList;
import java.util.regex.Pattern;

public class RegEx {
    public static ArrayList<String>find(
            String text,
            String regex
    ){
        var p = Pattern.compile(regex, Pattern.MULTILINE | Pattern.UNICODE_CHARACTER_CLASS | Pattern.CASE_INSENSITIVE);
        var m = p.matcher(text);
        var result = new ArrayList<String>();
        while (m.find()){
            var b = m.start();
            var e = m.end();
            result.add(text.substring(b, e));
        }
        return result;
    }

}
