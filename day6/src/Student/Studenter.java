package Student;
/**
 * 学生实现类
 */
public class Studenter extends Total {
	/**
	 * 私有属性
	 */
	private int age;
	private String sex;
	public int getAge() {
		return age;
	}
	/**
	 * 封装方法
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * 有参构造方法
	 */
	public Studenter(int id,String name, int age, String sex) {
		super(id,name);
		this.age = age;
		this.sex = sex;
	}
	
	
	
	

}
