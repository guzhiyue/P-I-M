package kaoshi2;

//faculty��
public class faculty extends employee{                                //
	private String officehours;                                       //�칫ʱ��˽��������
	private	int rank;                                                            //����������
	faculty(){                                                                                      //�޲ι��췽��
		
	}
	public faculty(String newname,String newadd,String newphoneno,String newmail,String newoffice,double newsalary,int y,int m,int d,String newofficehours,int newrank){
        //�вι��췽��
		super(newname,newadd,newphoneno,newmail,newoffice,newsalary,y,m,d);
		officehours=newofficehours;
		rank=newrank;
	}
	public String toString() {                                            //����������Ϣ
		return super.toString()+"\n�칫ʱ�䣺"+officehours+"\n����"+rank;
	}
}
