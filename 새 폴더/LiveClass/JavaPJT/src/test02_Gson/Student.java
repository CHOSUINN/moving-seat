package test02_Gson;

public class Student {
	
	private String name;
	private int age;
	private String major;

	
	public Student(String name, int age, String major) {
		if (name == null || major == null) {
            throw new IllegalArgumentException("Name and major cannot be null");
        }
		this.name = name;
		this.age = age;
		this.major = major;
	}
	
	public String getName() {
		return name;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", major=" + major + "]";
	}
	
	
	
	
	
}
