
public class TV {
	
	private int channel; // ä��
	private int sound;	//
	private String display;
	
	// �⺻ ������
	public TV(int channel, int sound, String display) {
		super();
		this.channel = channel;
		this.sound = sound;
		this.display = display;
	}
	public TV() {
		super();
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getSound() {
		return sound;
	}
	public void setSound(int sound) {
		this.sound = sound;
	}
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
}
