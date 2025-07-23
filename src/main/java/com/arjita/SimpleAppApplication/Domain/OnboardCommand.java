//package com.arjita.SimpleAppApplication.Domain;
//
//import com.arjita.SimpleAppApplication.infra.OrderManager;
//
//import java.util.Map;
//
//public abstract class OnboardCommand implements Command {
//    private final String name;
//    private final Map<String, Double> menu;
//    private final int capacity;
//    private final long timestamp;
//
//    public OnboardCommand(String name, Map<String, Double> menu, int capacity, long timestamp) {
//        this.name = name;
//        this.menu = menu;
//        this.capacity = capacity;
//        this.timestamp = timestamp;
//    }
//
//    public void execute(OrderManager manager) {
//        manager.onboardRestaurant(name, menu, capacity);
//    }
//}
