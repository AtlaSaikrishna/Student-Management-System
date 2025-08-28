package student_management_system;

public class Student {
	
	private int id;
	private String name;
	private String course;
	private int age;
	
	public Student(int id, String name, String course, int age) {
		this.id = id;
		this.name = name;
		this.course = course;
		this.age = age;
	}
	
	public Student(String name, String course, int age) {
		this.name = name;
		this.course = course;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public String getCourse() {
		return course;
	}

	public int getAge() {
		return age;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
