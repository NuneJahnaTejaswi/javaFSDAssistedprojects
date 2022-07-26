package EmailValidation;
import java.util.Scanner;


public class EmailValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] emails = { "tejaswi@gmail.com",
		        "neelima@yahoo.com",
		        "senorita3@gov.in",
		        "nainasaxena@gmail.com",
		       "alexa@yahoo.com",
		        "nithin@qq.com"};
		        
		    Scanner obj = new Scanner(System.in);
		    System.out.println("Enter the email Id that have to be searched in the Array: ");
		    String text = obj.nextLine();
		    boolean isPresent = false;
		   
		    for (String email : emails) {
		      if (email.contains(text)) {
		        isPresent = true;
		        break;
		      }
		    }

		    if (isPresent) {
		      System.out.println("Email found!" + text);
		    } else {
		      System.out.println("Email not found!" + text);
		    }

		  }
}
