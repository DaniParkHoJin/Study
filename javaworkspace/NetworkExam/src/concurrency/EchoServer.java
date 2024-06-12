package concurrency;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EchoServer {
	private static ServerSocket serverSocket = null;
	private static ExecutorService executorService = Executors.newFixedThreadPool(10);

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

	public static void startServer() {
		// �۾� ������ ����
		Thread thread = new Thread() {

			@Override
			public void run() {
				try {
					// ServerSocket ���� �� Port ���ε�
					serverSocket = new ServerSocket(50001);
					System.out.println("[����] ���۵�");

					// ���� ���� �� ������ ���
					while (true) {
						System.out.println("\n[����] ���� ��û�� ��ٸ�\n");
						// ���� ����
						Socket socket = serverSocket.accept();

						executorService.execute(() -> {
							try {

								// ����� Ŭ���̾�Ʈ ���� ���
								InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
								System.out.println("[����] " + isa.getHostName() + "�� ���� ��û�� ������");

								// ������ �ޱ�
								DataInputStream dis = new DataInputStream(socket.getInputStream());
								String message = dis.readUTF();

								// ������ ������
								DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
								dos.writeUTF(message);
								dos.flush();
								System.out.println("[����] ���� �����͸� �ٽ� ����: " + message);

								// ���� ����
								socket.close();
								System.out.println("[����] " + isa.getHostName() + "�� ������ ����");
							} catch (Exception e) {
							}
						});
					}
				} catch (IOException e) {
					System.out.println("[����] " + e.getMessage());
				}

			}

		};
		// ������ ����
		thread.start();

	}

	public static void stopServer() {
		try {
			// ServerSocket�� �ݰ� Port ����ε�
			serverSocket.close();
			executorService.shutdown();
			System.out.println("[����] ����� ");

		} catch (IOException e1) {
		}
	}

}
