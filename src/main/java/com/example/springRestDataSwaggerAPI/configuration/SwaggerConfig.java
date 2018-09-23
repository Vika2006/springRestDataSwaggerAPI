//package com.example.springRestDataSwaggerAPI.configuration;

/*
import com.google.common.base.Predicates;
import io.swagger.annotations.Api;
//import com.example.springRestDataSwaggerAPI.controller.ItemRestController;
import com.example.springRestDataSwaggerAPI.entity.Item;
import io.swagger.annotations.ApiParam;
import io.swagger.models.Response;
import javassist.NotFoundException;
import org.mapstruct.Context;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.websocket.server.PathParam;


//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
@ComponentScan
@RequestMapping
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private static final String SWAGGER_API_VERSION = "1.0";
    private static final String LICENSE_TEXT = "License";
    private static final String title = "Items REST ";
    private static final String description = "RESTfull API for Items";

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(title).description(description)
                .license(LICENSE_TEXT)
                .version(SWAGGER_API_VERSION)
                .build();
    }

    public class SwaggerApi {
        @Bean
        public Docket api() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.any())
                    .paths(PathSelectors.any())
                    .paths(Predicates.not(PathSelectors.regex("/error")))
                    .build();
        }


      /*  @PostRemove
        @PatchMapping("/{id}")
        @io.swagger.annotations.ApiOperation(value = "", notes = "Deletes all projects", response = void.class, tags={  })
        @io.swagger.annotations.ApiResponses(value = {
                @io.swagger.annotations.ApiResponse(code = 200, message = "Project is deleted.", response = void.class),
                @io.swagger.annotations.ApiResponse(code = 500, message = "Internal API error / Server error", response = void.class) })
        public Response deleteProject(
                @ApiParam(value = "Document ID",required=true) @PathParam("id") String id, @Context SecurityContext securityContext)
                throws NotFoundException {
            return deleteProject(id,securityContext); }

            }}*/


//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

            package com.example.springRestDataSwaggerAPI.configuration;

        import com.google.common.base.Predicates;
        import io.swagger.annotations.Api;
        import com.example.springRestDataSwaggerAPI.controller.ItemRestController;
        import com.example.springRestDataSwaggerAPI.entity.Item;
        import org.omg.CORBA.PRIVATE_MEMBER;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.ComponentScan;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.context.annotation.PropertySource;
        import org.springframework.web.bind.annotation.PatchMapping;
        import org.springframework.web.bind.annotation.RequestMapping;
        import springfox.documentation.annotations.ApiIgnore;
        import springfox.documentation.builders.ApiInfoBuilder;
        import springfox.documentation.builders.PathSelectors;
        import springfox.documentation.builders.RequestHandlerSelectors;
        import springfox.documentation.service.ApiInfo;
        import springfox.documentation.spi.DocumentationType;
        import springfox.documentation.spring.web.plugins.Docket;
        import springfox.documentation.swagger2.annotations.EnableSwagger2;


//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
@ComponentScan
@RequestMapping
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private static final String SWAGGER_API_VERSION = "1.0";
    private static final String LICENSE_TEXT = "License";
    private static final String title = "Items REST ";
    private static final String description = "RESTfull API for Items";

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title(title).description(description)
                .license(LICENSE_TEXT)
                .version(SWAGGER_API_VERSION)
                .build();
    }

    public class SwaggerApi {
        @Bean
        public Docket api() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.any())
                    .paths(PathSelectors.any())
                    .paths(Predicates.not(PathSelectors.regex("/error")))
                    .build();
        }
    }

}