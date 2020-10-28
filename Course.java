package course;

public class Course {
	private String courseName;//课程名称
	private int courseId;//课程编号
	private String teacher;//授课老师
	private String time;//课程时间
	private String place;//课程地点
	//无参构造
	public Course(){
		super();
	}
	//有参构造
	public Course(int courseId,String courseName,String teacher,
			String time,String place){
		   super();
		   this.courseId=courseId;
		   this.courseName=courseName;
		   this.teacher=teacher;
		   this.time=time;
		   this.place=place;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	
     //toString() 课程信息
	public String toString() {
		return "\n学生所选课程：[" +"课程名称："+ courseName + ", 课程编号：" + courseId
				+ ",授课老师：" + teacher + ",课程时间：" + time + ", 课程地点："
				+ place + "]";
	}
	

}
