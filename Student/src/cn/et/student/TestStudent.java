package cn.et.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestStudent {
	public static void main(String[] args) {
		StudentImpl stu = new StudentImpl();
		List<Student> list = new ArrayList<Student>();
		System.out.println("��ӭ����ѧ��ϵͳ");
		Scanner sc=  new Scanner(System.in);
		while(true) {
			System.out.println("1. ����   2.ɾ��   3.��ѯ����   4.��ѯһ��   5.�޸�  6.��ѯ����ͬ����    0.�˳�");
			int num =sc.nextInt();
			if(num == 1) {
				int mark = stu.addStudent(list);
				 if(mark == 1) {
					 System.out.println("��ӳɹ�");
				 }else {
					 System.out.println("���ʧ��");
				 }
			}else if(num == 2) {
				int mark = stu.deleteStudent(list);
				if(mark == 1) {
					System.out.println("ɾ���ɹ�");
				}else {
					System.out.println("��Ҫɾ����ѧ��������");
				}
				
			}else if(num == 3) {
				stu.queryAllStudent(list);
			}else if(num == 4) {
				stu.queryOneStudent(list);
			}else if(num == 5) {
				int mark = stu.updateStudent(list);
				if(mark ==1) {
					System.out.println("�޸ĳɹ�");
				}else {
					System.out.println("��Ҫ�޸ĵ�ѧ��������");
				}
			}else if(num == 6){
				stu.querAllStudentName(list);
			}else if(num == 0){
				System.out.println("�˳��ɹ�");
				break;
			}
			
		}
	}
}
