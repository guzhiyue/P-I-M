package kaoshi2;
//mydate类
public class mydate{
	int year;                                                                                                  //私有数据年
	int month;                                                                                              //私有数据月
	int day;                                                                                                    //私有数据天
	public mydate(){                                                                                               //无参构造方法
		
	}
	
	public mydate(int newyear,int newmonth,int newday){                     //有参构造方法
		year=newyear;
		month=newmonth;
		day=newday;
	}
	public String toString(){                                                                    //返回所有信息方法
		return "雇佣日期："+year+"年"+month+"月"+day+"日";
	} 
}