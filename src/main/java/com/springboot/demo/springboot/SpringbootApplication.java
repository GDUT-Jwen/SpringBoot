package com.springboot.demo.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringbootApplication.class);
		//修改Banner的模式为OFFTest19SpringBoot2Application
		builder.bannerMode(Banner.Mode.OFF).run(args);
	}
}
