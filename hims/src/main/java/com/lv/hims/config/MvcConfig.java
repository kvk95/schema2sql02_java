package com.lv.hims.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MvcConfig {
	
	@Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
