package ssm.chengpai;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ssm.chengpai.dao.TestDao;



public class Test1 {
	
private AbstractApplicationContext context;
@Before
public void init(){
	context=new ClassPathXmlApplicationContext("spring-mybatis.xml","spring-mvc.xml","spring-context.xml");
}
@Test
public void test(){
	TestDao dao=context.getBean(TestDao.class);
	
	System.out.println(dao.selectList().get(0).getDutyName());
	//System.out.println(dao.subjectsClassScheduleSelect1("119","120","1"));
}
@After
public void close(){
	context.close();
}
}
