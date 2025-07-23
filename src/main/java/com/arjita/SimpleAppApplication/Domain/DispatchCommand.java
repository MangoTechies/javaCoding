//package com.arjita.SimpleAppApplication.Domain;
//
//import com.arjita.SimpleAppApplication.infra.OrderManager;
//import lombok.Getter;
//
//public abstract class DispatchCommand implements Command {
//    private final int orderId;
//    @Getter
//    private final long timestamp;
//
//    public DispatchCommand(int orderId, long timestamp) {
//        this.orderId = orderId;
//        this.timestamp = timestamp;
//    }
//
//    public void execute(OrderManager manager) {
//        manager.dispatchOrder(orderId);
//    }
//}
