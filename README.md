# Program2
Java作业仓库
# 阅读程序

## 一、实验目的
1. 分析学生选课系统的需求，从学生选课的角度了解系统中的实体及其关系，学会定义类中的属性及其方法；
2. 掌握类的继承用法，通过构造方法对对象进行实例化；
3. 学会使用super()方法，并应用于实例化子类；
4. 掌握Object根类的toString（）方法。

## 二、实验过程
1. 在包中分别创建了Course、Person、Student、Teacher和Test五个类，并满足以下要求：
- Person类中设置人的属性（编号、姓名、性别……）
- Student类和Teacher类作为子类要继承Person父类中的属性和方法；
- Teacher类中设置老师的属性（编号、姓名、性别、所授课程、……），每个老师只教授一门课程；
- Student类中设置学生的属性（编号、姓名、性别、所选课程、……），每名学生只选择一门课程；
- Courese类中设置课程的属性（编号、课程名称、上课地点、时间、授课教师、……）；
2. 完成附加要求：
- 除上述属性以外，可适当给对象添加新的属性
- 类的继承用法，通过构造方法实例化对象；
- 使用super()，用于实例化子类；
- 使用Object根类的toString（）方法,应用在相关对象的信息输出中。

## 三、核心代码
```
核心代码1：
   Teacher t1=new Teacher(11, "李晓华", "女","教授");//实例化老师的值
   Student s1=new Student(01, "坤坤", "男",18);//实例化学生的值
   Course c1=new Course(001, "哲学", "李晓华", "9:00", "教室301");//实例化课程的值
   t1.setCourse(c1);
   s1.setCourse(c1);
   System.out.println(s1.toString());
			System.out.println(t1);
```

```
核心代码2：
if(s1.getCourse().getCourseId()==0){//如果课程编号为0，输出退课
			System.out.println("退课");
		}else{
			System.out.println(s1.toString());
			System.out.println(t1);
		}
```
## 四、实验结果
![RUNOOB 图标](https://p.qlogo.cn/qqmail_head/fTW3oLibWre2icgHmMng0BEl2Oia3O6E8xxKrDyFyyvyMHK1u1dtov8sAXQ6gzibic6Nb6exiae4b8nzc/0)
![RUNOOB 图标](https://p.qlogo.cn/qqmail_head/fTW3oLibWre2icgHmMng0BEl2Oia3O6E8xxKrDyFyyvyMFl97aic3ibMS3k51Sco1b1MiaScJaBicydvOs/0)

## 五、实验感想
通过这次实验，我掌握了类的继承方法、使用super()对子类进行实例化以及toString（）的输出方法，但是学生的退课功能还不够完善，日后会加以改进。
