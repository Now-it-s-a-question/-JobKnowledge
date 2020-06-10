package cn.edu.cqut.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Glorious
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
	  @Bean
	  public Docket createRestApi() {
	    return new Docket(DocumentationType.SWAGGER_2)
	            .apiInfo(apiInfo())
	            .select()
				//指定controller根包
	            .apis(RequestHandlerSelectors.basePackage("cn.edu.cqut.controller"))
	            .paths(PathSelectors.any())
	            .build();
	  }


	  private ApiInfo apiInfo() {
	    return new ApiInfoBuilder()
				//标题
	            .title("CRM管理系统")
				//描述
	            .description("理工软件工程2020实训")
				//联系信息
	            .contact(new Contact("xxx","xx","xx"))
				//版本号
	            .version("1.0")
	            .build();
	  }
}