package br.com.example.order.action;

import br.com.example.order.Order;

public class OrderLog implements ActionAfterGenerateOrder{

    @Override
    public void executeAction(Order order) {
        System.out.println("Order was generated :::" + order);
    }
}
