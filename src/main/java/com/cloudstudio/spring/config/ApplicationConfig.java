package com.cloudstudio.spring.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@EnableCaching
@Configuration
@ComponentScan(basePackages = "com.cloudstudio.spring")
public class ApplicationConfig {
	
	
	
	
//	bean configuration is optional for default cache
	
/*	@Bean
	public CacheManager cacheManager()
	{
		return new ConcurrentMapCacheManager("products");
	} */

}
