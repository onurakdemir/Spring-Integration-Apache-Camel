package com.netas.ososintegration.apachecamel.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

@Component
public class RouteTalepTahmin extends RouteBuilder{
	@Override
	public void configure() throws Exception {
		restConfiguration()
			.component("netty4-http")
			.contextPath("piq")
			.bindingMode(RestBindingMode.json)
			.host("0.0.0.0")
			.port(8980);

		rest()
			.get("/test")
				.route()
					.process(e -> {e.getIn().setBody(e.getIn().getHeader("foo") == null);})
			.endRest();
	}
	
	
}
