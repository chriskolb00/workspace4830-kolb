/*
 * @(#) Service.java
 *
 */
package pkg4;

public class Service {
	String str;
	
	public Service(String s) {
		this.str = s;
	}

	public Service() {
	}

	@Override
	public String toString() {
		return str;
	}
}
