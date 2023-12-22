package com.splab;

import com.splab.patterns.Command.Car;
import com.splab.patterns.Command.RemoteControl;
import com.splab.patterns.Command.StartCarCommand;
import com.splab.patterns.Command.StopCarCommand;
import com.splab.patterns.bridge.*;

import com.splab.patterns.chainOfRespons.EngineDiagnosticHandler;
import com.splab.patterns.chainOfRespons.OilChangeHandler;
import com.splab.patterns.chainOfRespons.ServiceHandler;
import com.splab.patterns.chainOfRespons.TireRotationHandler;
import com.splab.patterns.composite.Oder;
import com.splab.patterns.composite.ToDrink;
import com.splab.patterns.composite.ToEat;
import com.splab.patterns.facade.*;
import com.splab.patterns.flyweight.Person;
import com.splab.patterns.proxy.FoodOrder;
import com.splab.patterns.proxy.FoodOrderProxy;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


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
//            -----------strategy



//            NewsAgency newsAgency = new NewsAgency();
//            NewsChannel channel1 = new NewsChannel("first");
//            NewsChannel channel2 = new NewsChannel("second");
//
//            newsAgency.addObserver(channel1);
//            newsAgency.addObserver(channel2);
//
//            newsAgency.setNews("everything is good");
//            newsAgency.setNews("and now is much more better");
//
//            newsAgency.setNews("now everything s just super");
//            System.out.println(newsAgency.getObservers());
//            ----------observer

//
//            Donner kebab = Donner.builder()
//                    .id(1)
//                    .bunType("white")
//                    .sausageType("with cheese")
//                    .cost(5)
//                    .build();
//            System.out.println(kebab);
//            -------builder


//            TShirt xlSize = new TShirt("black", "for the best man", 35);
//            TShirt cloneThat = xlSize.copy();
//            cloneThat.setColor("Red");
//            System.out.println(xlSize);
//            System.out.println(cloneThat);
//            -------prototype


//            IceCreamLover iceCreamClient = new IceCreamLover();
//            iceCreamClient.enjoyIceCream(new AppleIceFactory());
//            iceCreamClient.enjoyIceCream(new ChocoIceFactory());
//            --------abstractFactory


//            DishToOrder borscht = new Borscht(new UkrainianCuisine());
//            DishToOrder sausage = new Sausage(new GermanCuisine());
//            borscht.makeOrder();
//            sausage.makeOrder();
//            -------bridge pattern

//            ToDrink cola = new ToDrink("cola");
//            ToEat chocolate = new ToEat("chocolate");
//            Oder table1 = new Oder(List.of(cola, chocolate));
//            System.out.println(table1);
//            --------composite



//            Office office = new Office();
//            office.getRooms().addAll(List.of(new Toilet(), new Kitchen(),new WorkCabinet()));
//            for(Room room:office.getRooms()){
//                room.roomPurpose();
//            }
//            -------facade


//            Person first = Person.createPerson("Alex", "Dev");
//            Person second = Person.createPerson("Vasyl", "Dev");
//            System.out.println(first);
//            System.out.println(second);
//            -----flyweight



//            FoodOrder foodOrder1 = new FoodOrderProxy("Burger");
//            FoodOrder foodOrder2 = new FoodOrderProxy("Sushi");
//            foodOrder1.deliver();
//            foodOrder2.deliver();
//            -----proxy



//            ServiceHandler oilChangeHandler = new OilChangeHandler();
//            ServiceHandler tireRotationHandler = new TireRotationHandler();
//            ServiceHandler engineDiagnosticHandler = new EngineDiagnosticHandler();
//
//            oilChangeHandler.setNextHandler(tireRotationHandler);
//            tireRotationHandler.setNextHandler(engineDiagnosticHandler);
//
//            String requestedService = "Tire Rotation";
//            oilChangeHandler.performService(requestedService);
//            -------chain of Responsobility



//            Car car = new Car();
//            StartCarCommand startCommand = new StartCarCommand(car);
//            StopCarCommand stopCommand = new StopCarCommand(car);
//            RemoteControl remote = new RemoteControl();
//            remote.setCommand(startCommand);
//            remote.pressButton();
//            remote.setCommand(stopCommand);
//            remote.pressButton();
//            -------command pattern





















        };
    }

}
