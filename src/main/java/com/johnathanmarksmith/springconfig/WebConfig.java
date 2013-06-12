package com.johnathanmarksmith.springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Date:   6/12/13 / 7:47 AM
 * Author: Johnathan Mark Sm
 * Email:  johnathansmith1969@gmail.com
 * <p/>
 * Comments:
 *
 *     This is my configuration. I dont like using XML anymore thats old school.
 */


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.johnathanmarksmith")
public class WebConfig extends WebMvcConfigurerAdapter
{

    /**
     * Since we don't have any controller logic for the home screen we simpler
     * to just define controller for page using View Controller.
     *
     * Note: had to extend WebMvcConfigurerAdapter to get this functionality
     *
	 * @param registry
	 */
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("home");
	}
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/view/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
}
