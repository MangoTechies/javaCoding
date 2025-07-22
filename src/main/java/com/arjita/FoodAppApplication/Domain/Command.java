package com.arjita.FoodAppApplication.Domain;


import com.arjita.FoodAppApplication.infra.OrderManager;

public interface Command {
    void execute(OrderManager orderManager);
    long getTimeStamp();
}
