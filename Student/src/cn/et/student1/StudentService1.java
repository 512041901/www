package cn.et.student1;

import java.util.List;

import cn.et.student.Student;

public interface StudentService1 {
	
	/**
	 * ���ѧ��
	 * @param list ����һ��ѧ������������
	 * @return ����1 ���� -1  1������ӳɹ� -1�������ʧ��
	 */
	public int addStudent(List<Student1> list);
	
	/**
	 * ɾ��ѧ��
	 * @param list ����һ��ѧ������ɾ����
	 * @return ����1����-1  1����ɾ���ɹ�  -1����ɾ��ʧ��
	 */
	public int deleteStudent(List<Student1> list);
	
	/**
	 * ��ѯ����ѧ��
	 * @param list ��������ѧ��
	 */
	public void queryAllStudent(List<Student1> list);
	
	/**
	 * ��ѯһ��ѧ��
	 * @param list ����һ��ѧ��
	 */
	public void queryOneStudent(List<Student1> list);
	
	/**
	 * ��ѯ������ͬ���ֵ�ѧ��
	 * @param list  ��������ͬ����ѧ��
	 */
	public void queryAllStudentName(List<Student1> list);
	
	/**
	 * �޸�ѧ��
	 * @param list �����ﴫ��Ҫ�޸ĵ�ѧ������
	 * @return ����1����-1 ����1�޸ĳɹ�  -1�޸�ʧ��
	 */
	public int updateStudent(List<Student1> list);
	
	/**
	 * ���ݴ����id �ж�ѧ���Ƿ����    
	 * @param student �������ֻ����һ��id
	 * @param list 
	 * @return ����1��-1 1 �����������  -1 ����û��
	 */
	public int judgeStudentId(Student1 student, List<Student1> list);
	
	/**
	 * ���ݴ����id �ж�ѧ���Ƿ����    
	 * @param student �������ֻ����һ��id
	 * @param list 
	 * @return ����i��-1 i �����������  -1 ����û��
	 */
	public int judgeStudentName(Student1 student, List<Student1> list);
	/**
	 * ���ݴ�������� �ж�ѧ���Ƿ����    
	 * @param student �������ֻ����һ������
	 * @param list 
	 * @return ��ԭ�����ҵ�student����ֻ������һ��ѧ������ , ͨ��ѧ��������ѯ����ѧ������������
	 * 			,�ҷ��ظ����student���������ѧ������������.
	 */
//	public Student1 judgeStudentName1(Student1 student, List<Student1> list);
	/**
	 * ���ݴ����studentName �ж�studentName�Ƿ����
	 * @param studentName  ���������
	 * @param list 
	 * @return ����������������studentName��ѧ��
	 */
	public List<Student1> queryStudentName(String studentName, List<Student1> list);
	
}
