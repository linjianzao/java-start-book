package object;

/**
 * 枚举类
 * 比较两个枚举类型的值时，使用== 号，不需要用equals
 * 所有枚举类型都是
 * */
public enum enumClass {
	SMALL(0,"small"),MEDIUM(1,"medium"),LARGE(2,"large"),EXTRA_LARGE(3,"extra_large");
	private int index;
	private String name;
	private enumClass(int index,String name){
		this.index = index;
		this.name = name;
	}
	public int getIndex(){
		return index;
	}
	public String getName(){
		return name;
	}
	
}
