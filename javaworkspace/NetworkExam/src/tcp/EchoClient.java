package tcp;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class EchoClient {

	public static void main(String[] args) {
		try {
			// Socekt ������ ���ÿ� localhost�� 5001 ��Ʈ�� ���� ��û;
			Socket socket = new Socket("localhost",50001);
					System.out.println("[Ŭ���̾�Ʈ] ���� ����");
					
			// ������ ������		
			String sendMessage = "�ڹٸ� �����ؾ��� ";
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(sendMessage);
			dos.flush();
			System.out.println("[Ŭ���̾�Ʈ] ������ ����: " + sendMessage);
			
			
			// ������ �ޱ�
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String reciveMessage = dis.readUTF();
			System.out.println("[Ŭ���̾�Ʈ] ������ ����: " + reciveMessage);
					
			
			
			// ���� ����
			socket.close();
			System.out.println("[Ŭ���̾�Ʈ] ���� ����");
		} catch (Exception e) {
		}
	}

}
