package substream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferExample {

	public static void main(String[] args) throws Exception {
		// 입출력 스트림 생성
		String originalFilePath1 = BufferExample.class.getResource("test.png").getPath();
		String targetFilePath1 = "D:/javaproject/javaworkspace/InputOutputStreamExam/Temp/targetTest1.png";

		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);

		// 입출력 스트림 + 버퍼 스트림 생성
		FileInputStream fis2 = null;
		FileOutputStream fos2 = null;
		
		try {
		String originalFilePath2 = BufferExample.class.getResource("test2.png").getPath();
		String targetFilePath2 = "D:/javaproject/javaworkspace/InputOutputStreamExam/Temp/targetTest2.png";
		
		
			fis2 = new FileInputStream(originalFilePath2);
			fos2 = new FileOutputStream(targetFilePath2);
		} catch (NullPointerException e) {
			System.out.println("파일을 찾을 수 없습니다."  );

			e.printStackTrace();
			
		}

		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);

		// 버퍼를 사용하지 않고 복사
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼 미사용:\t" + nonBufferTime + " ns");

		// 버퍼를 사용하고 복사
		long bufferTime = copy(bis, bos);
		System.out.println("버퍼 사용:\t" + bufferTime + "ns");

		fis.close();
		fos.close();
		bis.close();
		bos.close();
	}

	public static Long copy(InputStream is, OutputStream os) throws Exception {
		// 시작 시간 저장
		long start = System.nanoTime();
		// 1 바이트를 읽고 1 바이트 출력
		while (true) {
			int data = is.read();
			if (data == -1)
				break;
			os.write(data);
		}
		os.flush();
		// 끝 시간 저장
		long end = System.nanoTime();
		// 복사시간 리턴
		return (end - start);
	}

}
