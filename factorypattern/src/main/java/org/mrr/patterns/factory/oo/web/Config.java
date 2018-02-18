package org.mrr.patterns.factory.oo.web;

import org.mrr.patterns.factory.oo.factory.Factory;
import org.mrr.patterns.factory.oo.factory.Product;
import org.mrr.patterns.factory.oo.factory.SpringJacket;
import org.mrr.patterns.factory.oo.factory.SpringShirt;
import org.mrr.patterns.factory.oo.factory.TextileFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    Product springJacket(){
        return new SpringJacket();
    }

    @Bean
    Product springShirt(){
        return new SpringShirt();
    }

    @Bean
    Factory factory() {
        return new TextileFactory();
    }

    @Bean
    SomeService someService(){
        return new SomeService(factory());
    }
}
