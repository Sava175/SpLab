package com.splab;


//import com.splab.patterns.behavioralPatterns.mediator.*;
//import com.splab.patterns.behavioralPatterns.memento.*;
//import com.splab.patterns.behavioralPatterns.observer.*;
//import com.splab.patterns.behavioralPatterns.strategy.*;
//import com.splab.patterns.behavioralPatterns.template.*;


import com.splab.patterns.creationPatterns.builder.*;


public class SpLabApplication {

    public static void main(String[] args) {




//        ServiceHandler oilChangeHandler = new OilChangeHandler();
//        ServiceHandler tireRotationHandler = new TireRotationHandler();
//        ServiceHandler engineDiagnosticHandler = new EngineDiagnosticHandler();
//
//        oilChangeHandler.setNextHandler(tireRotationHandler);
//        tireRotationHandler.setNextHandler(engineDiagnosticHandler);
//
//        String requestedService = "Tire Rotation";
//        oilChangeHandler.performService(requestedService);
//            -------chain of Responsobility






//        Car car = new Car();
//        StartCarCommand startCommand = new StartCarCommand(car);
//        StopCarCommand stopCommand = new StopCarCommand(car);
//        RemoteControl remote = new RemoteControl();
//        remote.setCommand(startCommand);
//        remote.pressButton();
//        remote.setCommand(stopCommand);
//        remote.pressButton();
//            -------command pattern








//        MenuPosition hotDog = new MenuPosition("hotDog", 5);
//        MenuPosition juice = new MenuPosition("juice", 4);
//        MenuPosition pizza = new MenuPosition("pizza", 7);
//        MenuPosition[] menuItems = {hotDog, juice, pizza};
//
//        RestaurantMenu restaurantMenu = new RestaurantMenu(menuItems);
//
//
//        while (restaurantMenu.hasNext()) {
//            MenuPosition menuPosition = restaurantMenu.next();
//            System.out.println("the price of " +menuPosition.getName() + " is " + menuPosition.getPrice());
//        }
//            --------iterator pattern
        // rewrote - done







//        Restaurant restaurant = new Restaurant();
//        Waiter waiter = new WaiterImpl(restaurant);
//
//        Client firstClient = new Client("Alex", waiter);
//        Client secondClient = new Client("Vasyl", waiter);
//
//        firstClient.placeOrder("HotDog");
//        secondClient.placeOrder("Pizza");
//
//        restaurant.prepareFood("HotDog");
//        restaurant.prepareFood("Pizza");
//
//        waiter.serveOrder("HotDog", firstClient);
//        waiter.serveOrder("Pizza", secondClient);
//
//        firstClient.eat();
//        secondClient.eat();
//            -------mediator pattern





//        CoffeeMachine coffeeMachine = new CoffeeMachine();
//        CoffeeMachineHistory history = new CoffeeMachineHistory();
//
//        coffeeMachine.setCoffeeType("Espresso");
//        coffeeMachine.setCoffeeType(history.getMemento(1).getState());
//
//        history.addMemento(coffeeMachine.saveStateToMemento());
//
//        coffeeMachine.setCoffeeType("Latte");
//
//        history.addMemento(coffeeMachine.saveStateToMemento());
//
//        coffeeMachine.restoreStateFromMemento(history.getMemento(0));
//        System.out.println("Current Coffee Type: " + coffeeMachine.getCoffeeType());
//            --------memento





//        NewsAgency newsAgency = new NewsAgency();
//        NewsChannel channel1 = new NewsChannel("first");
//        NewsChannel channel2 = new NewsChannel("second");
//
//        newsAgency.addObserver(channel1);
//        newsAgency.addObserver(channel2);
//
//        newsAgency.setNews("everything is good");
//        newsAgency.setNews("and now is much more better");
//
//        newsAgency.setNews("now everything s just super");
//        System.out.println(newsAgency.getObservers());
//            ----------observer






//        int[] numbers = {34, 6, 72, 3, 49, 67, 0, 98, 98, 6, 98, 34};
//        Sorter sorter = new Sorter();
//        sorter.setSortingStrategy(new BubbleSort());
//        sorter.performSort(numbers);
//        System.out.println(Arrays.toString(numbers));
//
//        int[] otherNumbers = {34, 6, 72, 3, 49, 67, 0, 98, 98, 6, 98, 34};
//        sorter.setSortingStrategy(new SelectionSort());
//        sorter.performSort(otherNumbers);
//        System.out.println(Arrays.toString(otherNumbers));
//            -----------strategy





//        Breakfast beckonBreakfast = new BeckonBreakfast();
//        Breakfast sausageBreakfast = new SausageBreakfast();
//
//        System.out.println("Preparing beckon breakfast:");
//        beckonBreakfast.prepareBreakfast();
//
//        System.out.println("\nPreparing sausage breakfast:");
//        sausageBreakfast.prepareBreakfast();
//        -------template





//        IceCreamLover iceCreamClient = new IceCreamLover();
//        iceCreamClient.enjoyIceCream(new AppleIceFactory());
//        iceCreamClient.enjoyIceCream(new ChocoIceFactory());
//            --------abstractFactory






//        HotDog food = new HotDog.FoodBuilder()
//                .setBun("Steak")
//                .setSide("Mashed Potatoes")
//                .setToAdd("Red Wine")
//                .setCost(5)
//                .build();
//
//        System.out.println(food);
//            -------builder------- create myself
        //done





//        Company useJava = new JavaCompany();
//        Programmer javist = useJava.createProgrammer();
//        System.out.print("javist ");
//        javist.languageType();
//
//        Company useTS = new TSCompany();
//        Programmer TSist = useTS.createProgrammer();
//        System.out.print("TSist ");
//        TSist.languageType();
//            ----------Factory method





//        TShirt xlSize = new TShirt("black", "for the best man", 35);
//        TShirt cloneThat = xlSize.copy();
//        cloneThat.setColor("Red");
//        System.out.println(xlSize);
//        System.out.println(cloneThat);
//            -------prototype






//        ProductionManager firstManager = ProductionManager.getInstance("Ali", "Baba");
//        firstManager.manageProduction();
//
//        ProductionManager secondManager = ProductionManager.getInstance("Huba", "Buba");
//        secondManager.manageProduction();
//            --------------this is example of singleton





//        OldUser oldUser = new OldUser("Alex", 35);
//        NewUser adapter = new UserAdapter(oldUser);
//        System.out.println("User Name: " + adapter.getUserName());
//        System.out.println("Age: " + adapter.getAge());
//            ------adapter





//        DishToOrder borscht = new Borscht(new UkrainianCuisine());
//        DishToOrder sausage = new Sausage(new GermanCuisine());
//        borscht.makeOrder();
//        sausage.makeOrder();
//            -------bridge pattern





//        ToDrink cola = new ToDrink("cola");
//        ToEat chocolate = new ToEat("chocolate");
//        Oder table1 = new Oder(List.of(cola, chocolate));
//        System.out.println(table1);
//            --------composite
        //to read





//        BasicHDog basicHDog = new BasicHDog();
//        System.out.println(basicHDog.getIngredients());
//        HotDog onionHDog = new OnionHDog(basicHDog);
//        HotDog pigHDog = new PigHDog(onionHDog);
//
//        System.out.println(onionHDog.getIngredients());
//        System.out.println(pigHDog.getIngredients());
//            ---------Decorator pattern






//        Office office = new Office();
//        office.getRooms().addAll(List.of(new Toilet(), new Kitchen(), new WorkCabinet()));
//        for (Room room : office.getRooms()) {
//            room.roomPurpose();
//        }
//            -------facade
        // -----read more   rebuild





//        Person first = Person.createPerson("Alex", "Dev");
//        Person second = Person.createPerson("Vasyl", "Dev");
//        System.out.println(first);
//        System.out.println(second);
//            -----flyweight-----
        // read again






//        FoodOrder foodOrder1 = new FoodOrderProxy("Burger");
//        FoodOrder foodOrder2 = new FoodOrderProxy("Sushi");
//        foodOrder1.deliver();
//        foodOrder2.deliver();
//            -----proxy
    }






            /*
            diagrams
            delete spring
            exp what for
            add interfaces
             */


}
