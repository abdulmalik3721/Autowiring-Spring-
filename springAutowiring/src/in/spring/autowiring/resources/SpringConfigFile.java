package in.spring.autowiring.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.spring.autowiring.beans.Address;
import in.spring.autowiring.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address creatAddrObj() {
		Address addr= new Address();
		addr.setHouseNo(12);
		addr.setCity("Delhi");
		addr.setPinCode(271224);
		return addr;
	}
	
	@Bean
	public Student createStdObj() {
		Student std= new Student();
		std.setName("abdul");
		std.setRollNo(1544);
		std.setAddress(creatAddrObj());
		return std;
	}
}
