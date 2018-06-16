package cn.et.student1;

import java.util.List;

import cn.et.student.Student;

public interface StudentService1 {
	
	/**
	 * 添加学生
	 * @param list 传入一个学生用来保存他
	 * @return 返回1 或者 -1  1代表添加成功 -1代表添加失败
	 */
	public int addStudent(List<Student1> list);
	
	/**
	 * 删除学生
	 * @param list 传入一个学生用来删除他
	 * @return 返回1或者-1  1代表删除成功  -1代表删除失败
	 */
	public int deleteStudent(List<Student1> list);
	
	/**
	 * 查询所有学生
	 * @param list 包括所有学生
	 */
	public void queryAllStudent(List<Student1> list);
	
	/**
	 * 查询一个学生
	 * @param list 包括一个学生
	 */
	public void queryOneStudent(List<Student1> list);
	
	/**
	 * 查询所有相同名字的学生
	 * @param list  包括所有同名的学生
	 */
	public void queryAllStudentName(List<Student1> list);
	
	/**
	 * 修改学生
	 * @param list 对象里传入要修改的学生姓名
	 * @return 返回1或者-1 返回1修改成功  -1修改失败
	 */
	public int updateStudent(List<Student1> list);
	
	/**
	 * 根据传入的id 判断学生是否存在    
	 * @param student 这个对象只包括一个id
	 * @param list 
	 * @return 返回1和-1 1 代表对象里有  -1 代表没有
	 */
	public int judgeStudentId(Student1 student, List<Student1> list);
	
	/**
	 * 根据传入的id 判断学生是否存在    
	 * @param student 这个对象只包括一个id
	 * @param list 
	 * @return 返回i和-1 i 代表对象里有  -1 代表没有
	 */
	public int judgeStudentName(Student1 student, List<Student1> list);
	/**
	 * 根据传入的姓名 判断学生是否存在    
	 * @param student 这个对象只包括一个姓名
	 * @param list 
	 * @return 你原本给我的student里面只包括了一个学生姓名 , 通过学生姓名查询出该学生的所有属性
	 * 			,我返回给你的student里面包括该学生的所有属性.
	 */
//	public Student1 judgeStudentName1(Student1 student, List<Student1> list);
	/**
	 * 根据传入的studentName 判断studentName是否存在
	 * @param studentName  传入的姓名
	 * @param list 
	 * @return 返回所有姓名包括studentName的学生
	 */
	public List<Student1> queryStudentName(String studentName, List<Student1> list);
	
}
