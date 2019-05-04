package com.habuma.spittr.config;

import com.habuma.spittr.service.SpitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

@Configuration
public class RmiConfig {

    @Bean
    public RmiProxyFactoryBean spitterService(){
        RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
        rmiProxyFactoryBean.setServiceUrl("rmi://localhost:1199/SpitterService");
        rmiProxyFactoryBean.setServiceInterface(SpitterService.class);
        return rmiProxyFactoryBean;
    }



}
