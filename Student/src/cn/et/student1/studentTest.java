package cn.et.student1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class studentTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student1> list = new ArrayList<Student1>();
		StudentServiceImpl stu = new StudentServiceImpl(); 
		System.out.println("       ��ӭ����ѧ��ϵͳ              ");
		while(true) {
			System.out.println("��ѡ��: 1.���   2.ɾ��  3.��ѯ����    4. ��ѯһ��ѧ��   5.��ѯ��ͬ������   6.�޸�  0.�˳�");
			int mark = sc.nextInt();
			if(mark == 1) {
				int add =stu.addStudent(list);
				if(add == -1) {
					System.out.println("���ʧ��");
				}else {
					System.out.println("��ӳɹ�");
				}
			}else if(mark == 2) {
				int delete = stu.deleteStudent(list);
				if(delete ==1) {
					System.out.println("ɾ���ɹ�");
				}else {
					System.out.println("ɾ����ѧ��������");
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
					System.out.println("�޸ĳɹ�");
				}else {
					System.out.println(" �޸�ʧ�� ,û�д�ѧ��");
				}
			}else if(mark == 0) {
				System.out.println("�˳�ϵͳ�ɹ�");
				break;
			}
		}
	}
}
