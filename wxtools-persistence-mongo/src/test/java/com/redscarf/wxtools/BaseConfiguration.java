package com.redscarf.wxtools;

import com.redscarf.wxtools.persistence.mongo.repository.impl.SimpleCustomerRepository;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableAutoConfiguration
@ComponentScan(
        basePackages = {
                "com.redscarf.wxtools"
        }
)
@EnableMongoRepositories(repositoryBaseClass = SimpleCustomerRepository.class)
public class BaseConfiguration {
}
