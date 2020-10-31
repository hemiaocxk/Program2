package course;
//主测试类
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t1=new Teacher(11, "李晓华", "女","教授");//实例化老师的值		
		Student s1=new Student(01, "坤坤", "男",18);//实例化学生的值	
		Course c1=new Course();//实例化课程的值	
		t1.setCourse(c1);
		s1.setCourse(c1);
		if(s1.getCourse().getCourseId()==0){//如果课程编号为0，输出退课
			System.out.println("退课");
		}else{
			System.out.println(s1.toString());
			System.out.println(t1);
		}
		
		
	}

}
