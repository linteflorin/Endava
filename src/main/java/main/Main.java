package main;

import Beans.TransactionRepository;
import Beans.TransactionService;
import Config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

       try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)){


           TransactionRepository transactionRepository = context.getBean("transactionRepository",TransactionRepository.class); //Ia numeele transactuib repository 2

           TransactionRepository transactionRepository2 = context.getBean("transactionRepository", TransactionRepository.class);//Ia numele tranzactiei care e scrisa prima !!


           transactionRepository2.setNume("Singeleton");

           System.out.println(transactionRepository);
           System.out.println(transactionRepository2);
            //Pentru Prototype:
           TransactionRepository transactionRepositoryPrototype = context.getBean("transactionRepository2",TransactionRepository.class); //Ia numeele transactuib repository 2

           TransactionRepository transactionRepositoryPrototype2 = context.getBean("transactionRepository2", TransactionRepository.class);//Ia numele tranzactiei care e scrisa prima !!


           transactionRepositoryPrototype2.setNume("prototype");// se vede ca nu se mai schimba numele la aman2, pt ca nu mai e singleton

           System.out.println(transactionRepositoryPrototype);
           System.out.println(transactionRepositoryPrototype2);


           TransactionService transactionService = context.getBean(TransactionService.class);
           System.out.println(transactionService);
       }




    }

}

