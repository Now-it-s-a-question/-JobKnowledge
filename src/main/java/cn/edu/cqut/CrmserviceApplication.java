package cn.edu.cqut;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.edu.cqut.mapper")
public class CrmserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrmserviceApplication.class, args);
	}
	

}
