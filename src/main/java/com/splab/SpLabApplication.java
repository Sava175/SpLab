package com.splab;

import com.splab.abstractFactory.*;
//import com.splab.abstractFactory.OfficeAdmin;
//import com.splab.abstractFactory.UserClient;
import com.splab.singletone.ProductionManager;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpLabApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpLabApplication.class, args);
    }
    @Bean
    CommandLineRunner init (){
        return args -> {


//            Company useJava = new JavaCompany();
//            Programmer javist = useJava.createProgrammer();
//            System.out.print("javist ");
//            javist.languageType();
//
//            Company useTS = new TSCompany();
//            Programmer TSist = useTS.createProgrammer();
//            System.out.print("TSist ");
//            TSist.languageType();
//            ----------Factory method





//            ProductionManager firstManager = ProductionManager.getInstance("Ali", "Baba");
//            firstManager.manageProduction();
//
//            ProductionManager secondManager = ProductionManager.getInstance("Huba", "Buba");
//            secondManager.manageProduction();
            /* will not take new arguments, because second manager is also Ali Baba
            --------------this is example of singleton
            */






















        };
    }

}
