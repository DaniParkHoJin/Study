package input;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
	public static void main(String[] args) throws Exception {
		String originalFileName = "D:/javaproject/javaworkspace/InputOutputStreamExam/Temp/test.png";
		String targetFileName = "D:/javaproject/javaworkspace/InputOutputStreamExam/Temp/testCopy.png";

		InputStream is = new FileInputStream(originalFileName);
		OutputStream os = new FileOutputStream(targetFileName);

		byte[] data = new byte[1024];
		while (true) {
			int num = is.read(data);
			if (num == -1)
				break;
			os.write(data, 0, num);
		}
//		is.transferTo(os); 자바 9 부터 더 편리하게 복사 할 수 있게 된 메소드

		os.flush();
		os.close();
		is.close();

		System.out.println("복사가 잘 되었습니다.");
	}

}
