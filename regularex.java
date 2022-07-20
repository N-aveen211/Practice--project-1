package collection;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class regularex {

	public static void main(String[] args) {
		String name="java is easy to learn";
		Pattern p=Pattern.compile("[^i]");
		Matcher m=p.matcher(name);
		while(m.find()) {
			System.out.print(m.group());
		}
		
	}

}
