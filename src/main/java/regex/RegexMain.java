package regex;

public class RegexMain {

	public static void main(String[] args) {
		System.out.println("creating Regex Program");
		RegexClass reg=new RegexClass();
		System.out.print("validName is:");
		reg.ValidName();
		System.out.print("  LastName is:");
		reg.LastName();
		System.out.print("  Email is: ");
		reg.Email();
		System.out.print("  MobileNumber is: ");
		reg.Mobilenumb();
	}

}
