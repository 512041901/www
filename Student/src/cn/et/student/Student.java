package cn.et.student;

public class Student {
	private long id;
	private String name;
	private String sex;
	private int age;
	
	public Student(long id, String name, String sex, int age) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	/**
	 * 作者是一个构造函数?
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	
	
}
