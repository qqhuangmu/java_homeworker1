package Student;

import java.awt.List;
import java.util.ArrayList;

public class Test {
	private static final char[] Studenter1 = null;

	public static void main(String[] args) {
		StudentManager stu = new StudentManager();

		Test test = new Test();

		// boolean add = stu.add(new Studenter(1122, "张三", 20, "男"));

		int id = 1122;
		StudentManager stu2 = stu;
		boolean add1 = stu2.add(new Studenter(id, "李四", 23, "男"));
		if (add1) {
			System.out.println("添加成功");

		} else {
			System.out.println("添加失败");
		}

		// boolean revise = stu.revise(new Studenter(1123, "liwu", 30, "nan"));
		// if(revise) {
		// System.out.println("修改成功");
		// }else {
		// System.out.println("修改失败");
		// }

		// boolean delete = stu.delete(new Studenter(1122, "李四", 23, "男"));
		// if(delete) {
		// System.out.println("删除成功");
		// }else {
		// System.out.println("删除失败");
		// }
		stu2.All();

		Studenter find = stu2.Find(1122);
		if(null==find) {
			System.out.println("暂无该学生");
		}
		System.out.println(find.getId()+find.getName()+find.getAge()+find.getSex());
	}

}
