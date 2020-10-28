package course;

public class Person {
	//设置人的属性
	private int id;//人的编号
	private String name;//人的姓名
	private String sex;//人的性别
	
	//有参构造
	Person(int id,String name,String sex){
		super();
		this.id=id;
		this.name=name;
		this.sex=sex;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	public String toString() {     //toString()人的信息
		return "编号：" + id + ", 姓名：" + name + ", 性别：" + sex ;
	}
	

}
