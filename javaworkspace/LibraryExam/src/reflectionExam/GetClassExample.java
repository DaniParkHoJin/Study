package reflectionExam;

public class GetClassExample {

	public static void main(String[] args) throws Exception{
		//how1
		Class clazz = Car.class;
		
		//how2
		//Class clazz = Class.forName("Library.reflection.Car");
		
		//how3
		//Car car = new Car();
		//Class clazz = car.getClass();
		
		System.out.println("��Ű�� : " + clazz.getPackageName());
		System.out.println("Ŭ���� ���� �̸� : " + clazz.getSimpleName());
		System.out.println("Ŭ���� ��ü �̸� : " + clazz.getName());
	}

}
