package com.rattencorp.pizzajsp.model.order;

import jakarta.enterprise.context.SessionScoped;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SessionScoped
public class CurrentOrder implements Serializable {

    private final List<OrderedPizza> pizzas;

    private final PizzaCustomer customer;

    public CurrentOrder() {
        pizzas = new ArrayList<>();
        customer = new PizzaCustomer();
    }

    public List<OrderedPizza> getPizzas() {
        return Collections.unmodifiableList(pizzas);
    }

    public void addPizza(OrderedPizza pizza) {
        pizzas.add(pizza);
    }

    public void removePizza(OrderedPizza pizza) {
        pizzas.remove(pizza);
    }

    public double price(){
        return ((double) pizzas
                .stream()
                .mapToInt(OrderedPizza::getPrice)
                .sum())/100.0;
    }

    public PizzaCustomer getCustomer() {
        return customer;
    }

}
