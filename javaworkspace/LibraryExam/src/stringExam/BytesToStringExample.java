package stringExam;

import java.util.Arrays;

public class BytesToStringExample {

	public static void main(String[] args) {
		String data = "ÀÚ¹Ù";

		byte[] arr1 = data.getBytes();
		System.out.println("arr1:" + Arrays.toString(arr1));
		
		String str1 = new String(arr1);
		System.out.println("str1: " + str1);
		try {
			byte[] arr2 = data.getBytes("EUC-KR");
			System.out.println("arr2: " + Arrays.toString(arr2));
			
			String str2 = new String(arr2, "EUC-KR");
			System.out.println("str2: " + str2);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
