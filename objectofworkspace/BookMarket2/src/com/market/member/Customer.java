package com.market.member;

public class Customer {
	private String name; // 고객 이름
	private String phone; // 연락처
	private String address; // 주소
	
	// 기본생성자
	public Customer() {
	}
	// 필드를 고객 이름과 연락처만 포함하는 생성자
	public Customer(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	// 필드(고객 이름, 연락처, 주소)를 모두 받는 생성자
	public Customer(String name, String phone, String address) {
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
