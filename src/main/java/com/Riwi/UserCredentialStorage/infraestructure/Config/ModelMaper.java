package com.Riwi.UserCredentialStorage.infraestructure.Config;


import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMaper {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
