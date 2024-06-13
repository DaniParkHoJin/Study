package udp;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class NewsClient {

	public static void main(String[] args) {
		try {
			// datagramSocket ����
			DatagramSocket datagramSocket = new DatagramSocket();
			
			// �����ϰ� ���� ���� ���� ������
			String data = "��ġ";
			byte[] bytes = data.getBytes("UTF-8");
			DatagramPacket sendPacket = new DatagramPacket(bytes, bytes.length, new InetSocketAddress("localhost", 50001));
			datagramSocket.send(sendPacket);
			
			while (true) {
				// ���� �ޱ�
				DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);
				datagramSocket.receive(receivePacket);
				
				// ���ڿ��� ��ȯ
				String news = new String(receivePacket.getData(),0,receivePacket.getLength(), "UTF-8");
				System.out.println(news);
				
				
				
				// 10��° ������ ������ while�� ����
				if (news.contains("����10")) {
					break;
				} 
			}
			// DatagramSocket �ݱ�
			datagramSocket.close();
		} catch (Exception e) {
		}
		
		
	}
	

}
