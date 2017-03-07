package object;

//继承
//parentClass是超类、基类或父类
//childrenClass 是子类、派生类或孩子类
//final关键字，不可被继承。
final public class childrenClass extends parentClass {
	
	public static void main(String[] args){
		new childrenClass().childrenClass();
		new childrenClass().classConversion();
	}
	
	public void childrenClass(){
		super.helloWold();//调用父类的方法
		super.parentClass();
		
		String showA = this.show(new childrenClass());
		String showB = this.show(new parentClass());
//		System.out.println(showA);
//		System.out.println(showB);
	}
	
	//多态,指允许不同类的对象对同一消息做出响应。即同一消息可以根据发送对象的不同而采用多种不同的行为方式
	//实现多态的技术称为：动态绑定（dynamic binding）
	public String show (childrenClass obj){
		return (" childrenClass ");
	}
	
	public String show (parentClass obj){
		return (" parentClass ");
	}
	
	/**
	 * 类 类型转换
	 * */
	public void classConversion(){
		childrenClass cC = new childrenClass();
		//objectClass oc = (childrenClass)cC; //这个会报错,子类和父类之间才能互相转换
		parentClass pC = (childrenClass)cC; //这个会正常运行
		//所以进行类型转换之前需要判断类型,使用instanceof
		if(cC instanceof parentClass){
			parentClass iPC = (childrenClass)cC;
		}
	}
	
}
