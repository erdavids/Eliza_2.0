package Source;

public class Topic {
	private String topic;
	private int mentions;
	
	public Topic(String t) {
		this.topic = t;
		mentions = 1;
	}
	
	public String getTopic() {
		return topic;
	}
	
	public void mentioned() {
		mentions++;
	}
}
