package com.chunjies;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.chunjies.mapper")
public class EcmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcmsApplication.class, args);
	}

}
