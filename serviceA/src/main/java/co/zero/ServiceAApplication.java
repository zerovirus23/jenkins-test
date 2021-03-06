package co.zero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServiceAApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ServiceAApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceAApplication.class, args);
	}
	
	
	@GetMapping("/helloA")
	public String helloWorld() {
		return "Hello from ServiceA";
	}
}
