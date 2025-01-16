package com.rattencorp.pizzajsp.model.menue;

import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class PizzaMenu {

    private final List<PizzaType> menuPizzaTypes;

    public PizzaMenu() {
        menuPizzaTypes = new ArrayList<>();
    }


    public void addPizzaType(PizzaType pizzaType) {
        menuPizzaTypes.add(pizzaType);
    }

    public void removePizzaType(PizzaType pizzaType) {
        menuPizzaTypes.remove(pizzaType);
    }

    public List<PizzaType> getMenuPizzaTypes() {
        return menuPizzaTypes;
    }


}
