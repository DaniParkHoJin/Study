
public class SecChild {

	public static void main(String[] args) {
		
		// 이런 경우에 객체는 서로 다른 것인가?
		Parent parent = new Parent("","","");
		parent.setName("");
		parent.setAge("");
		
		
		Child child = new Child("","","","");
		child.setName("");
		child.setJab("");
		child.moneyCard = 1000;
	}
}
