package noParameter;

public class ButtonExample {

	public static void main(String[] args) {
		// Ok ��ư ��ü ����
		Button btnOk = new Button();
		
		// Ok ��ư ��ü�� ���ٽ�(ClickListener �͸� ���� ��ü) ����
		btnOk.setClickListener(()-> {
			System.out.println("Ok ��ư�� Ŭ���߽��ϴ�.");			
		});
		
		// Ok ��ư Ŭ���ϱ�
		btnOk.click();
		
		//Cancel ��ư ��ü ����
		Button btnCancel = new Button();
		
		//Cancel ��ư ��ü�� ���ٽ�(ClickListerner �͸� ���� ��ü) ����
		btnCancel.setClickListener(()->{
			System.out.println("Cancel ��ư�� Ŭ���߽��ϴ�.");			
		});
		
		//Cancel ��ư Ŭ���ϱ�
		btnCancel.click();
	}

}
