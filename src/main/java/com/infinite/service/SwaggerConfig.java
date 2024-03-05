 package com.infinite.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import static springfox.documentation.builders.PathSelectors.regex;
import com.google.common.base.Predicate;
import static com.google.common.base.Predicates.or;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
				.apiInfo(apiInfo()).select().paths(postPaths()).build();
	}
 
	private Predicate<String> postPaths() {
		return or(regex("/api/posts.*"), regex("/api/infinite.*"));
	}
 
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Java API")
				.description("Java API reference for developers")
				.termsOfServiceUrl("http://yashmedi.com")
				.contact("yash9@gmail.com").license("Yashwanth License")
				.licenseUrl("yash9@gmail.com").version("1.0").build();
	}
}
