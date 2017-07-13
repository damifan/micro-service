package com.damifan;


import com.damifan.filter.AccessFilter;
import com.netflix.zuul.context.ContextLifecycleFilter;
import com.netflix.zuul.http.ZuulServlet;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringCloudApplication
public class ZuulApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ZuulApplication.class).web(true).run(args);
	}

	@Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}

	@Bean
	public ServletRegistrationBean zuulServlet() {
		ServletRegistrationBean servlet = new ServletRegistrationBean(new ZuulServlet());
		servlet.addUrlMappings("/test","/hello");
		return servlet;
	}

	@Bean
	public FilterRegistrationBean contextLifecycleFilter() {
		FilterRegistrationBean filter = new FilterRegistrationBean(new ContextLifecycleFilter());
		filter.addUrlPatterns("/*");
		return filter;
	}
}
