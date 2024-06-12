package tcp;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class EchoClient {

	public static void main(String[] args) {
		try {
			// Socekt 생성과 동시에 localhost의 5001 포트로 연결 요청;
			Socket socket = new Socket("localhost",50001);
					System.out.println("[클라이언트] 연결 성공");
					
			// 데이터 보내기		
			String sendMessage = "자바를 좋아해야해 ";
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(sendMessage);
			dos.flush();
			System.out.println("[클라이언트] 데이터 보냄: " + sendMessage);
			
			
			// 데이터 받기
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String reciveMessage = dis.readUTF();
			System.out.println("[클라이언트] 테이터 받음: " + reciveMessage);
					
			
			
			// 연결 끊기
			socket.close();
			System.out.println("[클라이언트] 연결 끊음");
		} catch (Exception e) {
		}
	}

}
