package course;
//��������
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t1=new Teacher(11, "������", "Ů","����");//ʵ������ʦ��ֵ		
		Student s1=new Student(01, "����", "��",18);//ʵ����ѧ����ֵ	
		Course c1=new Course();//ʵ�����γ̵�ֵ	
		t1.setCourse(c1);
		s1.setCourse(c1);
		if(s1.getCourse().getCourseId()==0){//����γ̱��Ϊ0������˿�
			System.out.println("�˿�");
		}else{
			System.out.println(s1.toString());
			System.out.println(t1);
		}
		
		
	}

}
