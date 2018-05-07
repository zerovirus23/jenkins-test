package co.zero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class PortalApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(PortalApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(PortalApplication.class, args);
	}
	
	@GetMapping("/helloMvc")
	public String hello(Model model) {
		model.addAttribute("greeting","Hello from MVC");
		return "index";
	}
}
