/*
 * @(#) MainClass.java
 *
 */
package pkg4;

public class Program {
	public static void main(String[] args) {
		System.out.println("Before Reading Field.");
		new ClientApp().execute();
		System.out.println();
		
		System.out.println("Before Reading Parameter.");
		new ClientApp().execute(null);
	}
}
