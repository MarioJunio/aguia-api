package br.com.aguia;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

@EntityScan(basePackageClasses = { AguiaApiApplication.class, Jsr310JpaConverters.class })
@SpringBootApplication
public class AguiaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AguiaApiApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {
		
		return new ModelMapper();
	}

}
