import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan
public class SpringBeanConfiguration {
@Bean 
public Employee gerEmployee() {
	return new Employee();
}

@Bean
public Address getAddress() {
	return new Address();
}

@Bean
public Citizen getCitizen() {
	return new Citizen();
}

}
