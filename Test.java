package course;
//��������
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t1=new Teacher(11, "������", "Ů","����");//��ʼ����ʦ��ֵ
		Teacher t2=new Teacher(14, "����", "��","������");
		Student s1=new Student(01, "����", "��",18);//��ʼ��ѧ����ֵ
		Student s2=new Student(03, "С��Ů", "Ů",20);
		Course c1=new Course(001, "��ѧ", "������", "9:00", "����301");//��ʼ���γ̵�ֵ
		Course c2=new Course(002, "��ɢ��ѧ", "����", "10:00", "����201");
		t1.setCourse(c1);
		s1.setCourse(c1);
		t2.setCourse(c2);
		s2.setCourse(c2);
		if(s1.getCourse().getCourseId()==0){//����γ̱��Ϊ0������˿�
			System.out.println("�˿�");
		}else{
			System.out.println(s1.toString());
			System.out.println(t1);
		}
		System.out.println(t2);
		System.out.println(s2);
		
	}

}
