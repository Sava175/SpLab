package com.splab;

import com.splab.patterns.template.Breakfast;
import com.splab.patterns.template.BeckonBreakfast;
import com.splab.patterns.template.SausageBreakfast;
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

//            IceCreamLover iceCreamClient = new IceCreamLover();
//            iceCreamClient.enjoyIceCream(new AppleIceFactory());
//            iceCreamClient.enjoyIceCream(new ChocoIceFactory());
//            --------abstractFactory



//            OldUser oldUser = new OldUser("Alex", 35);
//            NewUser adapter = new UserAdapter(oldUser);
//            System.out.println("User Name: " + adapter.getUserName());
//            System.out.println("Age: " + adapter.getAge());
//            ------adapter




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
//            --------------this is example of singleton





//            BasicHDog basicHDog = new BasicHDog();
//            System.out.println(basicHDog.getIngredients());
//            HotDog onionHDog = new OnionHDog(basicHDog);
//            HotDog pigHDog = new PigHDog(onionHDog);
//
//            System.out.println(onionHDog.getIngredients());
//            System.out.println(pigHDog.getIngredients());
//            ---------Decorator pattern






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
//            -------builder-------





//            TShirt xlSize = new TShirt("black", "for the best man", 35);
//            TShirt cloneThat = xlSize.copy();
//            cloneThat.setColor("Red");
//            System.out.println(xlSize);
//            System.out.println(cloneThat);
//            -------prototype






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
//            -----flyweight-----



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






//            List<SomeClass> some = List.of(new SomeClass("first"), new SomeClass("second"), new SomeClass("third"));
//            Iterator<SomeClass> iterator = some.iterator();
//            while (iterator.hasNext()){
//                SomeClass someClass = iterator.next();
//                System.out.println(someClass.getName());
//            }
//            --------iterator pattern------






//            Restaurant restaurant = new Restaurant();
//            Waiter waiter = new WaiterImpl(restaurant);
//
//            Client firstClient = new Client("Alex", waiter);
//            Client secondClient = new Client("Vasyl", waiter);
//
//            firstClient.placeOrder("HotDog");
//            secondClient.placeOrder("Pizza");
//
//            restaurant.prepareFood("HotDog");
//            restaurant.prepareFood("Pizza");
//
//            waiter.serveOrder("HotDog", firstClient);
//            waiter.serveOrder("Pizza", secondClient);
//
//            firstClient.eat();
//            secondClient.eat();
//            -------mediator pattern








//            CoffeeMachine coffeeMachine = new CoffeeMachine();
//            CoffeeMachineHistory history = new CoffeeMachineHistory();
//
//            coffeeMachine.setCoffeeType("Espresso");
//
//            history.addMemento(coffeeMachine.saveStateToMemento());
//
//            coffeeMachine.setCoffeeType("Latte");
//
//            history.addMemento(coffeeMachine.saveStateToMemento());
//
//            coffeeMachine.restoreStateFromMemento(history.getMemento(0));
//            System.out.println("Current Coffee Type: " + coffeeMachine.getCoffeeType());
//            --------memento




//            Breakfast beckonBreakfast = new BeckonBreakfast();
//            Breakfast sausageBreakfast = new SausageBreakfast();
//
//            System.out.println("Preparing beckon breakfast:");
//            beckonBreakfast.prepareBreakfast();
//
//            System.out.println("\nPreparing sausage breakfast:");
//            sausageBreakfast.prepareBreakfast();
//            -------template pattern



























        };
    }

}
