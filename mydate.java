package kaoshi2;
//mydate��
public class mydate{
	int year;                                                                                                  //˽��������
	int month;                                                                                              //˽��������
	int day;                                                                                                    //˽��������
	public mydate(){                                                                                               //�޲ι��췽��
		
	}
	
	public mydate(int newyear,int newmonth,int newday){                     //�вι��췽��
		year=newyear;
		month=newmonth;
		day=newday;
	}
	public String toString(){                                                                    //����������Ϣ����
		return "��Ӷ���ڣ�"+year+"��"+month+"��"+day+"��";
	} 
}