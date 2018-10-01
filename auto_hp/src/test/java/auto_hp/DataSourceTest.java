package auto_hp;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.auto_hp.Application;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class DataSourceTest {
	
	@Autowired
	private DataSource ds;
	
	@Test
	public void testDBConnection() throws Exception {
		
		try(Connection con=ds.getConnection()){
			System.out.println("con정보:" + con);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
