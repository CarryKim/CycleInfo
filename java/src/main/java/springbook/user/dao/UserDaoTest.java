package springbook.user.dao;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserDaoTest {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		//ConnectionMaker connectionMaker = new DConnectionMaker();
		//UserDao dao = new UserDao(connectionMaker);
		//UserDao dao = new DaoFactory().userDao();
		
		ApplicationContext context = new AnnotationConfigApplicationContext(DaoFactory.class);
		UserDao dao = context.getBean("userDao", UserDao.class);
	}

}
