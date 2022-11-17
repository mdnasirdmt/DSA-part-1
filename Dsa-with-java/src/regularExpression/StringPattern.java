package regularExpression;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class StringPattern {

	public static void main(String[] args) {
		
		Pattern p= Pattern.compile("nasir");
		Matcher m= p.matcher("anasirbnasircnasir");
		
//		System.out.println(m.find(1));
		while(m.find()) {
			System.out.println(m.start()+ "  "+m.end()+"  "+m.group());
		}

	}

}
