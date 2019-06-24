package Student;

import java.util.ArrayList;

/**
 * 课程实现类
 */
public class Course extends Total {
	ArrayList<Studenter> coursestu;
	
	
/**
 * 封装方法
 * @return
 */
	public ArrayList<Studenter> getCoursestu() {
		return coursestu;
	}
	public void setCoursestu(ArrayList<Studenter> coursestu) {
		this.coursestu = coursestu;
	}



	public Course(int id, String name,ArrayList<Studenter> coursestu) {
		super(id, name);
		this. coursestu=coursestu;
	}

}
