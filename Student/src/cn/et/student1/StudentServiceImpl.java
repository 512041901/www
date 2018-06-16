package cn.et.student1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cn.et.student.Student;
import cn.et.student.StudentService;

public class StudentServiceImpl implements StudentService1 {
	Scanner sc = new Scanner(System.in);
	
	@Override
	public int addStudent(List<Student1> list) {
		System.out.println("��������Ҫ��ӵ�ѧ��id");
		int newId = sc.nextInt();
		Student1 student = new Student1();
		student.setId(newId);
		int mark = judgeStudentId(student, list);
		if(mark == -1) {
			System.out.println("��������Ҫ��ӵ�ѧ������");
			String newName = sc.next();
			List<Student1> lis = queryStudentName(newName, list);
			System.out.println("��������Ҫ��ӵ�ѧ���Ա�");
			String newSex = sc.next();
			System.out.println("��������Ҫ��ӵ�ѧ������");
			int newAge= sc.nextInt();
			Student1 newStudent = new Student1(newId, newName+lis.size(), newSex, newAge);
			list.add(newStudent);
			return 1;
		}
		
		return -1;
	}

	@Override
	public int deleteStudent(List<Student1> list) {
		System.out.println("��������Ҫɾ����ѧ��id");
		int newId = sc.nextInt();
		Student1 student = new Student1();
		student.setId(newId);
		int mark = judgeStudentId(student, list);
		if(mark == 1) {
			list.remove(mark);
			return 1;
		}
		return -1;
	}

	@Override
	public void queryAllStudent(List<Student1> list) {
		for(int i = 0;i<list.size();i++) {
			Student1 student =list.get(i);
			System.out.println(student.toString());
		}
		
	}

	@Override
	public void queryOneStudent(List<Student1> list) {
		System.out.println("��������Ҫ��ѯ������");
		String newName = sc.next();
		Student1 student =new Student1();
		student.setName(newName);
		int mark = judgeStudentName(student, list);
		if(mark != -1) {
			System.out.println(list.get(mark));
		}else {
			System.out.println("��Ҫ��ѯ��ѧ��������");
		}
		
	}

	@Override
	public void queryAllStudentName(List<Student1> list) {
		System.out.println("��������Ҫ��ѯ������");
		String newName = sc.next();
		for(int i = 0;i<list.size();i++) {
			if(list.get(i).getName().contains(newName)) {
				System.out.println(list.get(i).toString());
			}
		}
		
	}

	@Override
	public int updateStudent(List<Student1> list) {
		System.out.println("��������Ҫ�޸ĵ�ѧ������");
		String newName = sc.next();
		Student1 student = new Student1();
		student.setName(newName);
		int mark = judgeStudentName(student, list);
		if(mark != -1) {
			System.out.println("��������Ҫ�޸ĵ�������");
			String newName1 = sc.next();
			List<Student1> lis = queryStudentName(newName1, list);
			System.out.println("��������Ҫ�޸ĵ����Ա�");
			String newSex = sc.next();
			System.out.println("��������Ҫ�޸ĵ�������");
			int newAge= sc.nextInt();
			student.setName(newName1+lis.size());
			student.setSex(newSex);
			student.setAge(newAge);
			list.set(mark, student);
			return 1;
			
		}
		
		return -1;
	}

	@Override
	public int judgeStudentId(Student1 student, List<Student1> list) {
		int id = student.getId();
		for(int i = 0;i<list.size();i++) {
			if(id == list.get(i).getId()) {
				return 1;
			}
		}
		return -1;
	}

	public int judgeStudentName(Student1 student, List<Student1> list) {
		String name = student.getName();
		for(int i = 0;i<list.size();i++) {
			if(name.equals(list.get(i).getName()) ){
				return i;
			}
		}
		return  -1;
	}

	/*@Override
	public Student1 judgeStudentName1(Student1 student, List<Student1> list) {
		String name = student.getName();
		for(int i = 0;i<list.size();i++) {
			if(name.equals(list.get(i).getName()) ){
				student = list.get(i);
			}
		}
		return  student;
	}
*/
	@Override
	public List<Student1> queryStudentName(String studentName, List<Student1> list) {
		List<Student1> list1 = new ArrayList<>();
		for(int i = 0;i<list.size();i++) {
			if(list.get(i).getName().contains(studentName)) {
				list1.add(list.get(i));
			}
		}
		return list1;
	}
}



