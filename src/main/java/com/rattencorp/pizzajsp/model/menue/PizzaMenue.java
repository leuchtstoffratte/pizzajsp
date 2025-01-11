package com.rattencorp.pizzajsp.model.menue;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class PizzaMenue {

    private final List<PizzaType> menuePizzaTypes;

    public PizzaMenue() {
        menuePizzaTypes = new ArrayList<>();
    }


    public void addPizzaType(PizzaType pizzaType) {
        menuePizzaTypes.add(pizzaType);
    }

    public void removePizzaType(PizzaType pizzaType) {
        menuePizzaTypes.remove(pizzaType);
    }

    public List<PizzaType> getMenuePizzaTypes() {
        return menuePizzaTypes;
    }

}
