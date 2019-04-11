package main;

import Config.Cat;
import Config.ProjectConfig;


public class Main {
    public static  void main(String[] args){
        try(AnnotationConfigApplicationContext
        context = new AnnotationConfigApplicationContext(ProjectConfig.class )){

            Cat c = context.getBean(Cat.class);
            System.out.println(c.nume);

        }


    }

}
