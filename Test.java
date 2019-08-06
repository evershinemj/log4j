import org.log4j.BasicConfigurator;
import org.log4j.Logger;

public class Test {
	public static Logger foo = Logger.getLogger(Test.class);

	public static void main(String[] args) {
		BasicConfigurator.configure();
		foo.debug("this is debug info");
		foo.info("everything is fine");
	}
}
		
