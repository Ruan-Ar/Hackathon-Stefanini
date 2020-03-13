package com.stefanini.resource;



import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import io.swagger.annotations.Api;
import io.swagger.jaxrs.config.BeanConfig;

@ApplicationPath("api")
@Api
public class ApplicationResource extends Application{
	
//inicio de configurações do Swagger
	
	public ApplicationResource() {
	    BeanConfig beanConfig = new BeanConfig();
	    beanConfig.setVersion("1.0");
	    beanConfig.setSchemes(new String[]{"http"});
	    beanConfig.setHost("localhost:8080");
	    beanConfig.setBasePath("/api");
	    beanConfig.setResourcePackage("com.stefanini.resource");
	    beanConfig.setScan(true);
	  }
	
	
	}



