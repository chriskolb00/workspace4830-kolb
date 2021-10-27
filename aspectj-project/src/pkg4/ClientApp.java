/*
 * @(#) Client.java
 *
 */
package pkg4;

public class ClientApp {
	@MyInject
	Service service;

	public void execute() {
		System.out.println("Client Field Read: " + service);
	}

	@MyExecute
	public void execute(Service service) {
		System.out.println("Client Method Parameter Read: " + service);
	}
}
