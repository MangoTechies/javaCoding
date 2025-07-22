package com.arjita.FoodAppApplication.Domain;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class FirstAvailableStrategy implements RestaurantSelectionStrategy {
    public Restaurant select(List<Restaurant> restaurants, Map<String, Integer> items) {
        return restaurants.stream().filter(r -> r.canAcceptOrder(items)).findFirst().orElse(null);
    }
}
