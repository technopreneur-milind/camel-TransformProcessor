package com.example.JavaFileCopier;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:F:/data/transformProcessor/input?noop=true").process(new MyProcessor())
		.to("file:F:/data/transformProcessor/output?fileName=${header.CamelFileName}-out.csv");
	}
}
