package kaoshi;
import java.util.Scanner;
//������
import kaoshi2.faculty;
import kaoshi2.staff;
import kaoshi2.student;
public class kaishi {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);                                          //����Scanner����
		student we1=new student(input.next(),input.next(),input.next(),input.next(),input.nextInt());            //����ѧ����Ϣ
		faculty we2=new faculty(input.next(),input.next(),input.next(),input.next(),input.next(),input.nextDouble(),input.nextInt(),input.nextInt(),input.nextInt(),input.next(),input.nextInt());
	//����Ա����Ϣ
		staff we=new staff(input.next(),input.next(),input.next(),input.next(), input.next(),input.nextDouble(),input.nextInt(),input.nextInt(),input.nextInt(),input.next());
		//����ְ����Ϣ
		System.out.println(we1.toString());
		//���we1��������Ϣ
		System.out.println(we2.toString());
//���we2��������Ϣ
System.out.println(we.toString());
//���we��������Ϣ

	}

}




















