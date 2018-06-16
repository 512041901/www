package cn.et.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentImpl implements StudentService {
	Scanner sc = new Scanner(System.in);
	@Override
	public int addStudent(List<Student> list) {
		System.out.println("请输入你要添加的学生id");
		long newId = sc.nextLong();
		Student student = new Student();
		student.setId(newId);
		int mark = judgeStudent(student,list);
		if(mark == -1) {
			System.out.println("请输入你要添加的学生姓名");
			String newName = sc.next();
			System.out.println("请输入你要添加的学生性别");
			String newSex = sc.next();
			System.out.println("请输入你要添加的学生年龄");
			int newAge = sc.nextInt();
			Student newStudent = new Student(newId, newName, newSex, newAge);
			list.add(newStudent);
			return 1;
		}
		return -1;
		
	}

	@Override
	public int deleteStudent(List<Student> list) {
		System.out.println("请输入你删除的学生id");
		long deleteId = sc.nextLong();
		Student student = new Student();
		student.setId(deleteId); 
		int mark = judgeStudent(student, list);
		if(mark == 1){
			list.remove(mark);
			return 1;
		}
		return -1;
	}

	@Override
	public void queryAllStudent(List<Student> list) {
		for(int i = 0;i<list.size();i++) {
			Student student = list.get(i);
			System.out.println(student);
		}
		
	}

	@Override
	public void queryOneStudent(List<Student> list) {
		System.out.println("请输入你要查询的学生姓名");
		String newName = sc.next();
		Student student = new Student();
		student.setName(newName);
		int mark = judgeStudentName(student, list);
		if(mark != -1) {
			System.out.println(list.get(mark));
		}else {
			System.out.println("你要查询的学生不存在");
		}
		
		
		
	}
	
	@Override
	public void querAllStudentName(List<Student> list) {
		List<Student> studentList = new ArrayList<Student>();
		System.out.println("请输入你要查询的姓名");
		String name = sc.next();
		studentList = queryStudentName2(name , list);
		for(int i=0;i<studentList.size();i++) {
			System.out.println(studentList.get(i).toString());
		}
		
	}

	@Override
	public int updateStudent(List<Student> list) {
		System.out.println("请输入你要修改的学生姓名");
		String name = sc.next();
		Student student = new Student();
		student.setName(name);
		int mark = judgeStudentName(student, list);
		student =judgeStudentName1(student, list);
		if(student.getSex()!= null) {
			System.out.println("请输入新的姓名");
			String newName = sc.next();
			List<Student> li = queryStudentName2(newName, list);
			System.out.println("请输入新的性别");
			String newSex = sc.next();
			System.out.println("请输入新的年龄");
			int newAge = sc.nextInt();
			student.setName(newName+li.size());
			student.setSex(newSex);
			student.setAge(newAge);
			list.set(mark , student);
			return 1;
		}
		return -1;
	}

	@Override
	public int judgeStudent(Student student, List<Student> list) {
		long id = student.getId();
		for(int i = 0;i<list.size();i++) {
			if(id == list.get(i).getId()) {
				return 1;
			}
		}
		
		return -1;
	}

	@Override
	public int judgeStudentName(Student student, List<Student> list) {
		String name = student.getName();
		for(int i = 0;i<list.size();i++) {
			if(name.equals(list.get(i).getName())) {
				return i;
			}
		}
		return -1;
	}
	
	@Override
	public Student judgeStudentName1(Student student, List<Student> list) {
		String name = student.getName();
		for(int i = 0;i<list.size();i++) {
			if(name.equals(list.get(i).getName())) {
				student = list.get(i);
			}
		}
		return student;
	}

/*	@Override
	public int queryName(String newName , List <Student> list) {
		System.out.println("查找叫 "+newName+" 的有多少个");
		int mark = 0;
		for(int i = 0;i<list.size();i++) {
			if(list.get(i).getName().indexOf(newName) != -1) {
				System.out.println("有一个叫  "+list.get(i).getName());
				mark++;
				System.out.println("目前查找到同名的有 "+mark);
			}
		}
		return mark;
	}*/

	@Override
	public List<Student> queryStudentName2(String studentName, List<Student> list) {
		List <Student> list1 = new ArrayList<Student>();
		for(int i = 0;i<list.size();i++) {
			if(list.get(i).getName().contains(studentName)) {
				list1.add(list.get(i));
			}
		}
		return list1;
	}

	

	
}
