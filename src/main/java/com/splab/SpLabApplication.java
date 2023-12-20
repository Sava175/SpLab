package com.splab;

//import com.splab.abstractFactory.OfficeAdmin;
//import com.splab.abstractFactory.UserClient;
import com.splab.adapter.NewUser;
import com.splab.adapter.OldUser;
import com.splab.adapter.UserAdapter;
import com.splab.strategy.BubbleSort;
import com.splab.strategy.SelectionSort;
import com.splab.strategy.Sorter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

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




//            BasicHDog basicHDog = new BasicHDog();
//            System.out.println(basicHDog.getIngredients());
//            HotDog onionHDog = new OnionHDog(basicHDog);
//            HotDog pigHDog = new PigHDog(onionHDog);
//
//            System.out.println(onionHDog.getIngredients());
//            System.out.println(pigHDog.getIngredients());
//            ---------Decorator pattern




//            OldUser oldUser = new OldUser("Alex", 35);
//            NewUser adapter = new UserAdapter(oldUser);
//            System.out.println("User Name: " + adapter.getUserName());
//            System.out.println("Age: " + adapter.getAge());
//            ------adapter






//            int[] numbers = {34,6,72,3,49,67,0,98,98,6,98,34};
//            Sorter sorter = new Sorter();
//            sorter.setSortingStrategy(new BubbleSort());
//            sorter.performSort(numbers);
//            System.out.println(Arrays.toString(numbers));
//
//            int[] otherNumbers = {34,6,72,3,49,67,0,98,98,6,98,34};
//            sorter.setSortingStrategy(new SelectionSort());
//            sorter.performSort(otherNumbers);
//            System.out.println(Arrays.toString(otherNumbers));
//
//            -----------strategy




































        };
    }

}
