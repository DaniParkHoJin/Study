package mapCollectionExam;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {

	public static void main(String[] args) {
		// Hashtable 컬렉션 생성
		Map<String, Integer> map = new Hashtable<String, Integer>();
		//Map<String, Integer> map = new HashMap<String, Integer>(); HashMap으로 하면 갯수가 이상해짐.
		// 작업 스레드 객체 생성
		Thread threadA = new Thread() {
			// 엔트리 1000개 추가
			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					map.put(String.valueOf(i), i);
				}
			}

		};

		// 작업 스레드 객체 생성
		Thread threadB = new Thread() {
			// 엔트리 1000개 추가
			@Override
			public void run() {
				for (int i = 1001; i <= 2000; i++) {
					map.put(String.valueOf(i), i);
				}
			}

		};

		// 작업 스레드 실행
		threadA.start();
		threadB.start();

		// 작업 스레드들이 모두 종료될 때 까지 메인 스레드를 기다리게 함
		try {
			threadA.join();
			threadB.join();
		} catch (Exception e) {
		}
		// 저장된 총 엔드리 수 얻기
		int size = map.size();
		System.out.println("총 엔트리 수: " + size);
		System.out.println();
	}

}
