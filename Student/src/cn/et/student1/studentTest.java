package cn.et.student1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class studentTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student1> list = new ArrayList<Student1>();
		StudentServiceImpl stu = new StudentServiceImpl(); 
		System.out.println("       欢迎进入学生系统              ");
		while(true) {
			System.out.println("请选择: 1.添加   2.删除  3.查询所有    4. 查询一个学生   5.查询相同姓名的   6.修改  0.退出");
			int mark = sc.nextInt();
			if(mark == 1) {
				int add =stu.addStudent(list);
				if(add == -1) {
					System.out.println("添加失败");
				}else {
					System.out.println("添加成功");
				}
			}else if(mark == 2) {
				int delete = stu.deleteStudent(list);
				if(delete ==1) {
					System.out.println("删除成功");
				}else {
					System.out.println("删除的学生不存在");
				}
			}else if(mark == 3) {
				stu.queryAllStudent(list);
			}else if(mark == 4) {
				stu.queryOneStudent(list);
			}else if(mark == 5) {
				stu.queryAllStudentName(list);
			}else if(mark == 6) {
				int update = stu.updateStudent(list);
				if(update == 1) {
					System.out.println("修改成功");
				}else {
					System.out.println(" 修改失败 ,没有此学生");
				}
			}else if(mark == 0) {
				System.out.println("退出系统成功");
				break;
			}
		}
	}
}
