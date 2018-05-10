package ssm.chengpai.util;

import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;



@Component
@Lazy(value=false)//鎳掑姞杞�
public class SpringTimer {
	
	/*   @Scheduled(cron = "0/5 * *  * * ?")//每个五秒执行一次
	    public void test() throws Exception {
	        System.out.println("Test is working......");
	    }*/


}
