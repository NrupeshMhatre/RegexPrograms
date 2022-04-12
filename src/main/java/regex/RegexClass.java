package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClass {
	public void ValidName()
	{
			String line="Nrupesh";
			String pattern="[A-Z][a-z]*";
			Pattern p=Pattern.compile(pattern);
			Matcher matcher=p.matcher(line);
			if(matcher.matches())
			{
				System.out.print("Pattern Match");
			}
			else {
				System.out.print("No Match");
				}
		}

}
