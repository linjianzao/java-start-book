import java.io.Console;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Date;
/**
* 基础知识
* @author linjianzao
* @Time   2017-03-06
*/

public class base {
	public static void main (String[] agrs){
		System.out.println("hello world");//输出
		new base().dataType();//数据类型
		new base().operator();//运算符
		new base().conversion();//类型转换
		//new base().inputOutput();//输入输出
		new base().fileInputOutput();//文件输入输出
		new base().ifProcess(); // if
		new base().whileProcess();// while
		new base().doWhileProcess();// do while
		new base().forProcess();// for
		new base().forEachProcess();// for each
		new base().switchProcess();// switch
		new base().array();// 数组
		
		
		
		
		
	}
	
	/**
	  * 枚举类型enum
	  * 需要定义一个有返回值的public函数
	 */
	public enum eEnum {
		S(1), 
		M(2), 
		L(3), 
		X(4); 
		
		private final int value;
	    // 构造器默认也只能是private, 从而保证构造函数只能在内部使用
		eEnum(int value) {
	        this.value = value;
	    }

	    public int getValue() {
	        return value;
	    }
		
	};
	
	 /**
	   * byte short int long
	   * float double
	   * char
	   * String
	   * boolean
	   * enum
	 */
	public void dataType(){
		//整型: byte(8位) short(16位) int(32位) long(64位) 
		byte bByte = 1;   //范围:-128 ~ 127
		short sShort = 2; //范围:-32768 ~ 32767
		int iInt = 3;     //范围:-2 147 483 648 ~ -2 147 483 647
		long lLong = 4;   //范围:-9 223 372 036 854 775 808 ~ -9 223 372 036 854 775 807
		
		//浮点型
		float fFloat = 3.14F;
		double dDouble = 3.14D;
		
		//字符类型 16位
		char cChar = 'A'; //字母A
		char x = 97;      //字母a的 Unicode编码, x=a
		
		//字符串类型
		String sString = "Hello";
		String sSub = sString.substring(0,3);//字符串截取
		String addSub = "PG" + 13;
		String sHelp = sString.substring(0,3) + "p!";
		boolean bEquals = sString.equals(addSub); //使用equals比较字符串.不要使用==，等于号更多用于比较引用地址
		boolean sCon = sString == "Hello"; //true
		boolean sConHelp = sHelp == "Hello"; //false
		
		int sStringLength = sString.length(); //字符串长度
		//字符串的uniCode实际长度，uniCode有些字符会使用辅助字符来表示，使用length该字符会算成2. 使用codePointCount就会算出实际长度.
		int sStringCodePoint = sString.codePointCount(0,sStringLength); 
		
		String strEmpty = "";
		boolean isEmpty = strEmpty.length() == 0;//判断字符串是否为空
		strEmpty.equals("");//判断字符串是否为空
		
		String strNull = null;
		boolean isNull = strNull==null; //判断字符串是否为NULL
		boolean isNotNullAndEmpty = (strEmpty != null && strEmpty.length() != 0); //判断字符串即不是null 也不是空
		
		//格式化字符串
		String formatName = "fool";
		int formatAge = 1;
		String sFormat = String.format("Hello,%s. you will be %d",formatName,formatAge);
		
		//构建字符串,性能比较好
		StringBuilder builder = new StringBuilder();
		builder.append("ch");
		builder.append("at");
		String completedString = builder.toString();
		
		//boolean类型
		boolean bTrue = true;
		boolean bFalse = false;
		
		//枚举
		eEnum s = eEnum.M;
		s.getValue();
		
		//final 
		final double PI = 3.1415926D; //final 变量只能被赋值一次,一般用来当常量
	}
	
	/**
	  * 运算符
	*/
	public void operator(){
		
	}
	
	/**
	  * 类型转换
	*/ 
	public void conversion(){
		//隐式类型转换优先级 double float long int
		int iInt = 123456789;
		float fFloat = iInt; //1.23456792E8 //E8科学计数法 8个0
		
		//显式强制类型转换
		double x = 9.997;
		int nx = (int)x; //9
		int nxround = (int)Math.round(x); //10 向上取整，然后强制转换
	}
	
