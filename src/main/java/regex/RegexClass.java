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
	public void  LastName()
	 {
	String line="Mhatre";
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
	public void Email()
	{
		String line="abc.xyz@bl.com.in";
		String pattern="[a-z \\. a-z]+[@][a-z]+\\.[a-z]{3}+\\.[a-z]{2}";
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
	public void Mobilenumb()
	 {
				String line="91 9988776655";
				String pattern="[0-9]{2} [98]{1}[0-9]{9}";
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
	public void PasswordRule1()
	 {
		String line="nrupeshmhatre";
		String pattern="[a-z]{1,}";
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
