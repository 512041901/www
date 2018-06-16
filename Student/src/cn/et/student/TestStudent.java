package cn.et.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestStudent {
	public static void main(String[] args) {
		StudentImpl stu = new StudentImpl();
		List<Student> list = new ArrayList<Student>();
		System.out.println("欢迎进入学生系统");
		Scanner sc=  new Scanner(System.in);
		while(true) {
			System.out.println("1. 增加   2.删除   3.查询所有   4.查询一个   5.修改  6.查询所有同名的    0.退出");
			int num =sc.nextInt();
			if(num == 1) {
				int mark = stu.addStudent(list);
				 if(mark == 1) {
					 System.out.println("添加成功");
				 }else {
					 System.out.println("添加失败");
				 }
			}else if(num == 2) {
				int mark = stu.deleteStudent(list);
				if(mark == 1) {
					System.out.println("删除成功");
				}else {
					System.out.println("你要删除的学生不存在");
				}
				
			}else if(num == 3) {
				stu.queryAllStudent(list);
			}else if(num == 4) {
				stu.queryOneStudent(list);
			}else if(num == 5) {
				int mark = stu.updateStudent(list);
				if(mark ==1) {
					System.out.println("修改成功");
				}else {
					System.out.println("你要修改的学生不存在");
				}
			}else if(num == 6){
				stu.querAllStudentName(list);
			}else if(num == 0){
				System.out.println("退出成功");
				break;
			}
			
		}
	}
}
