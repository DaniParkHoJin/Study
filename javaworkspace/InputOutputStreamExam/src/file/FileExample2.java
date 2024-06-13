package file;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExample2 {

	public static void main(String[] args) {
		try {
			String data = "" + "id: winter\n" + "email: winter@mycompany.com\n" + "tel: 010-123-4567";

			// path ��ü ����

			Path path = Paths.get("D:/javaproject/javaworkspace/InputOutputStreamExam/Temp/user.txt");

			// ���� ���� �� ������ ����
			Files.writeString(Paths.get("D:/javaproject/javaworkspace/InputOutputStreamExam/Temp/user.txt"), data, Charset.forName("UTF-8"));

			// ���� ���� ���
			System.out.println("���� ����: " + Files.probeContentType(path));
			System.out.println("���� ũ��: " + Files.size(path));

			// ���� �б�
			String content = Files.readString(path, Charset.forName("UTF-8"));
			System.out.println(content);

		} catch (Exception e) {
		}
	}

}
