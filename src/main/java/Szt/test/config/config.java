package Szt.test.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class config implements WebMvcConfigurer {

	public void addCros(CorsRegistry registry){
		registry.addMapping("/*")
		.allowedHeaders("*")
		.allowedMethods("*")
		.allowedOrigins("*");
		
	}
}
