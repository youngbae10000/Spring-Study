package chap02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {

	@Bean //@Bean 어노테이션이 메서드에 붙이면 해당 메서드가 생성한 객체를 스프링이 관리하는 빈 객체로 등록한다.
	public Greeter greeter() { //스프링은 객체를 생성하고 초기화하는 기능을 제공
							   //스프링이 생성하는 객체를 빈(Bean) 객체라고 부른다
		Greeter g = new Greeter(); 
		g.setFormat("%s, 안녕하세요");
		return g;
		
	}
}
