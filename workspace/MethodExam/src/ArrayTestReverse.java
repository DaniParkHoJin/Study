
public class ArrayTestReverse {

	public static void main(String[] args) {
		int[] list = { 1, 2, 3, 4, 5, 6, 7 };
		int[] reverseList;

		System.out.println("�޼��� ȣ�� �� ����Ʈ");
		for (int printList : list) {
			System.out.print(printList + ", ");
		}
		
		// �迭�� ��ȯ
		reverseList = reverse(list);
		
		System.out.println("\n\n�޼��� ȣ�� �� ����Ʈ");
		for (int printList : reverseList) {
			System.out.print(printList +", ");
		}
		
		
		
	}

	public static int[] reverse(int[] list) {
		int[] result = new int[list.length];
		for (int i = 0, j = result.length-1; i < result.length; i++, j--) {
			result[j] = list[i];
			
		} return result;
	
	}

}
