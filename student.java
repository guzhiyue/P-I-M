package kaoshi2;
//student��
public class student extends person{                              
	protected int classstatus;                                   //˽�����ݰ༶
	student(){                                                             //�޲ι��췽��
		
	}
 public student(String newname,String newadd,String newphoneno,String newmail,int newclasstatus){  //�вι��췽��

	 super(newname,newadd,newphoneno,newmail);
	 classstatus=newclasstatus;
	 
	}
 public String toString() {                                                                     //����������Ϣ
		return super.toString()+"\n�༶:"+classstatus+"\n";
 }
}
