package com.stackroute.movieappgateway.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

@Component
@Primary
@EnableAutoConfiguration
public class SwaggerAggregatorController implements SwaggerResourcesProvider {

	@Override
	public List<SwaggerResource> get() {
		List<SwaggerResource> resources= new ArrayList<>();
		SwaggerResource swaggerResource = new SwaggerResource();
		swaggerResource.setName("feedbackService");
		swaggerResource.setLocation("/movieapp/v1/feedback");
		swaggerResource.setSwaggerVersion("1.0");

		resources.add(swaggerResource);
		return resources;
	}

//	@Autowired
//	private RouteLocator routeLocator;
//
//	@Override
//	public List<SwaggerResource> get() {
//		List<SwaggerResource> resources = new ArrayList<>();
//
//		routeLocator.getRoutes().toStream().forEach(route -> {
////			resources.add(swaggerResource(route.getId(), route.getFullPath().replace("**", "v2/api-docs"), "1.0"));
//			resources.add(swaggerResource(route.getId(), route.getUri().getPath().replace("**", "v2/api-docs"), "1.0"));
//		});
//
//		return resources;
//	}
//
//	private SwaggerResource swaggerResource(final String name, final String location, final String version) {
//		SwaggerResource swaggerResource = new SwaggerResource();
//		swaggerResource.setName(name);
//		swaggerResource.setLocation(location);
//		swaggerResource.setSwaggerVersion(version);
//		return swaggerResource;
//	}
}
