package stackQueueCollection;

public class Message {
	private String command;
	private String to;
	
	public Message() {
		super();
	}

	public Message(String command, String to) {
		super();
		this.command = command;
		this.to = to;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	@Override
	public String toString() {
		return "Message [command=" + command + ", to=" + to + "]";
	}
	
	
}
