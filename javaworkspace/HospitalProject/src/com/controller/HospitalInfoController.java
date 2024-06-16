package com.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.vo.HospitalVO;

public class HospitalInfoController {
	private List<HospitalVO> list = new ArrayList<>();

	public void inputData() {
		// CSV 파일 불러오기
		File data = new File("hospitaldata.csv");

		StringBuffer sb = new StringBuffer();
		// 문자열로 저장되어 있어 Reader를 이용하고 받아도는 속도를 향상하기 위해 BufferedReader 보조 스트림을 사용함.
		// 각 데이터를 라인별로 받아서 StringBuffer에 저장하여 관리함.

		try (BufferedReader breader = new BufferedReader(new FileReader(data));) {
			String ch = "";
			while ((ch = breader.readLine()) != null) {
				sb.append(ch + "\n"); // csv에서 받아온 파일을 StringBuffer에 저장
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] datas = sb.toString().split("\n");// 버퍼에 저장된 내용을 라인 별로 나눠 배열로 저장
		for (String d : datas) {
			String[] detail = d.split(","); // 항목별(콤마, 로 구분)으로 다시 배열로 저장하여 데이터 불러오기

			int count = 0;
			try {
				count = Integer.parseInt(detail[16]);
			} catch (NumberFormatException e) {
			}
			// 모든 항목 데이터가 배열로 대입이 되어 있어, 배열의 인덱스로 해당하는 자료를 대입하는 구문
			list.add(new HospitalVO(detail[3], detail[1], detail[5], detail[7], detail[10], detail[11], detail[12],
					detail[13], count));
		}
		list.remove(0); // 항목명 부분 삭제
	}
	
	public void printHospitalData() {
		System.out.println("종류\t" + "병원명\t\t\t\t" + "시도명\t\t" + "시군구명\t\t" + "주소\t\t\t\t\t" + "전화번호\t\t" + "홈페이지주소\t\t" + "개설일\t" + "총의사수");
		for (HospitalVO h : list) {
			if (h.getCategory().equals("종합병원")) {
				System.out.printf("%-5s %-30s %-10s %-10s %-30s %10s %-40s %-20s %-4d\n" ,h.getCategory(), h.getHostpitalName(), h.getStateCode(), h.getCityCode(), h.getAddress(), h.getPhone(), h.getSite(), h.getOpenData(), h.getDoctorCount());
			}
		}
	}
}
