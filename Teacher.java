package course;

public class Teacher extends Person {
	
	private Course course;//��ʦ���ڿγ�
	private String title;//��ʦ��ְ��
	
	//�вι���
	public Teacher(int id,String name,String sex,String title){
		super(id,name,sex);
		this.title=title;
	}
	//get(),set()����
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
	
     //ʹ��toString()�����ʦ��Ϣ
	public String toString() {
		return "��ʦ��Ϣ��"+super.toString()+",��ʦ��ְ�ƣ�"+title;
	}
	
	

}
