package regexprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emailvalidator {
	private static final String EMAIL_REGEX = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	private static Pattern pattern;
	private Matcher matcher;

	public Emailvalidator() {
		pattern = Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE);
	}

	
	public boolean validateEmail(String email) {
		matcher = pattern.matcher(email);
		return matcher.matches();
}
}
