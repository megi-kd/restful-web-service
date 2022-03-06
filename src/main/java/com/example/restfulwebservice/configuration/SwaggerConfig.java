package com.example.restfulwebservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * ApiSelectorBuilder - provides a way of controlling the endpoints exposed by swagger.
     * @return
     */
    @Bean
    public Docket getDocket(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("com.example.restfulwebservice").select()
                .apis(RequestHandlerSelectors.basePackage("com.example.restfulwebservice.controller"))
                .paths(PathSelectors.any()).build().apiInfo(getApiInfo());
    }

    /**
     *  can be used to set some document related information like
     *  title, description of the API, and version.
     * @return
     */
    private ApiInfo getApiInfo() {
        return new ApiInfoBuilder()
                .title(" Simple Rest Service API ")
                .description("Simple Rest Serivce Documentation")
                .version("1.0.0").build();
    }
}
