package com.sanix.SpringSecurity2.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http
                .authorizeRequests()//Authorize request
                .antMatchers("/", "index", "/css/*", "/js/*")
                .permitAll()//Permit all
                .anyRequest()//Any request
                .authenticated()//must be authenticated
                .and()
                .httpBasic();//using basic authentication
    }
}
