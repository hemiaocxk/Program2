package course;

public class Course {
	private String courseName;//�γ�����
	private int courseId;//�γ̱��
	private String teacher;//�ڿ���ʦ
	private String time;//�γ�ʱ��
	private String place;//�γ̵ص�
	//�޲ι���
	public Course(){
		super();
	}
	//�вι���
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
	
     //toString() �γ���Ϣ
	public String toString() {
		return "\nѧ����ѡ�γ̣�[" +"�γ����ƣ�"+ courseName + ", �γ̱�ţ�" + courseId
				+ ",�ڿ���ʦ��" + teacher + ",�γ�ʱ�䣺" + time + ", �γ̵ص㣺"
				+ place + "]";
	}
	

}
