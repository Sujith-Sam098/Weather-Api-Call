package com.weather.Weather.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
@Configuration
public class weather {

    @Bean
    public RestClient restClient(){
        return RestClient.create("http://api.open-meteo.com/v1");
    }
}
