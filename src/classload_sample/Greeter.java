package classload_sample;

public class Greeter {
	private static Message s_message = new Message("Hello, World!");

	public void greet() {
		s_message.print(System.out);
	}
}
