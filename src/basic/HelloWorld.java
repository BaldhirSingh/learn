/**
 * 
 */
package basic;
import java.util.ArrayList;
/**
 * 
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	@SuppressWarnings("removal")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello World");
		AddNumbers addNum = new AddNumbers();
		ArrayList<Integer> ar = new ArrayList();
		ar.add(new Integer(10));
		ar.add(new Integer(20));
		addNum.addListOfNumbers(ar);

	}

}
