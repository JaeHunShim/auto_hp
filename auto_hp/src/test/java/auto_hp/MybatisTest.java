package auto_hp;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.auto_hp.Application;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=Application.class)
public class MybatisTest {

	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@Test
	public void testSqlSession() throws Exception {
		
		try(SqlSession session = sqlSessionFactory.openSession()) {
			
			System.out.println("sqlSession 정보:" + sqlSessionFactory);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
