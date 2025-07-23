//package com.arjita.SimpleAppApplication.Controller;
//
//import com.arjita.SimpleAppApplication.Domain.Order;
//import com.arjita.SimpleAppApplication.infra.OrderManager;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/v1/eaton")
//class FoodController {
//    private final OrderManager orderManager;
//
//    public FoodController(OrderManager orderManager) {
//        this.orderManager = orderManager;
//    }
//
//    @PostMapping("/restaurant")
//    public void onboardRestaurant(@RequestBody Map<String, Object> payload) {
//        String name = (String) payload.get("name");
//        int capacity = (int) payload.get("capacity");
//        Map<String, Double> menu = (Map<String, Double>) payload.get("menu");
//        orderManager.onboardRestaurant(name, menu, capacity);
//    }
//
//    @PostMapping("/menu")
//    public void updateMenu(@RequestParam String restaurant, @RequestParam String item, @RequestParam double price) {
//        orderManager.updateMenu(restaurant, item, price);
//    }
//
////    @PostMapping("/order")
////    public Order placeOrder(@RequestBody Map<String, Object> payload) {
////        Map<String, Integer> items = (Map<String, Integer>) payload.get("items");
////        long timestamp = ((Number) payload.get("timestamp")).longValue();
////        return orderManager.placeOrder(items, timestamp);
////    }
//
//    @PostMapping("/dispatch")
//    public void dispatchOrder(@RequestParam int orderId) {
//        orderManager.dispatchOrder(orderId);
//    }
//
//    @GetMapping("/dispatched")
//    public List<Order> getDispatchedOrders() {
//        return orderManager.getDispatchedOrders();
//    }
//}