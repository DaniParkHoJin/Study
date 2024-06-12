import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PhoneBookManager {
	// final int MAX_CNT = 100;
	// PhoneInfo[] infoStorage = new PhoneInfo[MAX_CNT];
	// int curCnt = 0;
	private final File dataFile = new File("PhoneBook.dat");// 저장할 파일명
	HashSet<PhoneInfo> infoStorage = new HashSet<PhoneInfo>();

	static PhoneBookManager inst = null;
	PhoneInfo info = new PhoneInfo();

	public static PhoneBookManager creatManagerInst() {
		if (inst == null) {
			inst = new PhoneBookManager();
		}
		return inst;
	}

	private PhoneBookManager() {
		readFromFile();
	}

	public void test() {
		infoStorage.forEach(info->{
			
			if( info instanceof PhoneCompanyInfo company) {
				System.out.println(company.getCompany());
			}else if (info instanceof PhoneUnivInfo uni ) {
				System.out.println(uni.getMajor());
			}
			
			
		});
		
	}

	
	/*
	 * private PhoneInfo readFromFile() { System.out.print("이름: "); String name =
	 * MenuViewer.keyboard.nextLine(); System.out.print("전화번호: "); String phone =
	 * MenuViewer.keyboard.nextLine();
	 * 
	 * return new PhoneInfo(name, phone); }
	 */

	public void inputData() throws MenuChoiceException {
		int choice; // 번호 선택
		boolean isAdded; // 입력한 테이터 저장 확인

		System.out.println("데이터 입력을 시작합니다..");
		System.out.println("1. 일반, 2. 대학, 3. 회사");
		System.out.print("선택>> ");
		choice = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		PhoneInfo info = null;

		if (choice < INPUT_SELECT.NORMAL || choice > INPUT_SELECT.COMPANY) {
			throw new MenuChoiceException(choice);
		}
		switch (choice) {
		case INPUT_SELECT.NORMAL:
			info = readFriendInfo();
			break;
		case INPUT_SELECT.UNIV:
			info = readUnivFriendInfo();
			break;
		case INPUT_SELECT.COMPANY:
			info = readCompanyFriendInfo();
			break;
		}
		// infoStorage[curCnt++] = info;
		isAdded = infoStorage.add(info);
		if (isAdded = true) {
			System.out.println("데이터 입력이 완료되었습니다. \n");
		} else {
			System.out.println("이미 저장된 완료되었습니다. \n");
		}

	}

	public void searchData() {
		String name; // 이름
		System.out.println("데이터 검색을 시작합니다..");
		System.out.print("이름: ");
		name = MenuViewer.keyboard.nextLine();
		/*
		 * int dataIdx = search(name); if (dataIdx < 0) {
		 * System.out.println("해당하는 데이터가 존재하지 않습니다. \n"); } else {
		 * infoStorage[dataIdx].showPhoneInfo();
		 * System.out.println("데이터 검색이 완료되었습니다. \n"); } }
		 */
		PhoneInfo info = search(name);
		if (info == null) {
			System.out.println("해당하는 데이터가 존재하지 않습니다.\n");
		} else {
			info.showPhoneInfo();
			System.out.println("데이터 검색이 완료되었습니다.");
		}
	}

	public void deleteData() {
		String name; // 이름

		System.out.println("데이터 삭제를 시작합니다..");
		System.out.print("이름: ");
		name = MenuViewer.keyboard.nextLine();
		/*
		 * int dataIdx = search(name); if (dataIdx < 0) {
		 * System.out.println("해당하는 데이터가 존재하지 않습니다. \n"); } else { for (int idx =
		 * dataIdx; idx < (curCnt - 1); idx++) { infoStorage[idx] = infoStorage[idx +
		 * 1]; } curCnt--; System.out.println("데이터 삭제가 완료되었습니다. \n"); }
		 */

		Iterator<PhoneInfo> itr = infoStorage.iterator();
		while (itr.hasNext()) {
			PhoneInfo curInfo = itr.next();
			if (name.compareTo(curInfo.getName()) == 0) {
				itr.remove();
				System.out.println("데이터 삭제가 완료 되었습니다.\n");
				return;
			}

		}
		System.out.println("해당하는 데이터가 존재하지 않습니다. \n");
	}

	public PhoneInfo search(String name) {
		/*
		 * for (int idx = 0; idx < curCnt; idx++) { PhoneInfo curInfo =
		 * infoStorage[idx]; if (name.compareTo(curInfo.getName()) == 0) { return idx; }
		 * }
		 */

		Iterator<PhoneInfo> itr = infoStorage.iterator();
		while (itr.hasNext()) {
			PhoneInfo curInfo = itr.next();
			if (name.compareTo(curInfo.getName()) == 0) {
				return curInfo;
			}

		}
		return null;
	}

	public PhoneInfo readFriendInfo() {
		System.out.print("이름: ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("전화번호: ");
		String phone = MenuViewer.keyboard.nextLine();
		return new PhoneInfo(name, phone);
	}

	public PhoneInfo readUnivFriendInfo() {
		System.out.print("이름: ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("전화번호: ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.print("전공: ");
		String major = MenuViewer.keyboard.nextLine();
		System.out.print("학년: ");
		int year = MenuViewer.keyboard.nextInt();
		MenuViewer.keyboard.nextLine();
		return new PhoneUnivInfo(name, phone, major, year);
	}

	public PhoneInfo readCompanyFriendInfo() {
		System.out.print("이름: ");
		String name = MenuViewer.keyboard.nextLine();
		System.out.print("전화번호: ");
		String phone = MenuViewer.keyboard.nextLine();
		System.out.print("회사: ");
		String company = MenuViewer.keyboard.nextLine();
		return new PhoneCompanyInfo(name, phone, company);
	}

	public static PhoneBookManager createManagerInst() {
		if (inst == null) {
			inst = new PhoneBookManager();
		}
		return inst;
	}

	// 입력 정보를 파일에 저장
	public void storeToFile() {
		try {
			FileOutputStream file = new FileOutputStream(dataFile);
			ObjectOutputStream out = new ObjectOutputStream(file);

			Iterator<PhoneInfo> itr = infoStorage.iterator();
			while (itr.hasNext()) {
				out.writeObject(itr.next());
			}
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 파일에서 데이터 읽어오기
	public void readFromFile() {

		try {
			FileInputStream file = new FileInputStream(dataFile);
			ObjectInputStream in = new ObjectInputStream(file);

			while (true) {
				PhoneInfo info = (PhoneInfo) in.readObject();
				if (info == null)
					break;
				infoStorage.add(info);
			}
			in.close();
		} catch (IOException e) {
			return;
		} catch (ClassNotFoundException e) {
			return;
		}

	}

}
