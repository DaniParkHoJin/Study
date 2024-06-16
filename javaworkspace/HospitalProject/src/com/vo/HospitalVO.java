package com.vo;

public class HospitalVO {
	private String category; // 종별
	private String hostpitalName; // 요양기관명
	private String stateCode; // 시도코드명
	private String cityCode; // 시군구코드명
	private String address; // 주소
	private String phone; // 전화번호
	private String site; // 홈페이지 주소
	private String openData; // 개설일
	private int doctorCount; // 총 의사 수
	// 기본 생성자
	public HospitalVO() {
		super();
	}
	// 모든 필드를 받는 생성자
	public HospitalVO(String category, String hostpitalName, String stateCode, String cityCode, String address,
			String phone, String site, String openData, int doctorCount) {
		super();
		this.category = category;
		this.hostpitalName = hostpitalName;
		this.stateCode = stateCode;
		this.cityCode = cityCode;
		this.address = address;
		this.phone = phone;
		this.site = site;
		this.openData = openData;
		this.doctorCount = doctorCount;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getHostpitalName() {
		return hostpitalName;
	}
	public void setHostpitalName(String hostpitalName) {
		this.hostpitalName = hostpitalName;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getOpenData() {
		return openData;
	}
	public void setOpenData(String openData) {
		this.openData = openData;
	}
	public int getDoctorCount() {
		return doctorCount;
	}
	public void setDoctorCount(int doctorCount) {
		this.doctorCount = doctorCount;
	}
	@Override
	public String toString() {
		return "HospitalVO [category=" + category + ", hostpitalName=" + hostpitalName + ", stateCode=" + stateCode
				+ ", cityCode=" + cityCode + ", address=" + address + ", phone=" + phone + ", site=" + site
				+ ", openData=" + openData + ", doctorCount=" + doctorCount + "]";
	}
	
	
	
	
	
	
}
