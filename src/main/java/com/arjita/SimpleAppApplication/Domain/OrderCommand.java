//package com.arjita.SimpleAppApplication.Domain;
//
//import com.arjita.SimpleAppApplication.infra.OrderManager;
//import org.hibernate.mapping.Map;
//
//public class OrderCommand implements Command {
//    private final Map<String, Integer> items;
//    private final long timestamp;
//    private final Restaurant restaurant;
//
//    public OrderCommand(Restaurant restaurant,Map<String, Integer> items, long timestamp) {
//        this.items = items;
//        this.restaurant = restaurant;
//        this.timestamp = timestamp;
//    }
//
//    public void execute(OrderManager manager) {
//        manager.placeOrder(items, timestamp);
//    }
//
//    public long getTimestamp() { return timestamp; }
//}
