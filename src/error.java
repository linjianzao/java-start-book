import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SyncFailedException;

/**
* 错误和异常处理
* @author linjianzao
* @Time   2017-03-15
*/
public class error {
	
	public static void main (String[] agrs) throws Throwable{
		try{
			new error().read("xxx.txt");
		}catch(SyncFailedException e){
			
		}
	}

	/**
	* 抛出异常，让调用者处理异常
	* 对不知道如何处理的异常进行异常抛出
	*/
	public void read1(String filename) throws IOException {
		InputStream in = new FileInputStream(filename);
		int b ;
		while((b=in.read())!=-1){
		}
	}
	
	/**
	 * 异常捕捉
	 * 对知道如何处理的异常进行异常捕捉
	 * @throws Throwable 
	 * */
	public void read(String filename) throws Throwable{
		try{
			InputStream in = new FileInputStream(filename);
			int b ;
			while((b=in.read())!=-1){
			}
			
		}catch(SyncFailedException|NullPointerException e){//使用|号可以捕捉多个异常做一样的操作
			
			Throwable se = new SyncFailedException("data error");
			se.initCause(e);
			throw se;
			//如果要转换异常类型的话，建议用这种
			//好处:可以使用 Throwable e = se.getCause(); 来获取原始异常
			
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
			e.getMessage();//错误信息
			e.getClass().getName();//错误实际类型
			
		}catch(IOException e){
			//通过catch里throw一个新的异常，来对异常做类型转换
			throw new NullPointerException("data error:"+e.getMessage());
		}finally{
			//不管有没异常,finally内容都会被执行.一般用来做比如文件打开后， 关闭文件柄回收资源的操作.
			
			//finally会最后执行，所以如果你程序里return 1 但是finally写return 0,那么最终return 0;
		}
		
	}
	
	
}
