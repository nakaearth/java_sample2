package classload_sample;

public class Message {
	private String m_text;

	public Message(String text) {
		m_text = text;
	}

	public void print(java.io.PrintStream ps) {
		ps.println(m_text);
	}
}
