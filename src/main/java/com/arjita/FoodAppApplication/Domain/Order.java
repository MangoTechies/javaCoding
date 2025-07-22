package com.arjita.FoodAppApplication.Domain;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Order {
    private static final AtomicInteger ID_GENERATOR = new AtomicInteger();
    private final int id;
    private final Map<String, Integer> items = new HashMap<>();
    private final Restaurant restaurant;
    private final long timestamp;
    private boolean dispatched = false;

    public Order(Map<String, Integer> items, Restaurant restaurant, long timestamp) {
        this.id = ID_GENERATOR.incrementAndGet();
        this.items = items;
        this.restaurant = restaurant;
        this.timestamp = timestamp;
    }

    public int getId() { return id; }
    public Map<String, Integer> getItems() { return items; }
    public Restaurant getRestaurant() { return restaurant; }
    public long getTimestamp() { return timestamp; }
    public boolean isDispatched() { return dispatched; }
    public void setDispatched(boolean dispatched) { this.dispatched = dispatched; }
}