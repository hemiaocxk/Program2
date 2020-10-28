package course;
//主测试类
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t1=new Teacher(11, "李晓华", "女","教授");//初始化老师的值
		Teacher t2=new Teacher(14, "王刚", "男","副教授");
		Student s1=new Student(01, "坤坤", "男",18);//初始化学生的值
		Student s2=new Student(03, "小龙女", "女",20);
		Course c1=new Course(001, "哲学", "李晓华", "9:00", "教室301");//初始化课程的值
		Course c2=new Course(002, "离散数学", "王刚", "10:00", "教室201");
		t1.setCourse(c1);
		s1.setCourse(c1);
		t2.setCourse(c2);
		s2.setCourse(c2);
		if(s1.getCourse().getCourseId()==0){//如果课程编号为0，输出退课
			System.out.println("退课");
		}else{
			System.out.println(s1.toString());
			System.out.println(t1);
		}
		System.out.println(t2);
		System.out.println(s2);
		
	}

}
