package course;

public class Student extends Person {
	
	private Course course;//ѧ����ѡ�γ�
	private int age;//ѧ������
	
	//�вι���
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
	//toString()���ѧ����Ϣ
	public String toString() {
		return "ѧ����"+super.toString()+",���䣺"+age;
	}
	
	

}
