package generic;
/**
 * 简单的泛型类
 * 
 * E表示集合的元素类型
 * K和V 表示关键字和值的类型
 * T、U、S 表示任意类型
 * 
 * */
public class simpleGenericClass<T> {
	private T first;
	private T second;
	
	public simpleGenericClass(){
		first = null;
		second = null;
	}
	
	public T getFirst(){
		return first;
	}
	
	public T getSecond(){
		return second;
	}
	
	public void setFirst(T newValue){
		first = newValue;
	}
	
	public void setSecond(T newValue){
		second = newValue;
	}
	
	/**
	 *  泛型方法
	 *  泛型方法可以在泛型类里定义也可以在普通类里定义
	 *  T... a 可变参数
	 *  <T> T 反正值类型为T
	 *  
	 * */
	public <T> T getMiddle(T... a){
		return a[a.length/2];
	}
	
	/**
	 * 限定泛型的类型
	 * 通过extends Comparable限定类型为 实现了Comparable接口的类，比如String,Date等
	 * 
	 * */
	public static <T extends Comparable> T min(T[] a){
		if( a==null || a.length==0 ){
			return null;
		}else{
			T smallest = a[0];
			for (int i=1;i<a.length;i++){
				if (smallest.compareTo(a[i]) > 0 ){
					smallest = a[i];
				}
			}
			return smallest;
		}
	}
	
	
}
