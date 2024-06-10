package mapCollectionExam;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// Map �÷��� ����
		Map<String, Integer> map = new HashMap<String, Integer>();

		// ��ü ����
		map.put("�ſ��", 85);
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		map.put("ȫ�浿", 95);
		System.out.println("�� Entry ��: " + map.size());
		System.out.println();

		// Ű�� �� ���
		String key = "ȫ�浿";
		int value = map.get(key);
		System.out.println(key + ": " + value);
		System.out.println();

		// Ű Set �÷����� ���, �ݺ��ؼ� Ű�� ���� ���
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String k = keyIterator.next();
			Integer v = map.get(k);
			System.out.println(k + " : " + v);

		}
		System.out.println();

		// ��Ʈ�� Set �÷����� ���, �ݺ��ؼ� Ű�� ���� ���
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while (entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + " : " + v);

		}
		System.out.println();
		
		// Ű�� ��Ʈ�� ����
		map.remove("ȫ�浿");
		System.out.println("�� Entry ��: " + map.size());
		System.out.println();
	}

}