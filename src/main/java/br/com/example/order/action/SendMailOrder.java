package br.com.example.order.action;

import br.com.example.order.Order;

public class SendMailOrder implements ActionAfterGenerateOrder{
    public void executeAction(Order order){
        System.out.println("Sending email with order data ::: " + order);
    }
}
