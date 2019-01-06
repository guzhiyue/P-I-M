package kaoshi2;

//faculty类
public class faculty extends employee{                                //
	private String officehours;                                       //办公时间私有数据域
	private	int rank;                                                            //级别数据域
	faculty(){                                                                                      //无参构造方法
		
	}
	public faculty(String newname,String newadd,String newphoneno,String newmail,String newoffice,double newsalary,int y,int m,int d,String newofficehours,int newrank){
        //有参构造方法
		super(newname,newadd,newphoneno,newmail,newoffice,newsalary,y,m,d);
		officehours=newofficehours;
		rank=newrank;
	}
	public String toString() {                                            //返回所有信息
		return super.toString()+"\n办公时间："+officehours+"\n级别："+rank;
	}
}
