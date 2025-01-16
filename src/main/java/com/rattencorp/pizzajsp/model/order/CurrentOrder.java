package com.rattencorp.pizzajsp.model.order;

import com.rattencorp.pizzajsp.model.menue.PizzaType;
import jakarta.enterprise.context.SessionScoped;

import java.io.Serializable;
import java.util.*;

@SessionScoped
public class CurrentOrder implements Serializable {

    private final List<OrderedPizza> pizzas;

    private final Map<PizzaType, Integer> orderedTypes;

    private final PizzaCustomer customer;

    public CurrentOrder() {
        pizzas = new ArrayList<>();
        orderedTypes = new HashMap<>();
        customer = new PizzaCustomer();
    }

    public List<OrderedPizza> getPizzas() {
        return Collections.unmodifiableList(pizzas);
    }

    public void addPizza(OrderedPizza pizza) {
        pizzas.add(pizza);
        orderedTypes.compute(pizza.getPizzaType(), (k, v) -> v == null ? 1 : v + 1);
    }

    public void removePizza(OrderedPizza pizza) {
        if (pizzas.remove(pizza))
            orderedTypes.computeIfPresent(pizza.getPizzaType(), (k, v) -> v-1);
    }

    public Integer getOrderedAmountForType(PizzaType type) {
        return orderedTypes.getOrDefault(type, 0);
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
