package course;

public class Teacher extends Person {
	
	private Course course;//教师所授课程
	private String title;//教师的职称
	
	//有参构造
	public Teacher(int id,String name,String sex,String title){
		super(id,name,sex);
		this.title=title;
	}
	//get(),set()方法
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
     //使用toString()输出教师信息
	public String toString() {
		return "老师信息："+super.toString()+",老师的职称："+title;
	}
	
	

}
