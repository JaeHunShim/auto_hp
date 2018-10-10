package auto_hp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.auto_hp.domain.UserVO;
import com.auto_hp.mapper.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInsertTest {
	
	@Autowired
	UserMapper userMapper;
	
	@Test
	public void insertTest() throws Exception {
		
		for(int i=0; i<50; i++) {
			
			UserVO userVO = new UserVO();
			
		}
	}
}
