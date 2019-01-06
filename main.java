package kaoshi;
import java.util.Scanner;
//测试类
import kaoshi2.faculty;
import kaoshi2.staff;
import kaoshi2.student;
public class kaishi {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);                                          //创建Scanner对象
		student we1=new student(input.next(),input.next(),input.next(),input.next(),input.nextInt());            //输入学生信息
		faculty we2=new faculty(input.next(),input.next(),input.next(),input.next(),input.next(),input.nextDouble(),input.nextInt(),input.nextInt(),input.nextInt(),input.next(),input.nextInt());
	//输入员工信息
		staff we=new staff(input.next(),input.next(),input.next(),input.next(), input.next(),input.nextDouble(),input.nextInt(),input.nextInt(),input.nextInt(),input.next());
		//输入职工信息
		System.out.println(we1.toString());
		//输出we1的所有信息
		System.out.println(we2.toString());
//输出we2的所有信息
System.out.println(we.toString());
//输出we的所有信息

	}

}




















