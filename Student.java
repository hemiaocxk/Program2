package course;

public class Student extends Person {
	
	private Course course;//学生所选课程
	private int age;//学生年龄
	
	//有参构造
	public Student(int id,String name,String sex,int age){
		super(id,name,sex);
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	//toString()输出学生信息
	public String toString() {
		return "学生："+super.toString()+",年龄："+age;
	}
	
	

}
