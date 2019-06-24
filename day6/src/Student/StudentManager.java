package Student;

import java.awt.List;
import java.util.ArrayList;

import javax.print.attribute.standard.Sides;

/**
 * 学生管理类
 */
public class StudentManager implements Moth {
private ArrayList<Studenter> list=new ArrayList<>();

	@Override
	public boolean add(Total s) {
		if(s==null) {
			return false;
		}
		if(!list.contains(s.getId())) {
			list.add((Studenter) s);
			return true;
		}
		return false;
		
	}

	@Override
	public boolean revise(Total s) {
		Studenter stu=(Studenter) s;//强转为studenter
		for (Studenter s1 : list) {//遍历list
			if(null!=stu&& stu.getId()==s1.getId()) {
			s1.setName(stu.getName());
			s1.setAge(stu.getAge());
			s1.setSex(stu.getSex());
			return true;
			}
			}
		return false;
	}

	@Override
	public boolean delete(Total s) {
		if(list.contains(s)) {
			list.remove(s);
			return true;
		}
		return false;
	}
	/**
	 * 查询学生方法
	 */
	public Studenter Find(int id) {
		for (Studenter studenter : list) {
			if(studenter.getId()==id) {
				return studenter;
			}
		}
		return null;
	}
	
	/**
	 * 打印学生信息
	 */
	
	public void  All() {
		if(list.isEmpty()) {
			System.out.println("暂无信息");
		}else {
			System.out.println("学号\t"+"姓名\t"+"年龄\t"+"性别");
			for (Studenter studenter : list) {
				System.out.println(studenter.getId()+"\t"+studenter.getName()+'\t'+studenter.getAge()+'\t'+studenter.getSex());
		}
		
		}
		
	}
	
	
	











}



