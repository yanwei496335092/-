package AOPTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dzkj.biz.UserBiz;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserBiz ub = ac.getBean(UserBiz.class);
		ub.findAll();
		ub.delete(1);
	}
}
