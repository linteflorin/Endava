package Config;

import Beans.TransactionRepository;
import Beans.TransactionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration

public class ProjectConfig {

    @Bean

    public TransactionRepository transactionRepository(){
        TransactionRepository transactionRepository= new TransactionRepository();
        transactionRepository.setNume("Transaction 1");


        return  transactionRepository;

    }
    @Bean //arata ca  e bean
    //@Primary-> ca sa o ia pe asta prima fara sa mai scriem numele in main

    @Scope(scopeName="prototype")    // ca sa nu mai fie Singelton desi Singleton se foloseste de regula

    public TransactionRepository transactionRepository2(){
        TransactionRepository transactionRepository= new TransactionRepository();
        transactionRepository.setNume("Transaction 2");


        return transactionRepository;

    }

    @Bean
    public TransactionService transactionService(){
        TransactionService transactionService - new TransactionService();

        transactionService.setTransactionRepository(new TransactionRepository());

        return  transactionService;

    }
}
