package kaoshi2;
//employee��
public class employee extends person{                                                                                           //�޲ι��췽��
	protected String office;
	protected double salary;
	protected mydate datehire;
	public employee(){
		
	}
	public employee(String newname,String newadd,String newphoneno,String newmail,String newoffice,double newsalary,int y,int m,int d){
        //�вι��췽��
		super(newname,newadd,newphoneno,newmail);
		datehire=new mydate(y,m,d);
		office=newoffice;
		salary=newsalary;
		
	}
	public String toString() {                                       //����������Ϣ
		return super.toString()+"\n\n�칫�ص㣺"+ office+"\nнˮ��"+salary+"\n"+datehire.toString();
	}

}