import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        String st1 = "sachindhadwalgmail.com";

        Pattern pattern = Pattern.compile("^(.+)@(\\S+)$");
        Matcher matcher = pattern.matcher(st1);
        if(matcher.find()){
            System.out.println("valid" + matcher.group());

        }
        else{
            System.out.println("not valid");
        }
    }
}
