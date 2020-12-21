import java.util.regex.*;

public class ReFlags {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("^java", Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
		Matcher m = p.matcher("java has regex\nJava has regex\nJAVA has pretty good regular expressions\nRegular expressions are in Java");
		while(m.find()) {
			System.out.println(m.group());
		}
	}
}
