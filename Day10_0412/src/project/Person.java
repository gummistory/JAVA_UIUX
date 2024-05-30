package project;

public class Person implements BookAv {
	
	String name;
	String phone;
	String title;
	
	
	public Person(String name, String phone, String title) {
		super();
		this.name = name;
		this.phone = phone;
		this.title = title;
	}

	void show() {
		System.out.println("대여자 이름 : " + name);
		System.out.println("연락처 : " + phone);
		System.out.println("책 제목 : " + title);
	}

}
