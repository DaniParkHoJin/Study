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
		// ����� ��Ʈ�� ����
		String originalFilePath1 = BufferExample.class.getResource("test.png").getPath();
		String targetFilePath1 = "D:/javaproject/javaworkspace/InputOutputStreamExam/Temp/targetTest1.png";

		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);

		// ����� ��Ʈ�� + ���� ��Ʈ�� ����
		FileInputStream fis2 = null;
		FileOutputStream fos2 = null;
		
		try {
		String originalFilePath2 = BufferExample.class.getResource("test2.png").getPath();
		String targetFilePath2 = "D:/javaproject/javaworkspace/InputOutputStreamExam/Temp/targetTest2.png";
		
		
			fis2 = new FileInputStream(originalFilePath2);
			fos2 = new FileOutputStream(targetFilePath2);
		} catch (NullPointerException e) {
			System.out.println("������ ã�� �� �����ϴ�."  );

			e.printStackTrace();
			
		}

		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);

		// ���۸� ������� �ʰ� ����
		long nonBufferTime = copy(fis, fos);
		System.out.println("���� �̻��:\t" + nonBufferTime + " ns");

		// ���۸� ����ϰ� ����
		long bufferTime = copy(bis, bos);
		System.out.println("���� ���:\t" + bufferTime + "ns");

		fis.close();
		fos.close();
		bis.close();
		bos.close();
	}

	public static Long copy(InputStream is, OutputStream os) throws Exception {
		// ���� �ð� ����
		long start = System.nanoTime();
		// 1 ����Ʈ�� �а� 1 ����Ʈ ���
		while (true) {
			int data = is.read();
			if (data == -1)
				break;
			os.write(data);
		}
		os.flush();
		// �� �ð� ����
		long end = System.nanoTime();
		// ����ð� ����
		return (end - start);
	}

}
