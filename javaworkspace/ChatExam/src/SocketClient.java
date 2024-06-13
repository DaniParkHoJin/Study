import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

import org.json.JSONObject;

public class SocketClient {
	// �ʵ�
	ChatServer chatServer;
	Socket socket;
	DataInputStream dis;
	DataOutputStream dos;
	String clientIp;
	String chatName;
	
	
	public SocketClient(ChatServer chatServer, Socket socket) {
		try {
			this.chatServer = chatServer;
			this.socket = socket;
			this.dis = new DataInputStream(socket.getInputStream());
			this.dos = new DataOutputStream(socket.getOutputStream());
			InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
			this.clientIp = isa.getAddress().getHostAddress();
			receive();
		} catch (IOException e) {
		}
	}
	// �޼ҵ� : JSON �ޱ� 
	public void receive() {
		
		chatServer.threadPool.execute(()-> {
			try {
				String receiverJson = dis.readUTF();
				
				JSONObject jsonObject = new JSONObject(receiverJson);
				String command = jsonObject.getString("command");
				System.out.println("���� 1");
				switch (command) {
				case "incoming":
					this.chatName = jsonObject.getString("data");
					chatServer.sendToAll(this, "�����̽��ϴ�.");
					chatServer.addSocketClient(this);
					break;

				case "message":
				String message = jsonObject.getString("data");
				System.out.println("���� 2");
				chatServer.sendToAll(this, message);
				System.out.println("���� 3");
					break;
				}				
			} catch (IOException e) {
				chatServer.sendToAll(this, "�����̽��ϴ�.");
				chatServer.removeSocketClient(this);
			}						
		});
	}
	
	//	 �޼ҵ� : JSON ������
	public void send(String json) {
		try {
			dos.writeUTF(json);
			dos.flush();
		} catch (IOException e) {
		}
		
	}
	
	//  �޼ҵ� : ���� ���
	public void close() {
		try {
			socket.close();
		} catch (Exception e) {
		}
	}	
}
