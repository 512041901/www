package cn.et.student;

import java.util.ArrayList;
import java.util.List;
/**
 * ѧ���ӿ�
 * @author Administrator
 *
 */
public interface StudentService {
	/**
	 * ���ѧ��
	 * @param student ����һ��ѧ������������
	 * @return ����1 ����-1 1�Ǵ�����ӳɹ� -1 �Ǵ������ʧ��
	 */
	public int addStudent(List<Student> list);
	
	/**
	 * ɾ��ѧ��
	 * @param student ����һ��ѧ������ɾ����
	 * @return ����1 ����-1 1�Ǵ���ɾ���ɹ� -1 �Ǵ���ɾ��ʧ��
	 */
	public int deleteStudent(List<Student> list);
	
	/**
	 * ��ѯ����ѧ��
	 * @return List�����������ѧ��
	 */
	public void queryAllStudent(List<Student> list);
	
	/**
	 * ��ѯһ��ѧ��
	 * @param student ������ֻ�ܴ���һ��id
	 * @return �����봫��idƥ����Ǹ�ѧ��
	 */
	public void queryOneStudent(List<Student> list);
	
	/**
	 * ��ѯ������ͬ��ѧ��xingm
	 * @param list 
	 * @return ����list����������ͬ��ѧ��
	 */
	public void querAllStudentName(List<Student> list) ;
	
	/**
	 * �޸�һ��ѧ��
	 * @param student �����ﴫ��Ҫ�޸ĵ�ѧ��id
	 * @return ����1 ����-1 1�Ǵ����޸ĳɹ� -1 �Ǵ����޸�ʧ��
	 */
	public int updateStudent(List<Student> list);
	
	/**
	 * �жϴ���Ķ����Ƿ������List��
	 * @param student ���������ֻ����һ��id
	 * @return ����1��-1 1 �����������  -1 ����û��
	 */
	public int judgeStudent(Student student, List<Student> list);

	/**
	 * �жϴ���Ķ����Ƿ������List��
	 * @param student ���������ֻ����һ������
	 * @param list
	 * @return ����i��-1 i �����������  -1 ����û��
	 */
	public int judgeStudentName(Student student, List<Student> list);
	
	/**
	 * �жϴ���Ķ����Ƿ������List��
	 * @param student ���������ֻ����һ������
	 * @param list
	 * @return ��ԭ�����ҵ�student����ֻ������һ��ѧ������ , ͨ��ѧ��������ѯ����ѧ������������
	 * 			,�ҷ��ظ����student���������ѧ������������.
	 */
	public Student judgeStudentName1(Student student, List<Student> list);
	
	/**
	 *  ��ѯ��ͬ������һ���ж��ٸ�
	 * @param student ֻ����һ������
	 * @return ���ص���һ������,������ͬ�������ж��ٸ�
	 */
	/*public int queryName(String newName , List<Student> list);*/
	
	
	/**
	 * ��ѯ���н�studentName��ѧ��
	 * @param studentName 
	 * @param list
	 * @return ����������������studentName��ѧ��;
	 */
	public List<Student> queryStudentName2(String studentName, List<Student> list);
}
