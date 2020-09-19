package com.sanix.SpringSecurity2.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

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

    @Override
    @Bean
    protected UserDetailsService userDetailsService(){
        UserDetails annaSmithUser= User.builder()
                    .username("annasmith")
                    .password("password")
                    .roles("STUDENT") //ROLE_STUDENT
                    .build();

        return new InMemoryUserDetailsManager(
                annaSmithUser
        );
    }
}
