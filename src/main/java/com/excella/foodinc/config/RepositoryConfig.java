package com.excella.foodinc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;

@Configuration
@EnableJpaRepositories("com.excella.foodinc.repositories")
@EnableTransactionManagement
public class RepositoryConfig extends JpaRepositoryConfigExtension {
}
