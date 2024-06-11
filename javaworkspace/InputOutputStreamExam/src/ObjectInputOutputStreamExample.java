import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ObjectInputOutputStreamExample {

	public static void main(String[] args) throws Exception {
		// FileOutputStream�� ObjcetOutputStream ���� ��Ʈ�� ����
		FileOutputStream fos = new FileOutputStream(
				"D:/javaproject/javaworkspace/InputOutputStreamExam/Temp/object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		// ��ü ����
		Member m1 = new Member("fall", "��ǳ��");
		Product p1 = new Product("��Ʈ��", 1500000);
		int[] arr1 = { 1, 2, 3 };

		// ��ü�� ������ȭ �ؼ� ���Ͽ� ����
		oos.writeObject(m1);
		oos.writeObject(p1);
		oos.writeObject(arr1);

		oos.flush();
		oos.close();
		fos.close();

		// FileInputStream�� ObjectInputStream ���� ��Ʈ�� ����
		FileInputStream fis = new FileInputStream("D:/javaproject/javaworkspace/InputOutputStreamExam/Temp/object.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);

		// ������ �а� ������ȭ�ؼ� ��ý�� ����
		Member m2 = (Member) ois.readObject();
		Product p2 = (Product) ois.readObject();
		int[] arr2 = (int[]) ois.readObject();

		ois.close();
		fis.close();
		
		// ������ ��ü ���� Ȯ��
		System.out.println(m2);
		System.out.println(p2);
		System.out.println(Arrays.toString(arr2));

	}

}
