package com.example.crudwithgeode2;

import com.example.crudwithgeode2.controller.AppController;
import com.example.crudwithgeode2.domain.Author;
import com.example.crudwithgeode2.repo.AuthorRepository;
import com.example.crudwithgeode2.service.AuthorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.gemfire.config.annotation.ClientCacheApplication;
import org.springframework.data.gemfire.config.annotation.EnableClusterConfiguration;
import org.springframework.data.gemfire.config.annotation.EnableContinuousQueries;
import org.springframework.data.gemfire.config.annotation.EnableEntityDefinedRegions;
import org.springframework.data.gemfire.config.annotation.EnableIndexing;
import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;

@SpringBootApplication
@ClientCacheApplication(subscriptionEnabled = true)
@EnableEntityDefinedRegions(basePackageClasses = Author.class)
@EnableIndexing
@EnableGemfireRepositories(basePackageClasses = AuthorRepository.class)
@ComponentScan(basePackageClasses = {AppController.class, AuthorService.class})
@EnableClusterConfiguration(useHttp = true, requireHttps=false)
@EnableContinuousQueries
public class CrudWithGeode2Application {

	public static void main(String[] args) {
		SpringApplication.run(CrudWithGeode2Application.class, args);
	}

}
