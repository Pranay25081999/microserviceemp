package com.example.employee.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class EmployeeConfiguration {
    @Bean
public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    /*@Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }*/

    /*@Bean
    public WebClient webClient(){

    }*/

}
