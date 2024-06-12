package json;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

import org.json.JSONArray;
import org.json.JSONObject;

public class ParseJsonExample {

	public static void main(String[] args) throws IOException {
		// ���Ϸκ��� JSON �б�
		BufferedReader br = new BufferedReader(new FileReader("member.json", Charset.forName("UTF-8")));
		
		String json = br.readLine();
		br.close();
		
		// JSON �Ľ�
		JSONObject root = new JSONObject(json);
		
		// �Ӽ� ���� �б�
		System.out.println("id: " + root.getString("id"));
		System.out.println("name: " + root.getString("name"));
		System.out.println("age: " + root.getString("age"));
		System.out.println("students: " + root.getBoolean("student"));
		
		// ��ü �Ӽ� ���� �б�
		JSONObject tel = root.getJSONObject("tel");
		System.out.println("home: " + tel.getString("home"));
		System.out.println("mobile: " + tel.getString("mobile"));
		
		// �迭 �Ӽ� ���� �б�
		 JSONArray skill = root.getJSONArray("skill");
		 System.out.print("skill: ");
		 for (int i = 0; i < skill.length(); i++) {
			System.out.println(skill.get(i) + ", ");
		}
	}

}
