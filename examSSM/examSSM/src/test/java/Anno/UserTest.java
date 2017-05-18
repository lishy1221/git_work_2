package Anno;



import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring-mybatis.xml"})

public class UserTest extends AbstractJUnit4SpringContextTests {
	
	 //private Logger logger = Logger.getLogger(UserTest.class);
   @Resource
  private com.service.userService userService = null;
   
   @Test
   public void test(){
	   User user=userService.findUser(1);
	   //logger.info(user);
	   System.out.println("===test=="+user);
   }

	 


}