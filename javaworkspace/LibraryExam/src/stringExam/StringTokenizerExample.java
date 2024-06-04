package stringExam;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String data1 = "È«±æµ¿&ÀÌ¼öÈ«,¹Ú¿¬¼ö";
		String[] arr = data1.split("&|,");
		for (String token : arr) {
			System.out.println(token);
		}
		System.out.println();
		
		String data2 ="È«±æµ¿/ÀÌ¼öÈ«/¹Ú¿¬¼ö";
		StringTokenizer stringTokenizer = new StringTokenizer(data2, "/");
		while (stringTokenizer.hasMoreTokens()) {
			String token = stringTokenizer.nextToken();
			System.out.println(token);
		}
	}

}
