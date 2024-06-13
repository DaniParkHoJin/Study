import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ApiExplorer {
	public static void main(String[] args) {

		new ApiExplorer().run();
	}

	private void run() {
		// 1. ��û url ����
		StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/1352000/ODMS_COVID_04/callCovid04Api");
		try {
			urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8")
					+ "%2FbQ4d4YMqX00jlW0jmrehzDIs4RMmzDXhqx9qJUhZ1t2kTm%2BmvMbC%2B3IqRHcSdud%2BFmX%2B32F1bccyCOHC7YrYA%3D%3D");

			urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); // ������
																													// ��ȣ

			urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); // ��
																														// ������
																														// ���
																														// ��

			// urlBuilder.append("&" + URLEncoder.encode("startCreateDt", "UTF-8") + "=" +
			// URLEncoder.encode("20221124","UTF-8")); // �˻��� ������ ������ ����

			urlBuilder.append(
					"&" + URLEncoder.encode("std_day", "UTF-8") + "=" + URLEncoder.encode("2022-11-24", "UTF-8")); // �˻���
			// ������
			// ������
			// ����

			// urlBuilder.append("&" + URLEncoder.encode("endCreateDt", "UTF-8") + "=" +
			// URLEncoder.encode("20221124", "UTF-8"));// �˻��� ������ ������ ����

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		// 2. connection ��ü ����
		URL url = null;
		HttpURLConnection conn = null;
		try {
			url = new URL(urlBuilder.toString());
			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("content-type", "application/json");
			System.out.println("Response code: " + conn.getResponseCode());

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 3. ��û ���� �� ���� ó��
		BufferedReader br = null;
		try {
			int statusCode = conn.getResponseCode();
			System.out.println(statusCode);
			if (statusCode >= 200 && statusCode <= 300) {
				br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			} else {
				br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
			Document doc = parseXML(conn.getInputStream());
			// a. item �±� ��ü ������� �����´�.
			NodeList descNodes = doc.getElementsByTagName("item");
			// b. Conona19Data List ��ü ����
			List<Corona19Data> list = new ArrayList<>();
			// c. �� item �±��� �ڽ� �±׿��� ���� ��������
			for (int i = 0; i < descNodes.getLength(); i++) {
				// item
				Node item = descNodes.item(i);
				Corona19Data data = new Corona19Data();
				// item �ڽ� �±׿� ���������� ����
				for (Node node = item.getFirstChild(); node != null;
						node = node.getNextSibling()) {
					System.out.println(node.getNodeName() + " : " + node.getTextContent());
					switch (node.getNodeName()) {
					case "resultCode":
						data.setResultCode(Integer.parseInt(node.getTextContent()));
						break;
					case "resultMsg":
						data.setResultMsg(node.getTextContent());
						break;
					case "numOfRows":
						data.setNumOfRows(Integer.parseInt(node.getTextContent()));
						break;
					case "pageNo":
						data.setPageNo(Integer.parseInt(node.getTextContent()));
						break;
					case "gubun":
						data.setGubun(node.getTextContent());
						break;
					case "gubunCn":
						data.setGubunCn(node.getTextContent());
						break;
					case "gubunEn":
						data.setGubunEn(node.getTextContent());
						break;
					case "incDec":
						data.setIncDec(Integer.parseInt(node.getTextContent()));
						break;
					case "isolClearCnt":
						data.setIsolClearCnt(Integer.parseInt(node.getTextContent()));
						break;
					case "overFlowCnt":
						data.setOverFlowCnt(Integer.parseInt(node.getTextContent()));
						break;
					case "qurRate":
						data.setQurRate(node.getTextContent());
						break;
					case "stdDay":
						data.setStdDay(node.getTextContent());
						break;
					}
				}
				// d. List ��ü�� �߰�
				list.add(data);
			}
			// e. ����Ȯ��
			for (Corona19Data d : list) {
				System.out.println(d);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// 4. �ڿ���ȯ
		conn.disconnect();
	}

	private Document parseXML(InputStream stream) {
		DocumentBuilderFactory objDocumentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder objDocumentBuilder = null;
		Document doc = null;
		try {
			objDocumentBuilder = objDocumentBuilderFactory.newDocumentBuilder();
			doc = objDocumentBuilder.parse(stream);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
		}
		return doc;

	}
}