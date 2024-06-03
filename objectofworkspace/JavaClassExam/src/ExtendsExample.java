
public class ExtendsExample {

	public static void main(String[] args) {
		InterfaceImpl interfaceImpl = new InterfaceImpl();
		
		InterfaceA interfaceA = interfaceImpl;
		interfaceA.methodA();
		System.out.println();
		
		
		InterfaceB interfaceB = interfaceImpl;
		interfaceB.methodB();;
		System.out.println();

		InterfaceC interfaceC = interfaceImpl;
		interfaceC.methodA();
		interfaceC.methodB();
		interfaceC.methodC();
		
	}

}
