package com.festive.config;

import java.io.IOException;
import java.util.Properties;

import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.VelocityException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.ui.velocity.VelocityEngineFactory;

@Configuration
@PropertySource(value = { "classpath:application.properties" })
@ComponentScan({ "com.festive.*" })
public class ApplicationConfiguration {   

	    @Bean
	    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
	        return new PropertySourcesPlaceholderConfigurer();
	    }
	    
	    /*
	     * Velocity configuration.
	     */
	    @SuppressWarnings("deprecation")
		@Bean
	    public VelocityEngine getVelocityEngine() throws VelocityException, IOException {
	        VelocityEngineFactory factory = new VelocityEngineFactory();
	        Properties props = new Properties();
	        props.put("runtime.log.logsystem.class", "org.apache.velocity.runtime.log.NullLogSystem");
	 
	        factory.setVelocityProperties(props);
	        return factory.createVelocityEngine();
	    }

}
