import java.io.File;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;
import org.quartz.Scheduler;
import org.quartz.impl.StdSchedulerFactory;

import com.sun.org.apache.xml.internal.security.utils.HelperNodeList;


public class Sample1 {

	public static void main(String[] args) throws Exception {
		//BasicConfigurator.configure();
		String log4jConfPath = "src/config/log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
		
		Scheduler lScheduler = StdSchedulerFactory.getDefaultScheduler();
		lScheduler.start();
		
		
		lScheduler.shutdown();
	}

}
