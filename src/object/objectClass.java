package object;
//import static java.lang.System.out; //导入静态类


/**
 * private   仅对本类可见
 * public    对所有类可见
 * protected 对本包和所有子类可见
 * 不用修饰符      对本包可见       
 * 
 *	所有类默认继承 Object
*/
public class objectClass {
	
	public static void main(String[] agrs){
		objectClass oC = new objectClass();
		oC.equals(new childrenClass());//判断两个类是否是同一个引用
		
		//使用instanceof判断引用的话，子类和父类的比较结果就是true,和预期不一样,所以应该用 equals判断
		parentClass pC = new parentClass(); 
		boolean pcEquals = (new childrenClass() instanceof parentClass);//true
		
	}
	
	
	/**
	  * 静态变量
	 */
	private static int staticId = 1;
	
	/**
	  * 静态常量
	 */
	private static final double PI = 3.141592;
	
	
	/**
	  * 构造函数,和类名一样名称的方法就是构造函数
	 */
	public void objectFunc(){}      
	
	/**
	  * 公开方法
	  * 对所有类可见
	 */
	public void publicClass(){}
	 
	/**
	  * 保护方法
	  * 对本包和所有子类可见
	 */
	protected void protectedFunc(){}
	
	/**
	  * 私有方法
	  * 仅对本类可见
	 */
	private void privateFunc(){}
	
	
	 //不用修饰符      对本包可见
	void defaultFunc(){}
	
	private final void finalPrivate(){}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

