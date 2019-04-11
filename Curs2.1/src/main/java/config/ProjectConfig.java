package config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import repositories.TransactionRepository;

@Configuration
@ComponentScan(basePackages = {"repositories" ,"service"})
public class ProjectConfig {

@Bean
        public TransactionRepository transactionRepository(){
            TransactionRepository transactionRepository = new TransactionRepository();
            transactionRepository.setNume("Transaction1");
             return transactionRepository;


        }

}
