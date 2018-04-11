import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmailExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(.)[A-Za-z]+$";

    public RegexEmailExample() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validateEmail(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
