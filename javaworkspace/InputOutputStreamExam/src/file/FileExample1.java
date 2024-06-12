package file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample1 {

	public static void main(String[] args) throws Exception {
		// File ��ü ����
		File dir = new File("Temp/");
		File file1 = new File("Temp/file1.txt");

		File dir2 = new File("/src/Temp/");
		File file2 = new File("src/Temp/file1.txt");

		
		// �������� ������ ���丮 �Ǵ� ���� ����
		if (dir.exists() == false) {
			dir.mkdirs();
		}
		if (file1.exists() == false) {
			file1.createNewFile();
		}

		
		// �������� ������ ���丮 �Ǵ� ���� ����
		if (dir2.exists() == false) {
			dir2.mkdirs();
		}
		if (file2.exists() == false) {
			file2.createNewFile();
		}
		
		// Temp ������ ������ ���
		File temp = new File("D:\\javaproject\\javaworkspace\\InputOutputStreamExam");
		File[] contents = temp.listFiles();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for (File file : contents) {
			System.out.printf("%-25s", sdf.format(new Date(file.lastModified())));
			if (file.isDirectory()) {
				System.out.printf("%-10s%-20s", "<DIR>", file.getName());
			} else {
				System.out.printf("%-10s%-20s", file.length(), file.getName());
			}
			System.out.println();
		}
	}

}
