package com.arjita.FoodAppApplication.Domain;

import java.util.List;
import java.util.Map;

public interface RestaurantSelectionStrategy {
    Restaurant select(List<Restaurant> restaurants, Map<String, Integer> items);
}
