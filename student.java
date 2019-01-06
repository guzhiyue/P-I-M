package kaoshi2;
//student类
public class student extends person{                              
	protected int classstatus;                                   //私有数据班级
	student(){                                                             //无参构造方法
		
	}
 public student(String newname,String newadd,String newphoneno,String newmail,int newclasstatus){  //有参构造方法

	 super(newname,newadd,newphoneno,newmail);
	 classstatus=newclasstatus;
	 
	}
 public String toString() {                                                                     //返回所有信息
		return super.toString()+"\n班级:"+classstatus+"\n";
 }
}
