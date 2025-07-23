//package com.arjita.SimpleAppApplication.infra;
//
//import com.arjita.SimpleAppApplication.Domain.Order;
//import com.arjita.SimpleAppApplication.Domain.Restaurant;
//import com.arjita.SimpleAppApplication.Domain.RestaurantSelectionStrategy;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//
//@Component
//public class OrderManager {
//    private final List<Restaurant> restaurants = new ArrayList<>();
//    private final List<Order> allOrders = new ArrayList<>();
//    private final List<Order> dispatchedOrders = new ArrayList<>();
//    private final RestaurantSelectionStrategy selectionStrategy;
//
//    public OrderManager(RestaurantSelectionStrategy selectionStrategy) {
//        this.selectionStrategy = selectionStrategy;
//    }
//
//    public void onboardRestaurant(String name, Map<String, Double> menu, int capacity) {
//        restaurants.add(new Restaurant(name, menu, capacity));
//    }
//
//    public void updateMenu(String restaurantName, String item, double price) {
//        restaurants.stream().filter(r -> r.getName().equals(restaurantName)).findFirst()
//                .ifPresent(r -> r.updateMenu(item, price));
//    }
//
//    public Order placeOrder(Map<String, Integer> items, long timestamp) {
//        Restaurant selected = selectionStrategy.select(restaurants, items);
//        if (selected == null) return null;
//        Order order = new Order(items, selected, timestamp);
//        selected.acceptOrder(order);
//        allOrders.add(order);
//        return order;
//    }
//
//    public void dispatchOrder(int orderId) {
//        allOrders.stream().filter(o -> o.getId() == orderId && !o.isDispatched()).findFirst()
//                .ifPresent(o -> {
//                    o.setDispatched(true);
//                    o.getRestaurant().dispatchOrder();
//                    dispatchedOrders.add(o);
//                });
//    }
//
//    public List<Order> getDispatchedOrders() {
//        return dispatchedOrders;
//    }
//}