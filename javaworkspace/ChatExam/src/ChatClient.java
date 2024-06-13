import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import org.json.JSONObject;

public class ChatClient {
	// �ʵ�
	Socket socket;
	DataInputStream dis;
	DataOutputStream dos;
	String chatName;

	// �޼ҵ� ���� ����
	public void connect() throws IOException {
		socket = new Socket("192.168.0.23", 50001);
		dis = new DataInputStream(socket.getInputStream());
		dos = new DataOutputStream(socket.getOutputStream());
		System.out.println("[Ŭ���̾�Ʈ] ������ �����");
	}

	// �޼ҵ� : JSON �ޱ�

	public void receive() {
		Thread thread = new Thread(() -> {
			try {
				while (true) {
					String json = dis.readUTF();
					JSONObject root  = new JSONObject(json);
					String clientIp = root.getString("clientIp");
					String chatName = root.getString("chatName");
					String message = root.getString("message");
					System.out.println("<" + chatName + "@" + clientIp + ">" + message);		
				}
			} catch (Exception e) {

				System.out.println("[Ŭ���̾�Ʈ] ���� ���� ����");

				System.exit(0);
			}

		});
		thread.start();
	}
	
	// �޼ҵ� : JSON ������
	
	public void send(String json) throws IOException{
		dos.writeUTF(json);
		dos.flush();
	}
	// �޼ҵ� : ���� ���� ����
	public void unconnet() throws IOException{
		socket.close();		
	}
	
	// �޼ҵ� : ����
	public static void main(String[] args) {
		try {
			ChatClient chatClient = new ChatClient();
			chatClient.connect();
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("��ȭ�� �Է� : ");
			chatClient.chatName = scanner.nextLine();
			
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("command", "incoming");
			jsonObject.put("data", chatClient.chatName);
			String json = jsonObject.toString();
			chatClient.send(json);
			
			chatClient.receive();
			
			System.out.println("---------------------------------------------");
			System.out.println("���� �޽����� �Է��ϰ� Enter");
			System.out.println("ä���� �����Ϸ��� q�� �Է��ϰ� Enter");
			System.out.println("---------------------------------------------");
			
			while (true) {
				String message = scanner.nextLine();
				if (message.toLowerCase().equals("q")) {
					break;			
				}else {
					jsonObject = new JSONObject();
					jsonObject.put("command", "message");
					jsonObject.put("data", message);
					json = jsonObject.toString();
					chatClient.send(json);					
				}
			}
			scanner.close();
			chatClient.unconnet();	
			
		} catch (IOException e) {
		System.out.println("[Ŭ���̾�Ʈ] ���� ���� �ȵ�");
		
		}
	}
	

}
