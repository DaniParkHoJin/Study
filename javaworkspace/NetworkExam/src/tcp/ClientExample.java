package tcp;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientExample {

	public static void main(String[] args) {
		try {
			// Socket ������ ���ÿ� localhost�� 50001 Port�� ���� ��û
			Socket socket = new Socket("192.168.0.231", 50001);
			System.out.println("[Ŭ���̾�Ʈ] ���� ����");

			// Socket �ݱ�
			socket.close();
			System.out.println("[Ŭ���̾�Ʈ] ���� ����");

		} catch (UnknownHostException e) {
			// Ip ǥ�� ����� �߸��Ǿ��� ���
		} catch (IOException e) {
			// �ش� ��Ʈ�� ������ ������ �� ���� ���
		}
	}

}
