package by.htp.string;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Task8 {

	public static void main(String[] args) {
			String s = "Everybody (lies)";

			
			String [] str = s.split(" ");
			StringBuffer sb = new StringBuffer();
	        
	        
	        
	        Pattern p = Pattern.compile("^[(].*[)]$");
	        for (String string : str) {
	        Matcher m = p.matcher(string);
	            if(!m.matches()){
	                sb.append(string);
	                sb.append(" ");
	            }
	            
	        }
	        System.out.println(sb.toString());
	    }
	}