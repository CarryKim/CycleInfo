package springbook.user.dao;

import org.springframework.context.annotation.Bean;

@Configuration
public class DaoFactory {
	@Bean
	public UserDao userDao(){
		return new UserDao(connectioinMaker());
	}
	
	@Bean
	public ConnectionMaker connectioinMaker(){
		return new DConnectionMaker();
	}
}
