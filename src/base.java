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
	
}


