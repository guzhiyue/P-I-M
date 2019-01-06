package kaoshi2;
//employee类
public class employee extends person{                                                                                           //无参构造方法
	protected String office;
	protected double salary;
	protected mydate datehire;
	public employee(){
		
	}
	public employee(String newname,String newadd,String newphoneno,String newmail,String newoffice,double newsalary,int y,int m,int d){
        //有参构造方法
		super(newname,newadd,newphoneno,newmail);
		datehire=new mydate(y,m,d);
		office=newoffice;
		salary=newsalary;
		
	}
	public String toString() {                                       //返回所有信息
		return super.toString()+"\n\n办公地点："+ office+"\n薪水："+salary+"\n"+datehire.toString();
	}

}