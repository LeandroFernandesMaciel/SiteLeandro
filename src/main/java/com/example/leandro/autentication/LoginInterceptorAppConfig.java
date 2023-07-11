package com.example.leandro.autentication;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class LoginInterceptorAppConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor( new LoginInterceptor())
                .excludePathPatterns(
                        "/",
                        "/error",
                        "/vendor/**",
                        "/login",
                        "/usuarios",
                        "/usuarios/**",
                        "/ps4",
                        "/ps5",
                        "/Sobre",
                        "/usuarios/registro",
                        "/logar",
                        "/img/**",
                        "/js/**",
                        "/favicon.ico",
                        "/css/**"
                );
    }
}
