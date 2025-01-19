package com.rattencorp.pizzajsp.model.menue;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
@Named
public class PizzaMenu implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private final List<PizzaType> menuPizzaTypes;

    public PizzaMenu() {
        menuPizzaTypes = new ArrayList<>();
        menuPizzaTypes.add(new PizzaType("BasicPizza", 999, true,false));
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
