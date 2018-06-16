package cn.et.student;

import java.util.ArrayList;
import java.util.List;
/**
 * 学生接口
 * @author Administrator
 *
 */
public interface StudentService {
	/**
	 * 添加学生
	 * @param student 传入一个学生用来保存他
	 * @return 返回1 或者-1 1是代表添加成功 -1 是代表添加失败
	 */
	public int addStudent(List<Student> list);
	
	/**
	 * 删除学生
	 * @param student 传入一个学生用来删除他
	 * @return 返回1 或者-1 1是代表删除成功 -1 是代表删除失败
	 */
	public int deleteStudent(List<Student> list);
	
	/**
	 * 查询所有学生
	 * @return List里面包括所有学生
	 */
	public void queryAllStudent(List<Student> list);
	
	/**
	 * 查询一个学生
	 * @param student 对象里只能传入一个id
	 * @return 返回与传入id匹配的那个学生
	 */
	public void queryOneStudent(List<Student> list);
	
	/**
	 * 查询所有相同的学生xingm
	 * @param list 
	 * @return 返回list里面所有相同的学生
	 */
	public void querAllStudentName(List<Student> list) ;
	
	/**
	 * 修改一个学生
	 * @param student 对象里传入要修改的学生id
	 * @return 返回1 或者-1 1是代表修改成功 -1 是代表修改失败
	 */
	public int updateStudent(List<Student> list);
	
	/**
	 * 判断传入的对象是否存在于List里
	 * @param student 这个对象里只包括一个id
	 * @return 返回1和-1 1 代表对象里有  -1 代表没有
	 */
	public int judgeStudent(Student student, List<Student> list);

	/**
	 * 判断传入的对象是否存在于List里
	 * @param student 这个对象里只包括一个姓名
	 * @param list
	 * @return 返回i和-1 i 代表对象里有  -1 代表没有
	 */
	public int judgeStudentName(Student student, List<Student> list);
	
	/**
	 * 判断传入的对象是否存在于List里
	 * @param student 这个对象里只包括一个姓名
	 * @param list
	 * @return 你原本给我的student里面只包括了一个学生姓名 , 通过学生姓名查询出该学生的所有属性
	 * 			,我返回给你的student里面包括该学生的所有属性.
	 */
	public Student judgeStudentName1(Student student, List<Student> list);
	
	/**
	 *  查询相同的姓名一共有多少个
	 * @param student 只包含一个姓名
	 * @return 返回的是一个整数,代表相同的姓名有多少个
	 */
	/*public int queryName(String newName , List<Student> list);*/
	
	
	/**
	 * 查询所有叫studentName的学生
	 * @param studentName 
	 * @param list
	 * @return 返回所有姓名包括studentName的学生;
	 */
	public List<Student> queryStudentName2(String studentName, List<Student> list);
}
