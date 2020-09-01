package com.spring.mongodb.groceries.config;

import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.mongodb.groceries.util.GroceriesConstants;

/**
 * @author P.V. UdayKiran
 * @version 1, created on Tue 01-Sep-2020 22:09
 */
@Configuration
public class GroceriesConfig {
	
	/**
	 * <h1>Context path</h1> The context path is the name of the URL at which we access the application. The default context path is empty.
	 * <ol> 
	 * 	<li>The property can be change in the application.properties file. (Also in the application.yml file.) </li>
	 * 	<li>The context path can be set with the WebServerFactoryCustomizer bean. </li>
	 * 	<li>Here we set the context with the Java System property. </li>
	 * </ol>
	 * @return contextPath
	 * @author P.V. UdayKiran
	 * @since created on Tue 01-Sep-2020 22:16
	 */
	@Bean
	public WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> webServerFactoryCustomizer() {
		return factory -> factory.setContextPath(GroceriesConstants.Config.CONTEXT_PATH);
	}
}
