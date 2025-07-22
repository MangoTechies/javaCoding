package com.arjita.FoodAppApplication.Domain;

import java.util.HashMap;
import java.util.Map;

public class Restaurant {
    private final String name;
    private final Map<String, Double> menu = new HashMap<>();
    private final Map<String, Integer> itemsServed = new HashMap<>();
    private final int maxOrders;
    private int currentOrders = 0;

    public Restaurant(String name, Map<String, Double> menu, int maxOrders) {
        this.name = name;
        this.menu.putAll(menu);
        this.maxOrders = maxOrders;
    }

    public String getName() { return name; }

    public void updateMenu(String item, double price) {
        menu.put(item, price);
    }

    public boolean canAcceptOrder(Map<String, Integer> items) {
        if (currentOrders >= maxOrders) return false;
        return items.keySet().stream().allMatch(menu::containsKey);
    }

    public void acceptOrder(Order order) {
        currentOrders++;
        for (String item : order.getItems().keySet()) {
            itemsServed.put(item, itemsServed.getOrDefault(item, 0) + order.getItems().get(item));
        }
    }

    public void dispatchOrder() {
        if (currentOrders > 0) currentOrders--;
    }

    public Map<String, Double> getMenu() { return menu; }
    public Map<String, Integer> getItemsServed() { return itemsServed; }
}