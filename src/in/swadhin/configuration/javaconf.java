package in.swadhin.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import in.student.*;
@Configuration
public class javaconf 
{
  @Bean
  public address address()
  {
	  address add=new address(222, "kdr", 234566);
	  return add;
  }
  @Bean
  public college_details college()
  {
	  college_details cd= new college_details("somu", 453, address());
	  return cd;
  }
}
