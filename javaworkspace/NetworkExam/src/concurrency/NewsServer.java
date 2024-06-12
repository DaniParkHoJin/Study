package concurrency;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewsServer {
	private static DatagramSocket datagramSocket = null;
	private static ExecutorService excuService = Executors.newFixedThreadPool(10);

	public static void main(String[] args) {
		System.out.println("---------------------------------------------");
		System.out.println("������ �����Ϸ��� q �Ǵ� Q�� �Է��ϰ� Enter Ű�� �Է��ϼ���.");
		System.out.println("---------------------------------------------");

		// UDP ���� ����
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

		// UDP ���� ����
		stopServer();
	}

	public static void startServer() {
		// �۾� ������ ����
		Thread thread = new Thread() {

			@Override
			public void run() {
				// DatageramSockt ���� �� port ���ε�
				try {
					datagramSocket = new DatagramSocket(50001);
					System.out.println("[����] ���۵�");

					while (true) {
						// Ŭ���̾�Ʈ�� �����ϰ� ���� ���� ���� ���
						DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);
						datagramSocket.receive(receivePacket);

						excuService.execute(() -> {

							try {
								String newsKind = new String(receivePacket.getData(), 0, receivePacket.getLength(),
										"UTF-8");

								// Ŭ���̾�Ʈ�� IP�� Port ���
								SocketAddress socketAddress = receivePacket.getSocketAddress();

								// 10���� ������ Ŭ���̾�Ʈ�� ����

								for (int i = 1; i <= 10; i++) {
									String data = newsKind + "����" + i;
									byte[] bytes = data.getBytes("UTF-8");
									DatagramPacket sendPacket = new DatagramPacket(bytes, 0, bytes.length,
											socketAddress);
									datagramSocket.send(sendPacket);
								}
							} catch (Exception e) {
							}
						});
					}

				} catch (Exception e) {
					System.out.println("[����] " + e.getMessage());
				}

			}

		};
		// ������ ����
		thread.start();
	}

	public static void stopServer() {
		// DatagramSocket�� �ݰ� Port ����̵�
		datagramSocket.close();
		excuService.shutdown();
		System.out.println("[����] �����");
	}
}
