package output;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample4 {

	public static void main(String[] args) {
		try {
// ���� ��� ��� ��Ʈ�� ����
			Writer writer = new FileWriter("D:/javaproject/javaworkspace/InputOutputStreamExam/Temp/test.txt");

			// 1 ���ھ� ���
			char a = 'A';
			writer.write(a);
			char b = 'B';
			writer.write(b);

			// char �迭 ���
			char[] arr = { 'C', 'D', 'E' };
			writer.write(arr);
			
			// ���ڿ� ���
			writer.write("FGH");
			writer.write("��ȣ��");
			
			// ���ۿ� �ܷ��ϰ� �ִ� ���ڵ��� ����ϰ�, ���۸� ���
			writer.flush();
			
			// ��� ��Ʈ���� �ݰ� �޸� ����
			
			writer.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
