//: object/HelloDate.java
import java.util.Date;

/** The first Thinking in Java example program.
  * Displays a string and today's date.
  * @author Bruce Eckel
  * @author www.MindView.mew
  * @author lcy
  * @version 4.0
 */
public class HelloDate {
	/** Entry point to class and application.
	  * @param args array of string arguments
	  * @throws exceptions No exceptions thrown
	  */
	public static void main(String[] args) {
		System.out.println("Hello, it's: ");
		System.out.println(new Date());
	}
}
