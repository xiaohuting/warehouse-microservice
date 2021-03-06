package com.project.warehouse.security;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;

@Configuration
@EnableResourceServer
public class SecurityOAuth2ResourceServerConfig extends ResourceServerConfigurerAdapter {
    // extends ResourceServerConfigurer Adapter
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/account/**").permitAll()
                .anyRequest().authenticated()
                .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
    }

}