package tcp;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerExample {

	private static ServerSocket serverSocket = null;

	public static void main(String[] args) {
		System.out.println("---------------------------------------------");
		System.out.println("������ �����Ϸ��� q �Ǵ� Q�� �Է��ϰ� Enter Ű�� �Է��ϼ���.");
		System.out.println("---------------------------------------------");

		// TCP ���� ����
		startServer();

		// Ű���� �Է�
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String key = scanner.nextLine();
			if (key.toLowerCase().equals("q")) {
				break;
			}
		}
		scanner.close();
		// TCP ���� ����
		stopServer();

	}

	// �۾� ������ ����
	private static void startServer() {
		Thread thread = new Thread() {

			@Override
			public void run() {
				try {
					// ServerSocket ���� �� Port ���ε�
					serverSocket = new ServerSocket(50001);
					System.out.println("[����] ���۵�");

					while (true) {
						System.out.println("\n[����] ���� ��û�� ��ٸ� \n");
						// ���� ����
						Socket socket = serverSocket.accept();

						// ����ȵ� Ŭ���̾�Ʈ ���� ���
						InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
						System.out.println("[����] " + isa.getHostString() + "�� ���� ��û�� ������");

						// ���� ����
						socket.close();
						System.out.println("[����] " + isa.getHostString() + "�� ������ ����");

					}

				} catch (IOException e) {
					System.out.println("[����]" + e.getMessage());
				}
			}
		};
		thread.start();
	}

	public static void stopServer() {
		try {
			serverSocket.close();
			System.out.println("[����] �����");
		} catch (IOException e1) {
		}
	}

}
