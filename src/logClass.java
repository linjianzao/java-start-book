import java.util.logging.Level;
import java.util.logging.Logger;



/**
* 日志处理
* @author linjianzao
* @Time   2017-03-16
*/
public class logClass {
	
	public static void main(String[] args){
		new logClass().baseLog();
		new logClass().highLog();
		new logClass().logp();
		
		
	}
	
	//基础日志
	public void baseLog(){
		Logger.getGlobal().setLevel(Level.INFO);//激活日志，bug7184195之后就默认激活了
		Logger.getGlobal().info(" file test show log ");//设置日志
//		Logger.getGlobal().setLevel(Level.OFF);//关闭日志
	}
	

	/**
	* 高级日志
	* 日志级别 SEVERE WARNING INFO CONFIG FINE FINER FINEST
	* 默认记录 SEVERE WARNING INFO 三个级别
	*/
	private static final Logger myLogger = Logger.getLogger("logClass");
	public void highLog(){
		myLogger.setLevel(Level.FINE); //设置日志级别
		myLogger.setLevel(Level.ALL);  //记录所有日志级别
		myLogger.setLevel(Level.OFF);  //关闭日志
		myLogger.warning(" recode warning log ");
		myLogger.log(Level.INFO," use this type to log ");
	}
	
	/**
	* logp跟踪执行流
	* 普通log可能无法得到准确的日志信息，logp可以获取到类和方法具体调用位置。
	*/
	public void logp(){
		myLogger.logp(Level.FINE, "logClass", "highLog", " log info ");
	}
	
	
}
