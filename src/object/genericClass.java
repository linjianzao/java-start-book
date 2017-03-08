package object;

import java.util.ArrayList;
import java.util.Date;

/**
 * 泛型
 * */
public class genericClass {
	
	/**
	 * ArrayList
	 * 不必指出数组大小
	 * 使用add添加元素
	 * 使用size() 替换length
	 * 使用a.get(i)替换a[i]访问元素
	 * */
	public static void main(String[] args){
		//创建一个类型为objectClass的泛型数组，会在执行的时候才确定数组大小。
		ArrayList<objectClass> staff =  new ArrayList<objectClass>();
		staff.add(new objectClass()); //添加
		
		//给定初始大小
		ArrayList<objectClass> staffDefine =  new ArrayList<objectClass>(100);

		staff.size();//返回数组包含的实际元素数目,等价于 数组a 的a.length
		
		//在确定好数组数量后，使用这个方法把多于的数组空间释放掉.
		//需要在确定数组不会添加任何元素时才调用,否则新添加的元素还要花时间再处理.
		staff.trimToSize();
		
		//ArrayList使用get和set访问和改变数组,使用add添加新元素,set只能替换数组现有元素
		staff.get(0);
		staff.set(0,new objectClass());
		
		new genericClass().arrayListFunc();
	}
	
	public void arrayListFunc(){
		//ArrayList<Integer>的效率远远低于int[],所以应该用来操作小型集合.
		//用于开发人员操作方便性比 执行效率更加重要的场景
		ArrayList<Integer>integerList = new ArrayList<>();
		ArrayList<Long>longList = new ArrayList<>();
		ArrayList<Float>floatList = new ArrayList<>();
		ArrayList<Double>doubleList = new ArrayList<>();
		ArrayList<Short>shortList = new ArrayList<>();
		ArrayList<Byte>byteList = new ArrayList<>();
		ArrayList<Character>charList = new ArrayList<>();
		ArrayList<Void>voidList = new ArrayList<>();
		ArrayList<Boolean>booleanList = new ArrayList<>();
		
		integerList.add(3);
		//自动转换成
		integerList.add(Integer.valueOf(3));//这种变换被称为自动装箱(autoboxing),或自动打包
		
		int n = integerList.get(0);
		//自动翻译成
		int nGet = integerList.get(0).intValue();//自动拆箱
		
	}
	

	
	
	
	
	
}