	/**
	  * 输入输出
	*/ 
	public void inputOutput(){
//		Scanner in = new Scanner(System.in); //创建Scanner对象
		
//		System.out.print("you name ?");
//		String name = in.nextLine(); //读取一行
		
//		System.out.print("you first name ?");
//		String firstName = in.next(); //读取单词
		
//		System.out.print("you age ?");
//		int age = in.nextInt(); // 读取数字
		
//		Console cons = System.console(); //读取密码
//		char[] passwd = cons.readPassword("password: "); //eclipse 里会有 NullPointerException，因为编辑器本身原因
		
		//格式化输出
		//d	十进制
		//x 十六进制
		//o 八进制
		//f 定点浮点数
		//e 指数浮点数
		//g 通用浮点数
		//a 十六进制浮点数
		//s 字符串
		//c 字符
		//b 布尔
		//h 散列码
		//tx 日期时间
		//% 百分号
		//n 平台相关分隔符
		double x = 3.33;
		System.out.printf("%8.2f",x);
		System.out.printf("\n");
		System.out.printf("%,.2f",1000.0/3.0); //333.33
		System.out.printf("\n");
		System.out.printf("%,(.2f",1000.0/3.0); //333.33
		System.out.printf("\n");
		System.out.printf("%tc",new Date());
		System.out.printf("\n");
		System.out.printf("%1$s %2$tB %2$te, %2$tY ","Due date:",new Date());//指定解析位置%1$
		
/*
|转换符                                 说明                                                                         举例
------------------------------------------------------------------------------
|c(小写c)          | 完整的日期和时间                                            |星期一 三月 06 16:07:54 GMT+08:00 2017
------------------------------------------------------------------------------
|F                | IOS8601日期                                                 |2017-03-06
------------------------------------------------------------------------------
|D 				  | 美国格式的日期(月/日/年)           |03/06/17
------------------------------------------------------------------------------
|T				  | 24小时时间					  |16:21:40
------------------------------------------------------------------------------
|r 				  | 12小时时间 					  |04:22:30 下午
------------------------------------------------------------------------------
|R				  | 24小时没有秒					  |16:22
------------------------------------------------------------------------------
|Y                | 4个数字的年					  |2017
------------------------------------------------------------------------------
|y				  | 年的后两位						  |17
------------------------------------------------------------------------------
|C(大写C)     	  | 年的前两位                                                        |20
------------------------------------------------------------------------------
|B				  | 月的完整拼写					  |三月
------------------------------------------------------------------------------
|b或h			  | 月的缩写						  |三月
------------------------------------------------------------------------------
|m                | 两位数的月,前面补0                |03
------------------------------------------------------------------------------
|d				  | 两位数的日,前面补0                |06
------------------------------------------------------------------------------
|e                | 两位数的月,前面不补0				  |6
------------------------------------------------------------------------------
|A                | 星期几的完整拼写				  |星期一
------------------------------------------------------------------------------
|a                | 星期几的缩写                                                     |星期一
------------------------------------------------------------------------------
|j				  | 366的天 ,前面补0				  |065
------------------------------------------------------------------------------
|H				  | 两位数的小时,补0. 0~23			  |16
------------------------------------------------------------------------------
|k 				  | 两位数的小时,不补0. 0~23		  |16
------------------------------------------------------------------------------
|I(大写I)		  | 两位数的小时,补0.  0~12			  |05
------------------------------------------------------------------------------
|l(小写L)		  | 两位数的小时,不补0.  0~12		  |5
------------------------------------------------------------------------------
|M		  		  | 两位数的分钟,补0.		          |02
------------------------------------------------------------------------------
|S(大写S)          | 两位数的秒,补0.                  |12
------------------------------------------------------------------------------
|L(大写L)		  |	三位数的毫秒,补0 				  |148
------------------------------------------------------------------------------
|N				  | 九位数的微秒					  |222000000
------------------------------------------------------------------------------
|P				  | 上下午大写标志					  |
------------------------------------------------------------------------------
|p				  | 上下午大写标志					  |下午
------------------------------------------------------------------------------
|z(小写z)		  | 时区							  |+0800
------------------------------------------------------------------------------
|Z(大写Z)		  | 时区							  |GMT+08:00
------------------------------------------------------------------------------
|s(小写s)		  | 时间戳(秒级)					  |1488791345
------------------------------------------------------------------------------
|Q		          | 时间戳(毫秒级)					  |1488791403752
------------------------------------------------------------------------------
*/
		
		System.out.printf("\n");
		System.out.printf("%tQ",new Date());
		
	}
	
	/**
	  * 文件输入输出
	*/ 
	public void fileInputOutput(){
		
	}
	
	/**
	  * if
	*/ 
	public void ifProcess(){
		//if (条件)  语句
		int num = 1;
		if (num == 1){
			
		}else if(num == 2){
			
		}else{
			
		}
	}
	
	/**
	  * while
	*/ 
	public void whileProcess(){
		int num = 1;
		while(num == 2){
			
		}
	}
	
	/**
	  * do while
	*/ 
	public void doWhileProcess(){
		do{
			
		}while("a".equals("b"));
	}
	
	/**
	  * for
	*/ 
	public void forProcess(){
		for(int i=1; i<=10;i++){
			
		}
	}
	
	public void forEachProcess(){
		//for (变量:集合) 语句
		int[] a = {1,2,3};
		for (int e:a){
//			System.out.println(e);
		}
	}
	
	/**
	  * switch
	*/ 
	public void switchProcess(){
		int num = 1;
		switch (num){
			case 1:
				//.....
				break;
				
			case 2:
				//.....
				break;
				
			case 3://没有break会接着执行default
				//...
				
			default:
				//.....
				break;
		}
	}
	
	/**
	  * 数组
	*/ 
	public void array(){
		int[] a = new int[100];//创建一个存放100个整数的 数组,下标从0开始
		int lenA = a.length; //100
		//使用Arrays里的方法操作数组
		Arrays.toString(a);
		int[] b = {2,3,4,5,6,7,8};	
		int[] c = Arrays.copyOf(b,b.length);//复制数组
		boolean[] d = new boolean[10];//默认值false
		for (boolean e:d){
//			System.out.println(e);//false
		}
		Arrays.sort(b);//排序
		int [][] multiA = {
				{1,2,3},
				{4,5,6}
		};//多维数组
		
		//多维数组遍历
		for (int[] rowa:multiA){
			for (int numa:rowa){
//				System.out.println(numa);
			}
		}
		
		//快速打印数组格式
		System.out.println(Arrays.deepToString(multiA));//[[1, 2, 3], [4, 5, 6]]
		
	}
	
}


