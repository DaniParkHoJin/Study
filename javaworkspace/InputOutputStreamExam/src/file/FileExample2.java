package file;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExample2 {

	public static void main(String[] args) {
		try {
			String data = "" + "id: winter\n" + "email: winter@mycompany.com\n" + "tel: 010-123-4567";

			// path 객체 생성

			Path path = Paths.get("D:/javaproject/javaworkspace/InputOutputStreamExam/Temp/user.txt");

			// 파일 생성 및 데어터 저장
			Files.writeString(Paths.get("D:/javaproject/javaworkspace/InputOutputStreamExam/Temp/user.txt"), data, Charset.forName("UTF-8"));

			// 파일 정보 얻기
			System.out.println("파일 유형: " + Files.probeContentType(path));
			System.out.println("파일 크기: " + Files.size(path));

			// 파일 읽기
			String content = Files.readString(path, Charset.forName("UTF-8"));
			System.out.println(content);

		} catch (Exception e) {
		}
	}

}
