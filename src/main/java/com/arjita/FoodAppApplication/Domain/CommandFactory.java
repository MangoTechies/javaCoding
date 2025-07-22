package com.arjita.FoodAppApplication.Domain;

import com.arjita.FoodAppApplication.infra.EmployeeRepository;
import com.arjita.FoodAppApplication.infra.OrderManager;

public class CommandFactory {
    public static Command createCommand(String commandType, Map<String, Object> payload) {
        switch (commandType) {
            case "onboard":
                return new OnboardCommand(payload.get("name"), (Map<String, Double>) payload.get("menu"), (int) payload.get("maxOrders"), (long) payload.get("timestamp") );
            case "order":
                return new OrderCommand(payload.get("restaurant"), (Map<String, Integer>) payload.get("items"), (long) payload.get("timestamp"));
             case "dispatch":
                 return new DispatchCommand((String) payload.get("orderId"), (long) payload.get("timestamp"));
            default:
                throw new IllegalArgumentException("Unsupported command type: " + commandType);
        }
    }
}
